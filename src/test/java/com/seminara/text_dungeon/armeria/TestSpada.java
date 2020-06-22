package com.seminara.text_dungeon.armeria;
import com.seminara.text_dungeon.pietra.*;

public class TestSpada {

    private static void printRed(String str){
        System.out.println("\u001B[31m"+str+ "\u001B[0m");
    }

    private static void printGreen(String str){
        System.out.println("\u001B[32m"+str+ "\u001B[0m");
    }

    public static boolean testGetTipoSpadaPietraGrigia() {
        Spada spada = new Spada(new PietraGrigia());
        if  (spada.getTipo().equals("Spada con Pietra Grigia")) {
            printGreen("TestSpada.testGetTipoSpadaPietraGrigia(): OK");
            return true;
        }
        else {
            printRed("TestSpada.testGetTipoSpadaPietraGrigia(): FAILED");
            return false;
        }
    }

    public static boolean testGetTipoSpadaPietraBianca() {
        Spada spada = new Spada(new PietraBianca());
        if  (spada.getTipo().equals("Spada con Pietra Bianca")) {
            printGreen("TestSpada.testGetTipoSpadaPietraBianca(): OK");
            return true;
        }
        else {
            printRed("TestSpada.testGetTipoSpadaPietraBianca(): FAILED");
            return false;
        }
    }

    public static boolean testGetTipoSpadaPietraNera() {
        Spada spada = new Spada(new PietraNera());
        if  (spada.getTipo().equals("Spada con Pietra Nera")) {
            printGreen("TestSpada.testGetTipoSpadaPietraNera(): OK");
            return true;
        }
        else {
            printRed("TestSpada.testGetTipoSpadaPietraNera(): FAILED");
            return false;
        }
    }

    public static boolean testGetDannoSpadaPietraGrigia() {
        Spada spada = new Spada(new PietraGrigia());
        float danno = spada.getDanno();
        if  (danno >= 5f && danno <= 62f) {
            printGreen("TestSpada.testGetDannoSpadaPietraGrigia(): OK");
            return true;
        }
        else {
            printRed("TestSpada.testGetDannoSpadaPietraGrigia(): FAILED");
            return false;
        }
    }

    public static boolean testGetDannoSpadaPietraBianca() {
        Spada spada = new Spada(new PietraBianca());
        float danno = spada.getDanno();
        if  (danno >= 5f && danno <= 68f) {
            printGreen("TestSpada.testGetDannoSpadaPietraBianca(): OK");
            return true;
        }
        else {
            printRed("TestSpada.testGetDannoSpadaPietraBianca(): FAILED");
            return false;
        }
    }
    
    public static boolean testGetDannoSpadaPietraNera() {
        Spada spada = new Spada(new PietraNera());
        float danno = spada.getDanno();
        if  (danno >= 5f && danno <= 77f) {
            printGreen("TestSpada.testGetDannoSpadaPietraNera(): OK");
            return true;
        }
        else {
            printRed("TestSpada.testGetDannoSpadaPietraNera(): FAILED");
            return false;
        }
    }
    
}