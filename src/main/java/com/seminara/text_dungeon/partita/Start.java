package com.seminara.text_dungeon.partita;

public class Start implements IGameState {

    @Override
    public boolean play(Game game, Partita partita) {
        printMenu();
        return true;
    }

    private void printMenu() {
        System.out.println();
        System.out.println("Cosa vuoi fare?");
        System.out.println("1 - Regole");
        System.out.println("2 - Gioca livello Bosco");
        System.out.println("3 - Gioca livello Deserto");
        System.out.println("q - Esci dal gioco");
        System.out.println();
    }
    
}