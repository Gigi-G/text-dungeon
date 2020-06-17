package com.seminara.text_dungeon.stato_personaggio;

public class Difesa implements IStatoPersonaggio {

    @Override
    public String mostra() {
        return "Difesa";
    }

    @Override
    public float affliggiDanno(float danno) {
        return danno*(float) Math.random() * (2f - 0.5f) + 0.5f;
    }
    
}