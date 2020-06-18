package com.seminara.text_dungeon.nemico;

import com.seminara.text_dungeon.stato_personaggio.GeneraStato;

public class TestNemicoDifesa extends Nemico {
    
    public TestNemicoDifesa() {
        tipo = "TestDifesa";
        stato = GeneraStato.generaStato("2");
        vita = 200f;
        min = 10;
        max = 50;
    }

    @Override
    public void setStatoCombattimento() {}

}