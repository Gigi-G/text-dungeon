package com.seminara.text_dungeon.pietra;

public class PietraGrigia implements IPietra {

    @Override
    public String getTipo() {
        return "Pietra Grigia";
    }

    @Override
    public float moltiplicatoreDanno() {
        return 1f;
    }
}