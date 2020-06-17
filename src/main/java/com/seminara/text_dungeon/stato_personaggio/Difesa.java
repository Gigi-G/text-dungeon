package com.seminara.text_dungeon.stato_personaggio;

public class Difesa implements IStatoPersonaggio {

    @Override
    public String mostra() {
        return "Difesa";
    }

    @Override
    public float infliggiDanno(float danno) {
        return danno/((float) Math.random() * 2 + 1);
    }
    
}