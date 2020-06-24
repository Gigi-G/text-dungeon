package com.seminara.text_dungeon.partita;

public interface IGameState {
    public final String VERDE = "\u001B[32m";
    public final String ROSSO = "\u001B[31m";
    public final String RESET = "\u001B[0m";
    public boolean play(Game game, Partita partita);
}