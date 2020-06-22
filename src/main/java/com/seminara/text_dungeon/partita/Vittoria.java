package com.seminara.text_dungeon.partita;

public class Vittoria implements IGameState {
    private final String COLOR = "\u001B[32m";
    private static final String RESET = "\u001B[0m";

    @Override
    public boolean play(Game game, Partita partita) {
        System.out.println();
        System.out.println("-".repeat(58));
        System.out.println(COLOR + "YOU WIN" + RESET);
        System.out.println("-".repeat(58));
        System.out.println();
        game.setStato("0");
        return game.gioca();
    }
    
}