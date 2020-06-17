package com.seminara.text_dungeon.armeria;
import com.seminara.text_dungeon.pietra.*;

public class Mannaia extends Arma {

    public Mannaia(Pietra p) {
        pietra = p;
        maxDanno = 40;
        minDanno = 10;
        danno = generaDanno();
        tipo = "Mannaia";
    }
    
}