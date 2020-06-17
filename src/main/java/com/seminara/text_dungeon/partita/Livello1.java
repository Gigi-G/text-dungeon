package com.seminara.text_dungeon.partita;

public class Livello1 implements IGameState {

    @Override
    public boolean play(Game game, Partita partita) {
        System.out.println("Livello1\n");
        partita.startDungeonBosco();
        return false;
    }
    
}