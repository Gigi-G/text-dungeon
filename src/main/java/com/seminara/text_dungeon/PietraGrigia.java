package com.seminara.text_dungeon;

public class PietraGrigia implements Pietra {

    @Override
    public String getTipo() {
        return "Pietra Grigia";
    }

    @Override
    public float moltiplicatoreDanno() {
        return 1f;
    }
}