package com.seminara.text_dungeon.stato_personaggio;

public class Assalto implements StatoPersonaggio {

    @Override
    public String mostra() {
        return "Assalto";
    }

    @Override
    public float affliggiDanno(float danno) {
        return danno/2f;
    }
    
}