package com.seminara.text_dungeon.partita;

public class Sconfitta implements IGameState {
    private final String COLOR = "\u001B[31m";
    private static final String RESET = "\u001B[0m";

    @Override
    public boolean play(Game game, Partita partita) {
        System.out.println();
        System.out.println("-".repeat(58));
        System.out.println(COLOR + "GAME OVER" + RESET);
        System.out.println("-".repeat(58));
        System.out.println();
        game.setStato("0");
        return game.gioca();
    }
}