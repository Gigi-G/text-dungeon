package com.seminara.text_dungeon.armeria;
import com.seminara.text_dungeon.pietra.*;

public class TestMannaia {

    static void printRed(String str){
        System.out.println("\u001B[31m"+str+ "\u001B[0m");
    }

    static void printGreen(String str){
        System.out.println("\u001B[32m"+str+ "\u001B[0m");
    }

    public static boolean testGetTipoMannaiaPietraGrigia() {
        Mannaia mannaia = new Mannaia(new PietraGrigia());
        if  (mannaia.getTipo().equals("Mannaia con Pietra Grigia")) {
            printGreen("TestMannaia.testGetTipoMannaiaPietraGrigia(): OK");
            return true;
        }
        else {
            printRed("TestMannaia.testGetTipoMannaiaPietraGrigia(): FAILED");
            return false;
        }
    }

    public static boolean testGetTipoMannaiaPietraBianca() {
        Mannaia mannaia = new Mannaia(new PietraBianca());
        if  (mannaia.getTipo().equals("Mannaia con Pietra Bianca")) {
            printGreen("TestMannaia.testGetTipoMannaiaPietraBianca(): OK");
            return true;
        }
        else {
            printRed("TestMannaia.testGetTipoMannaiaPietraBianca(): FAILED");
            return false;
        }
    }

    public static boolean testGetTipoMannaiaPietraNera() {
        Mannaia mannaia = new Mannaia(new PietraNera());
        if  (mannaia.getTipo().equals("Mannaia con Pietra Nera")) {
            printGreen("TestMannaia.testGetTipoMannaiaPietraNera(): OK");
            return true;
        }
        else {
            printRed("TestMannaia.testGetTipoMannaiaPietraNera(): FAILED");
            return false;
        }
    }

    public static boolean testGetDannoMannaiaPietraGrigia() {
        Mannaia mannaia = new Mannaia(new PietraGrigia());
        float danno = mannaia.getDanno();
        if  (danno >= 10f && danno <= 42f) {
            printGreen("TestMannaia.testGetDannoMannaiaPietraGrigia(): OK");
            return true;
        }
        else {
            printRed("TestMannaia.testGetDannoMannaiaPietraGrigia(): FAILED");
            return false;
        }
    }

    public static boolean testGetDannoMannaiaPietraBianca() {
        Mannaia mannaia = new Mannaia(new PietraBianca());
        float danno = mannaia.getDanno();
        if  (danno >= 10f && danno <= 46f) {
            printGreen("TestMannaia.testGetDannoMannaiaPietraBianca(): OK");
            return true;
        }
        else {
            printRed("TestMannaia.testGetDannoMannaiaPietraBianca(): FAILED");
            return false;
        }
    }
    
    public static boolean testGetDannoMannaiaPietraNera() {
        Mannaia mannaia = new Mannaia(new PietraNera());
        float danno = mannaia.getDanno();
        if  (danno >= 10f && danno <= 52f) {
            printGreen("TestMannaia.testGetDannoMannaiaPietraNera(): OK");
            return true;
        }
        else {
            printRed("TestMannaia.testGetDannoMannaiaPietraNera(): FAILED");
            return false;
        }
    }
    
}