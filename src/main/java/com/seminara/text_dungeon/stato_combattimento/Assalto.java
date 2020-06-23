package com.seminara.text_dungeon.stato_combattimento;

public class Assalto implements IStatoCombattimento {

    @Override
    public String mostra() {
        return "Assalto";
    }

    @Override
    public float infliggiDanno(float danno) {
        return danno/2f;
    }
    
}