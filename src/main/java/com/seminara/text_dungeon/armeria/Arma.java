package com.seminara.text_dungeon.armeria;

import com.seminara.text_dungeon.pietra.Pietra;

public abstract class Arma implements IArma {
    protected Pietra pietra;
    protected float danno;
    protected String tipo;
    protected int minDanno;
    protected int maxDanno;
    
    @Override
    public String getTipo() {
        return tipo + " con " + nomePietra();
    }

    private String nomePietra() {
        return pietra.getTipo();
    }

    @Override
    public float getDanno() {
        return danno * pietra.moltiplicatoreDanno();
    }

    protected float generaDanno() {
        return (float) Math.random() * (maxDanno-minDanno+1) + minDanno;
    }
}