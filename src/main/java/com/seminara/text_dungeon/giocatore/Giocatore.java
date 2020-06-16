package com.seminara.text_dungeon.giocatore;
import com.seminara.text_dungeon.armeria.*;

public class Giocatore {
    private float vita;
    private Arma arma;
    private int statoCombattimento;
    private static Giocatore instance;

    private Giocatore() {
        vita = 300f;
        statoCombattimento = 0;
    }

    public static Giocatore getInstance() {
        if  (null == instance) instance = new Giocatore();
        return instance;
    }

    public boolean isSconfitto() {
        return 0f >= vita;
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

    public void resetVita() {
        vita = 300f;
    }

    public float getVita() {
        return vita;
    }

    public void setStatoCombattimento(int stato) {
        statoCombattimento = stato%3;
    }

    public int getStatoCombattimento() {
        return statoCombattimento;
    }

}