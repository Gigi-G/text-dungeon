package com.seminara.text_dungeon;

public class TestMannaia {

    public static boolean testGetTipoMannaiaPietraGrigia() {
        Mannaia mannaia = new Mannaia(new PietraGrigia());
        if  (mannaia.getTipo().equals("Mannaia con Pietra Grigia")) {
            System.out.println("TestMannaia.testGetTipoMannaiaPietraGrigia(): OK");
            return true;
        }
        else {
            System.out.println("TestMannaia.testGetTipoMannaiaPietraGrigia(): FAILED");
            return false;
        }
    }

    public static boolean testGetTipoMannaiaPietraBianca() {
        Mannaia mannaia = new Mannaia(new PietraBianca());
        if  (mannaia.getTipo().equals("Mannaia con Pietra Bianca")) {
            System.out.println("TestMannaia.testGetTipoMannaiaPietraBianca(): OK");
            return true;
        }
        else {
            System.out.println("TestMannaia.testGetTipoMannaiaPietraBianca(): FAILED");
            return false;
        }
    }

    public static boolean testGetTipoMannaiaPietraNera() {
        Mannaia mannaia = new Mannaia(new PietraNera());
        if  (mannaia.getTipo().equals("Mannaia con Pietra Nera")) {
            System.out.println("TestMannaia.testGetTipoMannaiaPietraNera(): OK");
            return true;
        }
        else {
            System.out.println("TestMannaia.testGetTipoMannaiaPietraNera(): FAILED");
            return false;
        }
    }

    public static boolean testGetDannoMannaiaPietraGrigia() {
        Mannaia mannaia = new Mannaia(new PietraGrigia());
        float danno = mannaia.getDanno();
        if  (danno >= 10f && danno <= 42f) {
            System.out.println("TestMannaia.testGetDannoMannaiaPietraGrigia(): OK");
            return true;
        }
        else {
            System.out.println("TestMannaia.testGetDannoMannaiaPietraGrigia(): FAILED");
            return false;
        }
    }

    public static boolean testGetDannoMannaiaPietraBianca() {
        Mannaia mannaia = new Mannaia(new PietraBianca());
        float danno = mannaia.getDanno();
        if  (danno >= 10f && danno <= 46f) {
            System.out.println("TestMannaia.testGetDannoMannaiaPietraBianca(): OK");
            return true;
        }
        else {
            System.out.println("TestMannaia.testGetDannoMannaiaPietraBianca(): FAILED");
            return false;
        }
    }
    
    public static boolean testGetDannoMannaiaPietraNera() {
        Mannaia mannaia = new Mannaia(new PietraNera());
        float danno = mannaia.getDanno();
        if  (danno >= 10f && danno <= 52f) {
            System.out.println("TestMannaia.testGetDannoMannaiaPietraNera(): OK");
            return true;
        }
        else {
            System.out.println("TestMannaia.testGetDannoMannaiaPietraNera(): FAILED");
            return false;
        }
    }
    
}