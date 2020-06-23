package com.seminara.text_dungeon.stato_combattimento;

public class Difesa implements IStatoCombattimento {

    @Override
    public String mostra() {
        return "Difesa";
    }

    @Override
    public float infliggiDanno(float danno) {
        return danno/((float) Math.random() * 2 + 1);
    }
    
}