package com.seminara.text_dungeon.nemico;

import com.seminara.text_dungeon.stato_personaggio.Attacco;

public class Strega extends Nemico {

    public Strega() {
        tipo = "Strega";
        vita = 450f;
        stato = new Attacco();
        min = 40;
        max = 90;
    }
}