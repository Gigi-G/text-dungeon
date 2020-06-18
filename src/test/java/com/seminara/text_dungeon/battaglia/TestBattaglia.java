package com.seminara.text_dungeon.battaglia;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.seminara.text_dungeon.armeria.GeneraArma;
import com.seminara.text_dungeon.giocatore.Giocatore;
import com.seminara.text_dungeon.nemico.TestNemicoAssalto;
import com.seminara.text_dungeon.nemico.TestNemicoAttacco;
import com.seminara.text_dungeon.nemico.TestNemicoDifesa;



public class TestBattaglia {

    public static boolean testBattagliaVittoriaDifesa() {
        Giocatore.getInstance().setArma(GeneraArma.getInstance().getArma(0));
        Battaglia battaglia = new Battaglia();
        String input = "2";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        if ( battaglia.battaglia(new TestNemicoAttacco()).equals("Vittoria")) {
            System.out.println("TestBattaglia.testBattagliaVittoriaDifesa(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaVittoriaDifesa(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaSconfittaDifesa() {
        Giocatore.getInstance().setArma(GeneraArma.getInstance().getArma(1));
        Battaglia battaglia = new Battaglia();
        String input = "2";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        if ( battaglia.battaglia(new TestNemicoAssalto()).equals("Sconfitta")) {
            System.out.println("TestBattaglia.testBattagliaSconfittaDifesa(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaSconfittaDifesa(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaPareggioDifesa() {
        Giocatore.getInstance().setArma(GeneraArma.getInstance().getArma(2));
        Battaglia battaglia = new Battaglia();
        String input = "2";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        if ( battaglia.battaglia(new TestNemicoDifesa()).equals("Pareggio")) {
            System.out.println("TestBattaglia.testBattagliaPareggioDifesa(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaPareggioDifesa(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaVittoriaAttacco() {
        Giocatore.getInstance().setArma(GeneraArma.getInstance().getArma(0));
        Battaglia battaglia = new Battaglia();
        String input = "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        if ( battaglia.battaglia(new TestNemicoAssalto()).equals("Vittoria")) {
            System.out.println("TestBattaglia.testBattagliaVittoriaAttacco(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaVittoriaAttacco(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaSconfittaAttacco() {
        Giocatore.getInstance().setArma(GeneraArma.getInstance().getArma(1));
        Battaglia battaglia = new Battaglia();
        String input = "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        if ( battaglia.battaglia(new TestNemicoDifesa()).equals("Sconfitta")) {
            System.out.println("TestBattaglia.testBattagliaSconfittaAttacco(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaSconfittaAttacco(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaPareggioAttacco() {
        Giocatore.getInstance().setArma(GeneraArma.getInstance().getArma(2));
        Battaglia battaglia = new Battaglia();
        String input = "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        if ( battaglia.battaglia(new TestNemicoAttacco()).equals("Pareggio")) {
            System.out.println("TestBattaglia.testBattagliaPareggioAttacco(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaPareggioAttacco(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaVittoriaAssalto() {
        Giocatore.getInstance().setArma(GeneraArma.getInstance().getArma(0));
        Battaglia battaglia = new Battaglia();
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        if ( battaglia.battaglia(new TestNemicoDifesa()).equals("Vittoria")) {
            System.out.println("TestBattaglia.testBattagliaVittoriaAssalto(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaVittoriaAssalto(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaSconfittaAssalto() {
        Giocatore.getInstance().setArma(GeneraArma.getInstance().getArma(1));
        Battaglia battaglia = new Battaglia();
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        if ( battaglia.battaglia(new TestNemicoAttacco()).equals("Sconfitta")) {
            System.out.println("TestBattaglia.testBattagliaSconfittaAssalto(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaSconfittaAssalto(): FAILED");
            return false;
        }
    }

    public static boolean testBattagliaPareggioAssalto() {
        Giocatore.getInstance().setArma(GeneraArma.getInstance().getArma(2));
        Battaglia battaglia = new Battaglia();
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        if ( battaglia.battaglia(new TestNemicoAssalto()).equals("Pareggio")) {
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
        String input = "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        if ( battaglia.battaglia(new TestNemicoAssalto()).equals("Vittoria")) {
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
        String input = "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        if ( battaglia.battaglia(new TestNemicoAttacco()).equals("Pareggio")) {
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
        String input = "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        if ( battaglia.battaglia(new TestNemicoDifesa()).equals("Sconfitta")) {
            System.out.println("TestBattaglia.testBattagliaInputErratoSconfitta(): OK");
            return true;
        }
        else {
            System.out.println("TestBattaglia.testBattagliaInputErratoSconfitta(): FAILED");
            return false;
        }
    }

}