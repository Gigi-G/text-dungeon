package com.seminara.text_dungeon;


import com.seminara.text_dungeon.keylistener.KeyListener;
import com.seminara.text_dungeon.partita.Game;

public class App 
{
    public static void main( String[] args )
    {
        Game gioco = new Game();
        while(gioco.gioca())
            gioco.setStato(KeyListener.inputKey().toLowerCase());
    }
}
