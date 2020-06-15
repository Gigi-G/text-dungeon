package com.seminara.text_dungeon.nemico;

public class Goblin implements Nemico {
    private float vita;

    public Goblin() {
        vita = 80f;
    }

    @Override
    public String getNome() {
        return "Goblin";
    }

    @Override
    public void applicaDanno(float danno) {
        vita -= danno;
    }

    @Override
    public float affliggiDanno() {
        return (float) Math.random()*(20-5+1) + 5;
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