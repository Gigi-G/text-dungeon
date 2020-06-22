package com.seminara.text_dungeon.battaglia;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.seminara.text_dungeon.armeria.GeneraArma;
import com.seminara.text_dungeon.giocatore.Giocatore;
import com.seminara.text_dungeon.keylistener.KeyListener;
import com.seminara.text_dungeon.nemico.TestNemicoAssalto;
import com.seminara.text_dungeon.nemico.TestNemicoAttacco;
import com.seminara.text_dungeon.nemico.TestNemicoDifesa;

public class TestBattaglia {

    private static void printRed(String str){
        System.out.println("\u001B[31m"+str+ "\u001B[0m");
    }

    private static void printGreen(String str){
        System.out.println("\u001B[32m"+str+ "\u001B[0m");
    }

    private static void init(String pos) {
        String input = pos;
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        KeyListener.resetBuffer();
    }

    public static boolean testBattagliaVittoriaDifesa() {
        Giocatore.getInstance().setArma(GeneraArma.getArma(0));
        Battaglia battaglia = new Battaglia();
        init("2");
        if ( battaglia.battaglia(new TestNemicoAttacco()).equals("Vittoria")) {
            printGreen("TestBattaglia.testBattagliaVittoriaDifesa(): OK");
            return true;
        }
        else {
            printRed("TestBattaglia.testBattagliaVittoriaDifesa(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaSconfittaDifesa() {
        Giocatore.getInstance().setArma(GeneraArma.getArma(1));
        Battaglia battaglia = new Battaglia();
        init("2");
        if ( battaglia.battaglia(new TestNemicoAssalto()).equals("Sconfitta")) {
            printGreen("TestBattaglia.testBattagliaSconfittaDifesa(): OK");
            return true;
        }
        else {
            printRed("TestBattaglia.testBattagliaSconfittaDifesa(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaPareggioDifesa() {
        Giocatore.getInstance().setArma(GeneraArma.getArma(2));
        Battaglia battaglia = new Battaglia();
        init("2");
        if ( battaglia.battaglia(new TestNemicoDifesa()).equals("Pareggio")) {
            printGreen("TestBattaglia.testBattagliaPareggioDifesa(): OK");
            return true;
        }
        else {
            printRed("TestBattaglia.testBattagliaPareggioDifesa(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaVittoriaAttacco() {
        Giocatore.getInstance().setArma(GeneraArma.getArma(0));
        Battaglia battaglia = new Battaglia();
        init("0");
        if ( battaglia.battaglia(new TestNemicoAssalto()).equals("Vittoria")) {
            printGreen("TestBattaglia.testBattagliaVittoriaAttacco(): OK");
            return true;
        }
        else {
            printRed("TestBattaglia.testBattagliaVittoriaAttacco(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaSconfittaAttacco() {
        Giocatore.getInstance().setArma(GeneraArma.getArma(1));
        Battaglia battaglia = new Battaglia();
        init("0");
        if ( battaglia.battaglia(new TestNemicoDifesa()).equals("Sconfitta")) {
            printGreen("TestBattaglia.testBattagliaSconfittaAttacco(): OK");
            return true;
        }
        else {
            printRed("TestBattaglia.testBattagliaSconfittaAttacco(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaPareggioAttacco() {
        Giocatore.getInstance().setArma(GeneraArma.getArma(2));
        Battaglia battaglia = new Battaglia();
        init("0");
        if ( battaglia.battaglia(new TestNemicoAttacco()).equals("Pareggio")) {
            printGreen("TestBattaglia.testBattagliaPareggioAttacco(): OK");
            return true;
        }
        else {
            printRed("TestBattaglia.testBattagliaPareggioAttacco(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaVittoriaAssalto() {
        Giocatore.getInstance().setArma(GeneraArma.getArma(0));
        Battaglia battaglia = new Battaglia();
        init("1");
        if ( battaglia.battaglia(new TestNemicoDifesa()).equals("Vittoria")) {
            printGreen("TestBattaglia.testBattagliaVittoriaAssalto(): OK");
            return true;
        }
        else {
            printRed("TestBattaglia.testBattagliaVittoriaAssalto(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaSconfittaAssalto() {
        Giocatore.getInstance().setArma(GeneraArma.getArma(1));
        Battaglia battaglia = new Battaglia();
        init("1");
        if ( battaglia.battaglia(new TestNemicoAttacco()).equals("Sconfitta")) {
            printGreen("TestBattaglia.testBattagliaSconfittaAssalto(): OK");
            return true;
        }
        else {
            printRed("TestBattaglia.testBattagliaSconfittaAssalto(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaPareggioAssalto() {
        Giocatore.getInstance().setArma(GeneraArma.getArma(2));
        Battaglia battaglia = new Battaglia();
        init("1");
        if ( battaglia.battaglia(new TestNemicoAssalto()).equals("Pareggio")) {
            printGreen("TestBattaglia.testBattagliaPareggioAssalto(): OK");
            return true;
        }
        else {
            printRed("TestBattaglia.testBattagliaPareggioAssalto(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaInputErratoVittoria() {
        Battaglia battaglia = new Battaglia();
        init("\n");
        if ( battaglia.battaglia(new TestNemicoAssalto()).equals("Vittoria")) {
            printGreen("TestBattaglia.testBattagliaInputErratoVittoria(): OK");
            return true;
        }
        else {
            printRed("TestBattaglia.testBattagliaInputErratoVittoria(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaInputErratoPareggio() {
        Battaglia battaglia = new Battaglia();
        init("\n");
        if ( battaglia.battaglia(new TestNemicoAttacco()).equals("Pareggio")) {
            printGreen("TestBattaglia.testBattagliaInputErratoPareggio(): OK");
            return true;
        }
        else {
            printRed("TestBattaglia.testBattagliaInputErratoPareggio(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaInputErratoSconfitta() {
        Battaglia battaglia = new Battaglia();
        init("\n");
        if ( battaglia.battaglia(new TestNemicoDifesa()).equals("Sconfitta")) {
            printGreen("TestBattaglia.testBattagliaInputErratoSconfitta(): OK");
            return true;
        }
        else {
            printRed("TestBattaglia.testBattagliaInputErratoSconfitta(): FAILED");
            return false;
        }
    }

}