package com.seminara.text_dungeon.nemico;

public interface INemico {
    public String getNome();
    public void applicaDanno(float danno);
    public float affliggiDanno();
    public boolean isSconfitto();
    public float getVita();
    public void setStatoCombattimento();
    public String getStatoCombattimento();
}