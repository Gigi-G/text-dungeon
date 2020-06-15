package com.seminara.text_dungeon;

public class Ciclope implements Nemico {
    private float vita;
    
    public Ciclope() {
        vita = 500f;
    }

    @Override
    public String getNome() {
        return "Ciclope";
    }

    @Override
    public void applicaDanno(float danno) {
        vita -= danno;
    }

    @Override
    public float affliggiDanno() {
        return (float) Math.random()*(100-50+1) + 50;
    }

    @Override
    public boolean isSconfitto() {
        return 0 >= vita;
    }

    @Override
    public float getVita() {
        return vita;
    }
    
}