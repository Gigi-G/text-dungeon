package com.seminara.text_dungeon.nemico;

import java.util.Map;
import java.util.function.Supplier;

import com.seminara.text_dungeon.stato_personaggio.*;
import com.seminara.text_dungeon.stato_personaggio.StatoPersonaggio;

public abstract class Nemico implements INemico {
    protected String tipo;
    protected float vita;
    protected StatoPersonaggio stato;
    protected int min;
    protected int max;
    protected Map <String, Supplier<StatoPersonaggio>> mapStato = Map.of("0", Attacco::new, "1", Assalto::new, "2", Difesa::new);

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
        stato = mapStato.getOrDefault(String.valueOf(Math.round(Math.random()*2)), Attacco::new).get();
    }

    @Override
    public String getStatoCombattimento() {
        return stato.mostra();
    }
}