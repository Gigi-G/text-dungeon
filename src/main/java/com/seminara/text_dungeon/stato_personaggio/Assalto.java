package com.seminara.text_dungeon.stato_personaggio;

public class Assalto implements IStatoPersonaggio {

    @Override
    public String mostra() {
        return "Assalto";
    }

    @Override
    public float infliggiDanno(float danno) {
        return danno/2f;
    }
    
}