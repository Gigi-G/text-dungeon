package com.seminara.text_dungeon.armeria;
import com.seminara.text_dungeon.pietra.*;

import java.util.Map;
import java.util.function.Function;

public class GeneraArma {
    private GeneraPietra generapietra;
    private final Map<Integer, Function<Pietra, Arma>> genera;
    private static GeneraArma instance;

    private GeneraArma() {
        generapietra = GeneraPietra.getInstance();
        genera = Map.of(0, x -> new Ascia(x), 1, x -> new Mannaia(x), 2, x -> new Spada(x));
    }

    public static GeneraArma getInstance() {
        if  (null == instance) instance = new GeneraArma();
        return instance;
    }

    public Arma getArma(int i) {
        return genera.get(i).apply(generapietra.getPietra());
    }

}