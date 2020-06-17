package com.seminara.text_dungeon.partita;

public class Start implements IGameState {

    @Override
    public boolean play(Game game, Partita partita) {
        printGameName();
        printMenu();
        return true;
    }

    private void printGameName() {
        System.out.println("Text_dungeon");
    }

    private void printMenu() {
        System.out.println();
        System.out.println("Cosa vuoi fare?");
        System.out.println("1 - Regole");
        System.out.println("2 - Gioca livello 1");
        System.out.println("3 - Gioca livello 2");
        System.out.println("q - Esci dal gioco");
        System.out.println();
    }
    
}