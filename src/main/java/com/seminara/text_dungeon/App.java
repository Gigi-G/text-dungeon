package com.seminara.text_dungeon;


import com.seminara.text_dungeon.partita.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App 
{
    public static void main( String[] args )
    {
        BufferedReader input;
        Game partita = new Game();
        partita.setStato("0");
        while(partita.gioca()) {
            try {
                partita.gioca();
                input = new BufferedReader(new InputStreamReader(System.in));
                partita.setStato(input.readLine());
            } catch (IOException io) {
                partita.setStato("0");
            }
        }
    }
}
