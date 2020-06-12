package com.seminara.text_dungeon;

public class Mannaia implements Arma {
    private final Pietra pietra;
    private final float danno;

    public Mannaia(Pietra p) {
        this.pietra = p;
        danno = generaDanno();
    }

    @Override
    public String getTipo() {
        return "Mannaia con " + nomePietra();
    }

    private String nomePietra() {
        return pietra.getTipo();
    }

    @Override
    public float getDanno() {
        return danno * pietra.moltiplicatoreDanno();
    }

    @Override
    public float generaDanno() {
        return (float) Math.random() * (40-10+1) + 10;
    }
    
}