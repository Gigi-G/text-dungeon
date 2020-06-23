package com.seminara.text_dungeon.giocatore;

import com.seminara.text_dungeon.armeria.IArma;
import com.seminara.text_dungeon.stato_combattimento.GeneraStato;
import com.seminara.text_dungeon.stato_combattimento.IStatoCombattimento;

public class Giocatore {
    private float vita;
    private IArma arma;
    private IStatoCombattimento stato;
    private static Giocatore instance;

    private Giocatore() {
        vita = 300f;
        stato = GeneraStato.generaStato("0");
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

    public void setArma(IArma arma) {
        this.arma = arma;
    }

    public IArma getArma() {
        return arma;
    }

    public void resetVita() {
        vita = 300f;
    }

    public float getVita() {
        return vita<=0f?0f:vita;
    }

    public void setStatoCombattimento(String stat) {
        stato = GeneraStato.generaStato(stat);
    }

    public String getStatoCombattimento() {
        return stato.mostra();
    }

    public float infliggiDanno() {
        return stato.infliggiDanno(arma.getDanno());
    }

}