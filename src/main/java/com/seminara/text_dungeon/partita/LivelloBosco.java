package com.seminara.text_dungeon.partita;

public class LivelloBosco implements IGameState {
    private final String COLOR = "\u001B[32m";
    private static final String RESET = "\u001B[0m";

    @Override
    public boolean play(Game game, Partita partita) {
        printInfo();
        game.setStato(partita.startDungeonBosco());
        return game.gioca();
    }

    private void printInfo() {
        System.out.println();
        System.out.println("-".repeat(58));
        System.out.println(COLOR + "Livello Bosco:" + RESET);
        System.out.println("-".repeat(58));
        System.out.println();
    }
    
}