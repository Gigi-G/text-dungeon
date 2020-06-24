package com.seminara.text_dungeon.partita;

import java.util.Map;
import java.util.function.Supplier;

public class Game {
    private IGameState statoGioco;
    private Map <String, Supplier<IGameState>> mapStati = Map.of("1", Regole::new, "2", LivelloBosco::new, "3", LivelloDeserto::new, "q", End::new, "Vittoria", Vittoria::new, "Sconfitta", Sconfitta::new);
    private Partita partita;

    public Game() {
        statoGioco = new Title();
        partita = new Partita();
    }

    public boolean gioca() {
        return statoGioco.play(this, partita);
    }

    public void setStato(String i) {
        statoGioco = mapStati.getOrDefault(i, Start::new).get();
    }

}