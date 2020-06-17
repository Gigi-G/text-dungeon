package com.seminara.text_dungeon.stato_personaggio;

import java.util.Map;
import java.util.function.Supplier;

public class GeneraStato {
    private static final Map <String, Supplier<IStatoPersonaggio>> mapStato = Map.of("0", Attacco::new, "1", Assalto::new, "2", Difesa::new);

    private GeneraStato() {}

    public static IStatoPersonaggio generaStato(String stat) {
        return mapStato.getOrDefault(stat, Attacco::new).get();
    }
}