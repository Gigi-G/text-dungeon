package com.seminara.text_dungeon.partita;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class TestPartita {

    public static boolean testStartDungeonBosco() {
        Partita partita = new Partita();
        String input = "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String result = partita.startDungeonBosco();
        if(result.equals("Vittoria") || result.equals("Sconfitta")) {
            System.out.println("TestPartita.testStartDungeonBosco(): OK");
            System.setIn(null);
            return true;
        }
        else {
            System.out.println("TestPartita.testStartDungeonBosco(): FAILED");
            System.setIn(null);
            return false;
        }
    }

    public static boolean testStartDungeonDeserto() {
        Partita partita = new Partita();
        String input = "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String result = partita.startDungeonDeserto();
        if(result.equals("Vittoria") || result.equals("Sconfitta")) {
            System.out.println("TestPartita.testStartDungeonDeserto(): OK");
            System.setIn(null);
            return true;
        }
        else {
            System.out.println("TestPartita.testStartDungeonDeserto(): FAILED");
            System.setIn(null);
            return false;
        }
    }

}