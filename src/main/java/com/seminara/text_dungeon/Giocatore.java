package com.seminara.text_dungeon;

public class Giocatore {
    private float vita;
    private Arma arma;
    private static Giocatore instance;

    private Giocatore() {
        vita = 300f;
    }

    public static Giocatore getInstance() {
        if  (null == instance) instance = new Giocatore();
        return instance;
    }

    public boolean isSconfitto() {
        return 0 >= vita;
    }

    public void applicaDanno(float danno) {
        vita -= danno;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public float getVita() {
        return vita;
    }

}