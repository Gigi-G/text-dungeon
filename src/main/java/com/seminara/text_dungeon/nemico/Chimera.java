package com.seminara.text_dungeon.nemico;

import com.seminara.text_dungeon.stato_personaggio.Attacco;

public class Chimera extends Nemico {

    public Chimera() {
        tipo = "Chimera";
        vita = 250f;
        stato = new Attacco();
        min = 20;
        max = 80;
    }

}