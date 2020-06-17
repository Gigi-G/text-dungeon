package com.seminara.text_dungeon.partita;

public class GameR {
    private Partita partita;
    private IGameState stato;

    public GameR() {
        partita = new Partita();
        stato = new Regole();
    }
}