package com.seminara.text_dungeon.nemico;

import com.seminara.text_dungeon.stato_personaggio.Attacco;

public class Goblin extends Nemico {

    public Goblin() {
        tipo = "Goblin";
        vita = 80f;
        stato = new Attacco();
        min = 5;
        max = 20;
    }
    
}