package com.seminara.text_dungeon.partita;

public class Livello1 implements GameState {

    @Override
    public boolean play(Partita partita) {
        System.out.println("Livello1");
        return false;
    }
    
}