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
        if ( battaglia.scontro(new TestNemicoAttacco()).equals("Vittoria")) {
            System.out.println("TestBattaglia.testBattagliaVittoriaDifesa(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaVittoriaDifesa(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaSconfittaDifesa() {
        Giocatore.getInstance().setArma(GeneraArma.getArma(1));
        Battaglia battaglia = new Battaglia();
        init("2");
        if ( battaglia.scontro(new TestNemicoAssalto()).equals("Sconfitta")) {
            System.out.println("TestBattaglia.testBattagliaSconfittaDifesa(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaSconfittaDifesa(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaPareggioDifesa() {
        Giocatore.getInstance().setArma(GeneraArma.getArma(2));
        Battaglia battaglia = new Battaglia();
        init("2");
        if ( battaglia.scontro(new TestNemicoDifesa()).equals("Pareggio")) {
            System.out.println("TestBattaglia.testBattagliaPareggioDifesa(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaPareggioDifesa(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaVittoriaAttacco() {
        Giocatore.getInstance().setArma(GeneraArma.getArma(0));
        Battaglia battaglia = new Battaglia();
        init("0");
        if ( battaglia.scontro(new TestNemicoAssalto()).equals("Vittoria")) {
            System.out.println("TestBattaglia.testBattagliaVittoriaAttacco(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaVittoriaAttacco(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaSconfittaAttacco() {
        Giocatore.getInstance().setArma(GeneraArma.getArma(1));
        Battaglia battaglia = new Battaglia();
        init("0");
        if ( battaglia.scontro(new TestNemicoDifesa()).equals("Sconfitta")) {
            System.out.println("TestBattaglia.testBattagliaSconfittaAttacco(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaSconfittaAttacco(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaPareggioAttacco() {
        Giocatore.getInstance().setArma(GeneraArma.getArma(2));
        Battaglia battaglia = new Battaglia();
        init("0");
        if ( battaglia.scontro(new TestNemicoAttacco()).equals("Pareggio")) {
            System.out.println("TestBattaglia.testBattagliaPareggioAttacco(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaPareggioAttacco(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaVittoriaAssalto() {
        Giocatore.getInstance().setArma(GeneraArma.getArma(0));
        Battaglia battaglia = new Battaglia();
        init("1");
        if ( battaglia.scontro(new TestNemicoDifesa()).equals("Vittoria")) {
            System.out.println("TestBattaglia.testBattagliaVittoriaAssalto(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaVittoriaAssalto(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaSconfittaAssalto() {
        Giocatore.getInstance().setArma(GeneraArma.getArma(1));
        Battaglia battaglia = new Battaglia();
        init("1");
        if ( battaglia.scontro(new TestNemicoAttacco()).equals("Sconfitta")) {
            System.out.println("TestBattaglia.testBattagliaSconfittaAssalto(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaSconfittaAssalto(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaPareggioAssalto() {
        Giocatore.getInstance().setArma(GeneraArma.getArma(2));
        Battaglia battaglia = new Battaglia();
        init("1");
        if ( battaglia.scontro(new TestNemicoAssalto()).equals("Pareggio")) {
            System.out.println("TestBattaglia.testBattagliaPareggioAssalto(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaPareggioAssalto(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaInputErratoVittoria() {
        Battaglia battaglia = new Battaglia();
        init("\n");
        if ( battaglia.scontro(new TestNemicoAssalto()).equals("Vittoria")) {
            System.out.println("TestBattaglia.testBattagliaInputErratoVittoria(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaInputErratoVittoria(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaInputErratoPareggio() {
        Battaglia battaglia = new Battaglia();
        init("\n");
        if ( battaglia.scontro(new TestNemicoAttacco()).equals("Pareggio")) {
            System.out.println("TestBattaglia.testBattagliaInputErratoPareggio(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaInputErratoPareggio(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaInputErratoSconfitta() {
        Battaglia battaglia = new Battaglia();
        init("\n");
        if ( battaglia.scontro(new TestNemicoDifesa()).equals("Sconfitta")) {
            System.out.println("TestBattaglia.testBattagliaInputErratoSconfitta(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaInputErratoSconfitta(): FAILED");
            return false;
        }
    }

}