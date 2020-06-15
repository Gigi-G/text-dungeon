package com.seminara.text_dungeon.nemico;

public class Chimera implements Nemico {
    private float vita;

    public Chimera() {
        vita = 250f;
    }

    @Override
    public String getNome() {
        return "Chimera";
    }

    @Override
    public void applicaDanno(float danno) {
        vita -= danno;
    }

    @Override
    public float affliggiDanno() {
        return (float) Math.random()*(80-20+1) + 20;
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