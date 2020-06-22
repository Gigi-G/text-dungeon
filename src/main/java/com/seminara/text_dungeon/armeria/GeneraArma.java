package com.seminara.text_dungeon.armeria;
import com.seminara.text_dungeon.pietra.*;

import java.util.Map;
import java.util.function.Function;

public class GeneraArma {
    private static Map<Integer, Function<IPietra, IArma>> genera = Map.of(0, x -> new Ascia(x), 1, x -> new Mannaia(x), 2, x -> new Spada(x));

    private GeneraArma() {}

    public static IArma getArma(int i) {
        return genera.getOrDefault(i, x -> new Ascia(x)).apply(GeneraPietra.getPietra());
    }

}