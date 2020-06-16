package com.seminara.text_dungeon.nemico;

public class Strega implements Nemico {
    private float vita;

    public Strega() {
        vita = 450f;
    }

    @Override
    public String getNome() {
        return "Strega";
    }

    @Override
    public void applicaDanno(float danno) {
        vita -= danno;
    }

    @Override
    public float affliggiDanno() {
        return (float) Math.random()*(90-40+1) + 40;
    }

    @Override
    public boolean isSconfitto() {
        return 0 >= vita;
    }

    @Override
    public float getVita() {
        return vita;
    }

    @Override
    public int getStatoCombattimento() {
        return Math.round((float) Math.random()*2);
    }
}