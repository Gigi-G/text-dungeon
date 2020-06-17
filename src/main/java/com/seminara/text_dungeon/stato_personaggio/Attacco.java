package com.seminara.text_dungeon.stato_personaggio;

public class Attacco implements IStatoPersonaggio {

    @Override
    public String mostra() {
        return "Attacco";
    }

    @Override
    public float infliggiDanno(float danno) {
        return danno;
    }
    
}