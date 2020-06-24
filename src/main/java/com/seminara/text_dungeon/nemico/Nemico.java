package com.seminara.text_dungeon.nemico;

import com.seminara.text_dungeon.stato_combattimento.GeneraStato;
import com.seminara.text_dungeon.stato_combattimento.IStatoCombattimento;

public class Nemico implements INemico {
    protected String tipo;
    protected float vita;
    protected int minDanno;
    protected int maxDanno;
    protected IStatoCombattimento stato = GeneraStato.generaStato("0");

    @Override
    public String getNome() {
        return tipo;
    }

    @Override
    public void applicaDanno(float danno) {
        vita -= danno;
    }

    @Override
    public float infliggiDanno() {
        return stato.infliggiDanno((float) Math.random()*(maxDanno-minDanno+1) + minDanno);
    }

    @Override
    public boolean isSconfitto() {
        return 0 >= vita;
    }

    @Override
    public float getVita() {
        return vita<0f?0f:vita;
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