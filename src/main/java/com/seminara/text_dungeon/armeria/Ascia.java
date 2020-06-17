package com.seminara.text_dungeon.armeria;
import com.seminara.text_dungeon.pietra.*;

public class Ascia extends Arma {

    public Ascia(IPietra p) {
        pietra = p;
        maxDanno = 50;
        minDanno = 20;
        danno = generaDanno();
        tipo = "Ascia";
    }
    
}