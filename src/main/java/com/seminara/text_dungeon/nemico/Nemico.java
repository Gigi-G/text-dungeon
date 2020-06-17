package com.seminara.text_dungeon.nemico;

import com.seminara.text_dungeon.stato_personaggio.GeneraStato;
import com.seminara.text_dungeon.stato_personaggio.IStatoPersonaggio;

public abstract class Nemico implements INemico {
    protected String tipo;
    protected float vita;
    protected int min;
    protected int max;
    protected IStatoPersonaggio stato = GeneraStato.generaStato("0");

    @Override
    public String getNome() {
        return tipo;
    }

    @Override
    public void applicaDanno(float danno) {
        vita -= danno;
    }

    @Override
    public float affliggiDanno() {
        return stato.affliggiDanno((float) Math.random()*(max-min+1) + min);
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
    public void setStatoCombattimento() {
        stato = GeneraStato.generaStato(String.valueOf(Math.round(Math.random()*2)));
    }

    @Override
    public String getStatoCombattimento() {
        return stato.mostra();
    }
}