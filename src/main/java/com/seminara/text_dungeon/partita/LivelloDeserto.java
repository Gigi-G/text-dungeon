package com.seminara.text_dungeon.partita;

public class LivelloDeserto implements IGameState {

    @Override
    public boolean play(Game game, Partita partita) {
        printInfo();
        game.setStato(partita.startDungeonDeserto());
        return game.gioca();
    }

    private void printInfo() {
        System.out.println();
        System.out.println("-".repeat(58));
        System.out.println(VERDE + "Livello Deserto:" + RESET);
        System.out.println("-".repeat(58));
        System.out.println();
    }
    
}