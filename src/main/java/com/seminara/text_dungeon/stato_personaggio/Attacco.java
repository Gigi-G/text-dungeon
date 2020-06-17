package com.seminara.text_dungeon.stato_personaggio;

public class Attacco implements StatoPersonaggio {

    @Override
    public String mostra() {
        return "Attacco";
    }

    @Override
    public float affliggiDanno(float danno) {
        return danno;
    }
    
}