package com.seminara.text_dungeon;


import com.seminara.text_dungeon.keylistener.KeyListener;
import com.seminara.text_dungeon.partita.Game;

// java -cp text_dungeon/target/text_dungeon-1.0-SNAPSHOT.jar com.seminara.text_dungeon.App

public class App 
{
    public static void main( String[] args )
    {
        Game gioco = new Game();
        while(gioco.gioca())
            gioco.setStato(KeyListener.inputKey().toLowerCase());
    }
}
