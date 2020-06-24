package com.seminara.text_dungeon.armeria;

import com.seminara.text_dungeon.pietra.IPietra;

public class Arma implements IArma {
    protected IPietra pietra;
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