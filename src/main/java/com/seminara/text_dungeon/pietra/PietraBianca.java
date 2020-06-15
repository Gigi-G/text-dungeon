package com.seminara.text_dungeon.pietra;

public class PietraBianca implements Pietra {

    @Override
    public String getTipo() {
        return "Pietra Bianca";
    }

    @Override
    public float moltiplicatoreDanno() {
        if  (probabilitaAumentoDanno()) 
            return 1.10f;

        return 1f;
    }

    private boolean probabilitaAumentoDanno() {
        return Math.random() <= 0.15d;
    }
    
}