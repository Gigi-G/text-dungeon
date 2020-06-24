package com.seminara.text_dungeon.nemico;

import com.seminara.text_dungeon.stato_combattimento.GeneraStato;

public class TestNemicoDifesa extends Nemico {
    
    public TestNemicoDifesa() {
        tipo = "TestDifesa";
        stato = GeneraStato.generaStato("2");
        vita = 200f;
        minDanno = 10;
        maxDanno = 50;
    }

    @Override
    public void setStatoCombattimento() {}

}