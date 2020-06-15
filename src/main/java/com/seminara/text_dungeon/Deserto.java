package com.seminara.text_dungeon;

import java.util.Map;
import java.util.function.Supplier;

public class Deserto extends Dungeon {
    private Map<TipoNemico, Supplier<Nemico>> generaNemico = Map.of(TipoNemico.FACILE, Goblin::new, TipoNemico.MEDIO, Chimera::new, TipoNemico.DIFFICILE, Ciclope::new);

    @Override
    protected Nemico getNemico(TipoNemico tipo) {
        if(null == tipo) return null;
        return generaNemico.get(tipo).get();
    }
    
}