package com.seminara.text_dungeon.nemico;

import com.seminara.text_dungeon.stato_personaggio.Attacco;

public class Ciclope extends Nemico {
    
    public Ciclope() {
        tipo = "Ciclope";
        vita = 500f;
        stato = new Attacco();
        min = 50;
        max = 100;
    }
    
}