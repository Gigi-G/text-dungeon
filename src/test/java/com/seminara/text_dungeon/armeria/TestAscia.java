package com.seminara.text_dungeon.armeria;
import com.seminara.text_dungeon.pietra.*;

public class TestAscia {

    private static void printRed(String str){
        System.out.println("\u001B[31m"+str+ "\u001B[0m");
    }

    private static void printGreen(String str){
        System.out.println("\u001B[32m"+str+ "\u001B[0m");
    }
    
    public static boolean testGetTipoAsciaPietraGrigia() {
        Ascia ascia = new Ascia(new PietraGrigia());
        if  (ascia.getTipo().equals("Ascia con Pietra Grigia")) {
            printGreen("TestAscia.testGetTipoAsciaPietraGrigia(): OK");
            return true;
        }
        else {
            printRed("TestAscia.testGetTipoAsciaPietraGrigia(): FAILED");
            return false;
        }
    }

    public static boolean testGetTipoAsciaPietraBianca() {
        Ascia ascia = new Ascia(new PietraBianca());
        if  (ascia.getTipo().equals("Ascia con Pietra Bianca")) {
            printGreen("TestAscia.testGetTipoAsciaPietraBianca(): OK");
            return true;
        }
        else {
            printRed("TestAscia.testGetTipoAsciaPietraBianca(): FAILED");
            return false;
        }
    }

    public static boolean testGetTipoAsciaPietraNera() {
        Ascia ascia = new Ascia(new PietraNera());
        if  (ascia.getTipo().equals("Ascia con Pietra Nera")) {
            printGreen("TestAscia.testGetTipoAsciaPietraNera(): OK");
            return true;
        }
        else {
            printRed("TestAscia.testGetTipoAsciaPietraNera(): FAILED");
            return false;
        }
    }

    public static boolean testGetDannoAsciaPietraGrigia() {
        Ascia ascia = new Ascia(new PietraGrigia());
        float danno = ascia.getDanno();
        if  (danno >= 20f && danno <= 52f) {
            printGreen("TestAscia.testGetDannoAsciaPietraGrigia(): OK");
            return true;
        }
        else {
            printRed("TestAscia.testGetDannoAsciaPietraGrigia(): FAILED");
            return false;
        }
    }

    public static boolean testGetDannoAsciaPietraBianca() {
        Ascia ascia = new Ascia(new PietraBianca());
        float danno = ascia.getDanno();
        if  (danno >= 20f && danno <= 57f) {
            printGreen("TestAscia.testGetDannoAsciaPietraBianca(): OK");
            return true;
        }
        else {
            printRed("TestAscia.testGetDannoAsciaPietraBianca(): FAILED");
            return false;
        }
    }
    
    public static boolean testGetDannoAsciaPietraNera() {
        Ascia ascia = new Ascia(new PietraNera());
        float danno = ascia.getDanno();
        if  (danno >= 20f && danno <= 64.5f) {
            printGreen("TestAscia.testGetDannoAsciaPietraNera(): OK");
            return true;
        }
        else {
            printRed("TestAscia.testGetDannoAsciaPietraNera(): FAILED");
            return false;
        }
    }

}