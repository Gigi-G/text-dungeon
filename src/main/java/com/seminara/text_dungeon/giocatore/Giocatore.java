package com.seminara.text_dungeon.giocatore;

import java.util.Map;
import java.util.function.Supplier;

import com.seminara.text_dungeon.armeria.*;
import com.seminara.text_dungeon.stato_personaggio.Assalto;
import com.seminara.text_dungeon.stato_personaggio.Attacco;
import com.seminara.text_dungeon.stato_personaggio.Difesa;
import com.seminara.text_dungeon.stato_personaggio.StatoPersonaggio;

public class Giocatore {
    private float vita;
    private Arma arma;
    private StatoPersonaggio stato;
    private Map <String, Supplier<StatoPersonaggio>> mapStato = Map.of("0", Attacco::new, "1", Assalto::new, "2", Difesa::new);
    private static Giocatore instance;

    private Giocatore() {
        vita = 300f;
        stato = new Attacco();
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

    public void setStatoCombattimento(String stat) {
        stato = mapStato.getOrDefault(stat, Attacco::new).get();
    }

    public String getStatoCombattimento() {
        return stato.mostra();
    }

    public float affliggiDanno() {
        return stato.affliggiDanno(arma.getDanno());
    }

}