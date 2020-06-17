package com.seminara.text_dungeon.sfida;

import java.util.Map;
import java.util.function.Supplier;

public class Battaglia {
    private Map <String, Supplier<ISfida>> mapStato = Map.of("Attacco", SfidaAttacco::new, "Assalto", SfidaAssalto::new, "Difesa", SfidaDifesa::new);
    
    public int vincitoreSfida(String stat1, String stat2) {
        return mapStato.get(stat1).get().competizione(mapStato.get(stat2).get());
    }
}