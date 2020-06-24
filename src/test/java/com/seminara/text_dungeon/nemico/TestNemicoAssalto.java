package com.seminara.text_dungeon.nemico;

import com.seminara.text_dungeon.stato_combattimento.GeneraStato;

public class TestNemicoAssalto extends Nemico {
    
    public TestNemicoAssalto() {
        tipo = "TestAssalto";
        stato = GeneraStato.generaStato("1");
        vita = 200f;
        minDanno = 10;
        maxDanno = 50;
    }

    @Override
    public void setStatoCombattimento() {}

}