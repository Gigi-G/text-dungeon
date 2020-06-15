package com.seminara.text_dungeon.dungeon;

import com.seminara.text_dungeon.nemico.*;
import java.util.Map;
import java.util.function.Supplier;

public class Bosco extends Dungeon {
    private Map<TipoNemico, Supplier<Nemico>> generaNemico = Map.of(TipoNemico.FACILE, Goblin::new, TipoNemico.MEDIO, Chimera::new, TipoNemico.DIFFICILE, Strega::new);

    @Override
    protected Nemico getNemico(TipoNemico tipo) {
        if(null == tipo) return null;
        return generaNemico.get(tipo).get();
    }
}