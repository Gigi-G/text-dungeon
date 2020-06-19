package com.seminara.text_dungeon.partita;

import java.util.Map;
import java.util.function.Supplier;

public class Game {
    private IGameState stato;
    private Map <String, Supplier<IGameState>> map = Map.of("1", Regole::new, "2", LivelloBosco::new, "3", LivelloDeserto::new, "q", End::new, "Vittoria", Vittoria::new, "Sconfitta", Sconfitta::new);
    private Partita partita;

    public Game() {
        stato = new Start();
        partita = new Partita();
    }

    public boolean gioca() {
        return stato.play(this, partita);
    }

    public void setStato(String i) {
        stato = map.getOrDefault(i, Start::new).get();
    }

}