package com.seminara.text_dungeon.partita;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.seminara.text_dungeon.keylistener.KeyListener;

public class TestPartita {

    private static void init(String pos) {
        String input = pos;
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        KeyListener.resetBuffer();
    }

    public static boolean testStartDungeonBosco() {
        Partita partita = new Partita();
        init("0");
        String result = partita.startDungeonBosco();
        if(result.equals("Vittoria") || result.equals("Sconfitta")) {
            System.out.println("TestPartita.testStartDungeonBosco(): OK");
            return true;
        }
        else {
            System.out.println("TestPartita.testStartDungeonBosco(): FAILED");
            return false;
        }
    }

    public static boolean testStartDungeonDeserto() {
        Partita partita = new Partita();
        init("0");
        String result = partita.startDungeonDeserto();
        if(result.equals("Vittoria") || result.equals("Sconfitta")) {
            System.out.println("TestPartita.testStartDungeonDeserto(): OK");
            return true;
        }
        else {
            System.out.println("TestPartita.testStartDungeonDeserto(): FAILED");
            return false;
        }
    }

}