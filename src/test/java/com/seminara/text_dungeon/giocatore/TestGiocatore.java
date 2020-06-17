package com.seminara.text_dungeon.giocatore;
import com.seminara.text_dungeon.armeria.*;

public class TestGiocatore {
    
    public static boolean testSingleton() {
        Giocatore giocatore1 = Giocatore.getInstance();
        giocatore1.applicaDanno(50f);
        Giocatore giocatore2 = Giocatore.getInstance();
        giocatore2.applicaDanno(40f);
        if  (giocatore1.getVita() == 210f) {
            System.out.println("TestGiocatore.testSingleton(): OK");
            return true;
        }
        else {
            System.out.println("TestGiocatore.testSingleton(): FAILED");
            return false;
        }
    }

    public static boolean testArma() {
        Giocatore giocatore = Giocatore.getInstance();
        giocatore.setArma(GeneraArma.getInstance().getArma(0));
        if  (giocatore.getArma().getTipo().contains("Ascia")) {
            System.out.println("TestGiocatore.testArma(): OK");
            return true;
        }
        else {
            System.out.println("TestGiocatore.testArma(): FAILED");
            return false;
        }
    }

    public static boolean testIsSconfitto() {
        Giocatore giocatore = Giocatore.getInstance();
        giocatore.applicaDanno(350);
        if  (giocatore.isSconfitto()) {
            System.out.println("TestGiocatore.testIsSconfitto(): OK");
            return true;
        }
        else {
            System.out.println("TestGiocatore.testIsSconfitto(): FAILED");
            return false;
        }
    }

    public static boolean testGetStatoCombattimento() {
        Giocatore giocatore = Giocatore.getInstance();
        if  (giocatore.getStatoCombattimento().equals("Attacco")) {
            System.out.println("TestGiocatore.testGetStatoCombattimento(): OK");
            return true;
        }
        else {
            System.out.println("TestGiocatore.testGetStatoCombattimento(): FAILED");
            return false;
        }
    }

    public static boolean testSetStatoCombattimento() {
        Giocatore giocatore = Giocatore.getInstance();
        giocatore.setStatoCombattimento("2");
        if  (giocatore.getStatoCombattimento().equals("Difesa")) {
            System.out.println("TestGiocatore.testSetStatoCombattimento(): OK");
            return true;
        }
        else {
            System.out.println("TestGiocatore.testSetStatoCombattimento(): FAILED");
            return false;
        }
    }
    
}