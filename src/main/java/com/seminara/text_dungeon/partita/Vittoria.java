package com.seminara.text_dungeon.partita;

public class Vittoria implements IGameState {

    @Override
    public boolean play(Game game, Partita partita) {
        printInfo();
        game.setStato("0");
        return game.gioca();
    }

    private void printInfo() {
        System.out.println();
        System.out.println("-".repeat(58));
        System.out.println(VERDE + "YOU WIN" + RESET);
        System.out.println("-".repeat(58));
        System.out.println();
    }
    
}