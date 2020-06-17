package com.seminara.text_dungeon.armeria;

public class TestGeneraArma {

    public static boolean testGetAscia() {
        IArma arma = GeneraArma.getInstance().getArma(0);
        if(arma.getTipo().contains("Ascia")) {
            System.out.println("TestGeneraArma.testGetAscia(): OK");
            return true;
        }
        else {
            System.out.println("TestGeneraArma.testGetAscia(): FAILED");
            return false;
        }
    }

    public static boolean testGetMannaia() {
        IArma arma = GeneraArma.getInstance().getArma(1);
        if(arma.getTipo().contains("Mannaia")) {
            System.out.println("TestGeneraArma.testGetMannaia(): OK");
            return true;
        }
        else {
            System.out.println("TestGeneraArma.testGetMannaia(): FAILED");
            return false;
        }
    }

    public static boolean testGetSpada() {
        IArma arma = GeneraArma.getInstance().getArma(2);
        if(arma.getTipo().contains("Spada")) {
            System.out.println("TestGeneraArma.testGetSpada(): OK");
            return true;
        }
        else {
            System.out.println("TestGeneraArma.testGetSpada(): FAILED");
            return false;
        }
    }
    
}