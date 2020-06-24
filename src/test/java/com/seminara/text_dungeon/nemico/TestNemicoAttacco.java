package com.seminara.text_dungeon.nemico;

import com.seminara.text_dungeon.stato_combattimento.GeneraStato;

public class TestNemicoAttacco extends Nemico {

    public TestNemicoAttacco() {
        tipo = "TestAttacco";
        stato = GeneraStato.generaStato("0");
        vita = 200f;
        minDanno = 10;
        maxDanno = 50;
    }

    @Override
    public void setStatoCombattimento() {}
    
}