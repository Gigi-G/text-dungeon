package com.seminara.text_dungeon.nemico;

import com.seminara.text_dungeon.stato_combattimento.GeneraStato;

public class TestNemicoAssalto extends Nemico {
    
    public TestNemicoAssalto() {
        tipo = "TestAssalto";
        stato = GeneraStato.generaStato("1");
        vita = 200f;
        min = 10;
        max = 50;
    }

    @Override
    public void setStatoCombattimento() {}

}