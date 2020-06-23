package com.seminara.text_dungeon.stato_combattimento;

public class Attacco implements IStatoCombattimento {

    @Override
    public String mostra() {
        return "Attacco";
    }

    @Override
    public float infliggiDanno(float danno) {
        return danno;
    }
    
}