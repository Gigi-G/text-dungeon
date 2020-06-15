package com.seminara.text_dungeon.armeria;
import com.seminara.text_dungeon.pietra.*;

public class Spada implements Arma {
    private final Pietra pietra;
    private final float danno;
    
    public Spada(Pietra p) {
        this.pietra = p;
        danno = generaDanno();
    }

    @Override
    public String getTipo() {
        return "Spada con " + nomePietra();
    }

    private String nomePietra() {
        return pietra.getTipo();
    }

    @Override
    public float getDanno() {
        return danno * pietra.moltiplicatoreDanno();
    }

    private float generaDanno() {
        return (float) Math.random() * (60-5+1) + 5;
    }
}