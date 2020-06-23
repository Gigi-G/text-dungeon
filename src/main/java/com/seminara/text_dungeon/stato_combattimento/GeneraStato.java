package com.seminara.text_dungeon.stato_combattimento;

import java.util.Map;
import java.util.function.Supplier;

public class GeneraStato {
    private static final Map <String, Supplier<IStatoCombattimento>> mapStato = Map.of("0", Attacco::new, "1", Assalto::new, "2", Difesa::new);

    private GeneraStato() {}

    public static IStatoCombattimento generaStato(String stat) {
        return mapStato.getOrDefault(stat, Attacco::new).get();
    }
}