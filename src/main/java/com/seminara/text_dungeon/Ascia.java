package com.seminara.text_dungeon;

public class Ascia implements Arma {
    private final Pietra pietra;
    private final float danno;

    public Ascia(Pietra p) {
        this.pietra = p;
        danno = generaDanno();
    }

    @Override
    public String getTipo() {
        return "Ascia con " + nomePietra();
    }

    private String nomePietra() {
        return pietra.getTipo();
    }

    @Override
    public float getDanno() {
        return danno * pietra.moltiplicatoreDanno();
    }

    private float generaDanno() {
        return (float) Math.random() * (50-20+1) + 20;
    }
    
}