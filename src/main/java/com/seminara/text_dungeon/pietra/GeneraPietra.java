package com.seminara.text_dungeon.pietra;

import java.util.List;
import java.util.function.Function;

public class GeneraPietra {
    private static List<Function<Float, IPietra>> genera = List.of( x -> (x >= 0f && x <= 0.74f)?new PietraGrigia():null, 
                                                             x -> (x >= 0.75f && x <= 0.89f)?new PietraBianca():null, 
                                                             x -> (x >= 0.90f)?new PietraNera():null);
    private static float rand;
    private static IPietra pietra;

    private GeneraPietra() {}

    public static IPietra getPietra() {
        rand = calcolaProbabilita();
        
        genera.parallelStream()
                .forEach(x -> {
                    IPietra p = x.apply(rand);
                    if  (null != p) 
                        pietra = p;
                });

        return pietra;
    }

    private static float calcolaProbabilita() {
        return (float) Math.random();
    }

    protected static float getRand() {
        return rand;
    }
}