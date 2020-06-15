package com.seminara.text_dungeon;

public interface Nemico {
    public String getNome();
    public void applicaDanno(float danno);
    public float affliggiDanno();
    public boolean isSconfitto();
    public float getVita();
}