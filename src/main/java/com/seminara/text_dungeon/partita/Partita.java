package com.seminara.text_dungeon.partita;

import java.util.Map;
import java.util.function.Supplier;

public class Partita {
    private GameState stato;
    private Map <String, Supplier<GameState>> map = Map.of("1", Regole::new, "2", Livello1::new, "3", Livello2::new);

    public Partita() {
        stato = new Start();
    }

    public boolean mostra() {
        return stato.play(this);
    }

    public void setStato(String i) {
        stato = map.getOrDefault(i, Start::new).get();
    }

}