package com.seminara.text_dungeon;

import com.seminara.text_dungeon.partita.*;

public class App 
{
    public static void main( String[] args )
    {
        Partita partita = new Partita();
        partita.setStato("0");
        while(partita.mostra());
    }
}
