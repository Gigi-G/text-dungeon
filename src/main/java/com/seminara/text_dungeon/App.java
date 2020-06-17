package com.seminara.text_dungeon;


import com.seminara.text_dungeon.partita.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App 
{
    public static void main( String[] args )
    {
        BufferedReader input;
        Game gioco = new Game();
        while(gioco.gioca()) {
            try {
                input = new BufferedReader(new InputStreamReader(System.in));
                String in = input.readLine();
                if(in.length() > 0) gioco.setStato(String.valueOf(in.toCharArray()[0]).toLowerCase());
            } catch (IOException io) {
                gioco.setStato("0");
            }
        }
    }
}
