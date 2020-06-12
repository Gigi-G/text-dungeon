package com.seminara.text_dungeon;

public class TestAscia {
    
    public static boolean testGetTipoAsciaPietraGrigia() {
        Ascia ascia = new Ascia(new PietraGrigia());
        if  (ascia.getTipo().equals("Ascia con Pietra Grigia")) {
            System.out.println("TestAscia.testGetTipoAsciaPietraGrigia(): OK");
            return true;
        }
        else {
            System.out.println("TestAscia.testGetTipoAsciaPietraGrigia(): FAILED");
            return false;
        }
    }

    public static boolean testGetTipoAsciaPietraBianca() {
        Ascia ascia = new Ascia(new PietraBianca());
        if  (ascia.getTipo().equals("Ascia con Pietra Bianca")) {
            System.out.println("TestAscia.testGetTipoAsciaPietraBianca(): OK");
            return true;
        }
        else {
            System.out.println("TestAscia.testGetTipoAsciaPietraBianca(): FAILED");
            return false;
        }
    }

    public static boolean testGetTipoAsciaPietraNera() {
        Ascia ascia = new Ascia(new PietraNera());
        if  (ascia.getTipo().equals("Ascia con Pietra Nera")) {
            System.out.println("TestAscia.testGetTipoAsciaPietraNera(): OK");
            return true;
        }
        else {
            System.out.println("TestAscia.testGetTipoAsciaPietraNera(): FAILED");
            return false;
        }
    }

    public static boolean testGetDannoAsciaPietraGrigia() {
        Ascia ascia = new Ascia(new PietraGrigia());
        float danno = ascia.getDanno();
        if  (danno >= 20f && danno <= 52f) {
            System.out.println("TestAscia.testGetDannoAsciaPietraGrigia(): OK");
            return true;
        }
        else {
            System.out.println("TestAscia.testGetDannoAsciaPietraGrigia(): FAILED");
            return false;
        }
    }

    public static boolean testGetDannoAsciaPietraBianca() {
        Ascia ascia = new Ascia(new PietraBianca());
        float danno = ascia.getDanno();
        if  (danno >= 20f && danno <= 57f) {
            System.out.println("TestAscia.testGetDannoAsciaPietraBianca(): OK");
            return true;
        }
        else {
            System.out.println("TestAscia.testGetDannoAsciaPietraBianca(): FAILED");
            return false;
        }
    }
    
    public static boolean testGetDannoAsciaPietraNera() {
        Ascia ascia = new Ascia(new PietraNera());
        float danno = ascia.getDanno();
        if  (danno >= 20f && danno <= 64.5f) {
            System.out.println("TestAscia.testGetDannoAsciaPietraNera(): OK");
            return true;
        }
        else {
            System.out.println("TestAscia.testGetDannoAsciaPietraNera(): FAILED");
            return false;
        }
    }

    public static boolean testGeneraDannoAscia() {
        Ascia ascia = new Ascia(new PietraGrigia());
        float danno = ascia.generaDanno();
        if  (danno >= 20f && danno <= 52f) {
            System.out.println("TestAscia.testGeneraDannoAscia(): OK");
            return true;
        }
        else {
            System.out.println("TestAscia.testGeneraDannoAscia(): FAILED");
            return false;
        }
    }
}