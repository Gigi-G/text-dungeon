package com.seminara.text_dungeon.partita;

public class Sconfitta implements IGameState {
    @Override
    public boolean play(Game game, Partita partita) {
        System.out.println();
        System.out.println("GAME OVER");
        System.out.println();
        game.setStato("0");
        return game.gioca();
    }
}