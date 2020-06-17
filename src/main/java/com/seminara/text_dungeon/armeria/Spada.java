package com.seminara.text_dungeon.armeria;
import com.seminara.text_dungeon.pietra.*;

public class Spada extends Arma {
    
    public Spada(Pietra p) {
        pietra = p;
        maxDanno = 60;
        minDanno = 5;
        danno = generaDanno();
        tipo = "Spada";
    }

}