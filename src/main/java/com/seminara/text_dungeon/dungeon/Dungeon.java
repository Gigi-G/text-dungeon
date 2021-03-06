package com.seminara.text_dungeon.dungeon;

import com.seminara.text_dungeon.nemico.*;
import java.util.Map;

public abstract class Dungeon {
    protected enum TipoNemico {FACILE, MEDIO, DIFFICILE}
    private int livello = 0;
    private Map<Integer, TipoNemico> generaTipo = Map.of(0, TipoNemico.FACILE, 1, TipoNemico.MEDIO, 2, TipoNemico.FACILE, 3, TipoNemico.DIFFICILE);

    public int getLivello() {
        return livello;
    }

    public INemico esplora() {
        INemico next;
        next = getNemico(generaTipo.getOrDefault(livello, null));
        livello++;
        return next;
    }

    protected abstract INemico getNemico(TipoNemico tipo);
}