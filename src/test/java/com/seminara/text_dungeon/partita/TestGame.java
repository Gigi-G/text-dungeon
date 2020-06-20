package com.seminara.text_dungeon.partita;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.seminara.text_dungeon.keylistener.KeyListener;

public class TestGame {

    private static void init(String pos) {
        String input = pos;
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        KeyListener.resetBuffer();
    }

    public static boolean testGameStatoIniziale() {
        Game gioco = new Game();
        boolean result = gioco.gioca();
        if(result) {
            System.out.println("TestGame.testGioca(): OK");
            return true;
        }
        else {
            System.out.println("TestGame.testGioca(): FAILED");
            return false;
        }
    }

    public static boolean testSetStatoRegole() {
        Game gioco = new Game();
        boolean result = gioco.gioca();
        if(result) {
            System.out.println("TestGame.testSetStatoRegole(): OK");
            return true;
        }
        else {
            System.out.println("TestGame.testSetStatoRegole(): FAILED");
            return false;
        }
    }
    
    public static boolean testSetStatoLivelloBosco() {
        Game gioco = new Game();
        gioco.setStato("2");
        init("y");
        boolean result = gioco.gioca();
        KeyListener.resetBuffer();
        if(result) {
            System.out.println("TestGame.testSetStatoLivelloBosco(): OK");
            return true;
        }
        else {
            System.out.println("TestGame.testSetStatoLivelloBosco(): FAILED");
            return false;
        }
    }

    public static boolean testSetStatoLivelloDeserto() {
        Game gioco = new Game();
        gioco.setStato("3");
        init("y");
        boolean result = gioco.gioca();
        KeyListener.resetBuffer();
        if(result) {
            System.out.println("TestGame.testSetStatoLivelloDeserto(): OK");
            return true;
        }
        else {
            System.out.println("TestGame.testSetStatoLivelloDeserto(): FAILED");
            return false;
        }
    }

    public static boolean testSetStatoEnd() {
        Game gioco = new Game();
        gioco.setStato("q");
        boolean result = gioco.gioca();
        if(!result) {
            System.out.println("TestGame.testSetStatoEnd(): OK");
            return true;
        }
        else {
            System.out.println("TestGame.testSetStatoEnd(): FAILED");
            return false;
        }
    }

    public static boolean testSetStatoVittoria() {
        Game gioco = new Game();
        gioco.setStato("Vittoria");
        boolean result = gioco.gioca();
        if(result) {
            System.out.println("TestGame.testSetStatoVittoria(): OK");
            return true;
        }
        else {
            System.out.println("TestGame.testSetStatoVittoria(): FAILED");
            return false;
        }
    }

    public static boolean testSetStatoSconfitta() {
        Game gioco = new Game();
        gioco.setStato("Sconfitta");
        boolean result = gioco.gioca();
        if(result) {
            System.out.println("TestGame.testSetStatoSconfitta(): OK");
            return true;
        }
        else {
            System.out.println("TestGame.testSetStatoSconfitta(): FAILED");
            return false;
        }
    }

}