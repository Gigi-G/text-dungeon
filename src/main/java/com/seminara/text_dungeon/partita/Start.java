package com.seminara.text_dungeon.partita;

public class Start implements IGameState {

    @Override
    public boolean play(Game game, Partita partita) {
        printBenvenuto();
        printMenu();
        game.setStato("0");
        return true;
    }

    private void printBenvenuto() {
        System.out.println("Benvenuto/a su text_dungeon!\n");
    }

    private void printMenu() {
        System.out.println("Cosa vuoi fare?");
        System.out.println("1 - Regole");
        System.out.println("2 - Gioca livello 1");
        System.out.println("3 - Gioca livello 2");
        System.out.println();
    }
    
}