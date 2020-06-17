package com.seminara.text_dungeon.partita;

public class Livello2 implements IGameState {

    @Override
    public boolean play(Game game, Partita partita) {
        printInfo();
        game.setStato(partita.startDungeonDeserto());
        return game.gioca();
    }

    private void printInfo() {
        System.out.println();
        System.out.println("Livello 2:");
        System.out.println();
    }
    
}