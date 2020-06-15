package com.seminara.text_dungeon.pietra;

public class PietraNera implements Pietra {

    @Override
    public String getTipo() {
        return "Pietra Nera";
    }

    @Override
    public float moltiplicatoreDanno() {
        if  (probabilitaAumentoDanno())
            return 1.25f;

        return 1f;
    }
    
    private boolean probabilitaAumentoDanno() {
        return Math.random() <= 0.75d;
    }
}