package com.seminara.text_dungeon;

public class TestSpada {

    public static boolean testGetTipoSpadaPietraGrigia() {
        Spada spada = new Spada(new PietraGrigia());
        if  (spada.getTipo().equals("Spada con Pietra Grigia")) {
            System.out.println("TestSpada.testGetTipoSpadaPietraGrigia(): OK");
            return true;
        }
        else {
            System.out.println("TestSpada.testGetTipoSpadaPietraGrigia(): FAILED");
            return false;
        }
    }

    public static boolean testGetTipoSpadaPietraBianca() {
        Spada spada = new Spada(new PietraBianca());
        if  (spada.getTipo().equals("Spada con Pietra Bianca")) {
            System.out.println("TestSpada.testGetTipoSpadaPietraBianca(): OK");
            return true;
        }
        else {
            System.out.println("TestSpada.testGetTipoSpadaPietraBianca(): FAILED");
            return false;
        }
    }

    public static boolean testGetTipoSpadaPietraNera() {
        Spada spada = new Spada(new PietraNera());
        if  (spada.getTipo().equals("Spada con Pietra Nera")) {
            System.out.println("TestSpada.testGetTipoSpadaPietraNera(): OK");
            return true;
        }
        else {
            System.out.println("TestSpada.testGetTipoSpadaPietraNera(): FAILED");
            return false;
        }
    }

    public static boolean testGetDannoSpadaPietraGrigia() {
        Spada spada = new Spada(new PietraGrigia());
        float danno = spada.getDanno();
        if  (danno >= 5f && danno <= 62f) {
            System.out.println("TestSpada.testGetDannoSpadaPietraGrigia(): OK");
            return true;
        }
        else {
            System.out.println("TestSpada.testGetDannoSpadaPietraGrigia(): FAILED");
            return false;
        }
    }

    public static boolean testGetDannoSpadaPietraBianca() {
        Spada spada = new Spada(new PietraBianca());
        float danno = spada.getDanno();
        if  (danno >= 5f && danno <= 68f) {
            System.out.println("TestSpada.testGetDannoSpadaPietraBianca(): OK");
            return true;
        }
        else {
            System.out.println("TestSpada.testGetDannoSpadaPietraBianca(): FAILED");
            return false;
        }
    }
    
    public static boolean testGetDannoSpadaPietraNera() {
        Spada spada = new Spada(new PietraNera());
        float danno = spada.getDanno();
        if  (danno >= 5f && danno <= 77f) {
            System.out.println("TestSpada.testGetDannoSpadaPietraNera(): OK");
            return true;
        }
        else {
            System.out.println("TestSpada.testGetDannoSpadaPietraNera(): FAILED");
            return false;
        }
    }
    
}