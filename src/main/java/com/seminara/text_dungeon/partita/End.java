package com.seminara.text_dungeon.partita;

public class End implements IGameState {

    @Override
    public boolean play(Game game, Partita partita) {
        printCredits();
        return false;
    }

    private void printCredits() {
        System.out.println();
        System.out.println("Grazie per aver giocato!");
        System.out.println("Design by Luigi Seminara");
        System.out.println();
    }
    
}