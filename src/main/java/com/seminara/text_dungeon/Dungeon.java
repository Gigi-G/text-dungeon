package com.seminara.text_dungeon;

import java.util.Map;

public abstract class Dungeon {
    protected enum TipoNemico {FACILE, MEDIO, DIFFICILE}
    private int livello = 0;
    private Map<Integer, TipoNemico> generaTipo = Map.of(0, TipoNemico.FACILE, 1, TipoNemico.MEDIO, 0, TipoNemico.FACILE, 2, TipoNemico.DIFFICILE);

    public int getLivello() {
        return livello;
    }

    public Nemico esplora() {
        Nemico next;
        next = getNemico(generaTipo.getOrDefault(livello, null));
        livello++;
        return next;
    }

    protected abstract Nemico getNemico(TipoNemico tipo);
}