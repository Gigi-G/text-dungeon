package com.seminara.text_dungeon.partita;

public class Livello1 implements IGameState {

    @Override
    public boolean play(Game game, Partita partita) {
        printInfo();
        game.setStato(partita.startDungeonBosco());
        return game.gioca();
    }

    private void printInfo() {
        System.out.println();
        System.out.println("Livello 1:");
        System.out.println();
    }
    
}