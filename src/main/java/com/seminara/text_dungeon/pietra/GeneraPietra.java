package com.seminara.text_dungeon.pietra;

import java.util.List;
import java.util.function.Function;

public class GeneraPietra {
    private List<Function<Float, IPietra>> genera; 
    private IPietra pietra;
    private float rand;
    private static GeneraPietra instance;
    
    private GeneraPietra() {
        genera = List.of( x -> (x >= 0f && x <= 0.74f)?new PietraGrigia():null, 
                                x -> (x >= 0.75f && x <= 0.89f)?new PietraBianca():null, 
                                x -> (x >= 0.90f)?new PietraNera():null);
    }

    public static GeneraPietra getInstance() {
        if  (null == instance) instance = new GeneraPietra();
        return instance;
    }

    public IPietra getPietra() {
        rand = calcolaProbabilita();
        
        genera.parallelStream()
                .forEach(x -> {
                    IPietra p = x.apply(rand);
                    if  (null != p) 
                        pietra = p;
                });

        return pietra;
    }

    private float calcolaProbabilita() {
        return (float) Math.random();
    }

    protected float getRand() { 
        return rand;
    }
}