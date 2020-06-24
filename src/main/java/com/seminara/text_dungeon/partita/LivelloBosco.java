package com.seminara.text_dungeon.partita;

public class LivelloBosco implements IGameState {

    @Override
    public boolean play(Game game, Partita partita) {
        printInfo();
        game.setStato(partita.startDungeonBosco());
        return game.gioca();
    }

    private void printInfo() {
        System.out.println();
        System.out.println("-".repeat(58));
        System.out.println(VERDE + "Livello Bosco:" + RESET);
        System.out.println("-".repeat(58));
        System.out.println();
    }
    
}