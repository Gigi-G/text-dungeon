package com.seminara.text_dungeon.dungeon;

import com.seminara.text_dungeon.nemico.*;
import java.util.Map;
import java.util.function.Supplier;

public class Deserto extends Dungeon {
    private Map<TipoNemico, Supplier<INemico>> generaNemico = Map.of(TipoNemico.FACILE, Goblin::new, TipoNemico.MEDIO, Chimera::new, TipoNemico.DIFFICILE, Ciclope::new);

    @Override
    protected INemico getNemico(TipoNemico tipo) {
        if(null == tipo) return null;
        return generaNemico.get(tipo).get();
    }
    
}