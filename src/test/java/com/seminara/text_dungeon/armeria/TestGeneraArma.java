package com.seminara.text_dungeon.armeria;

public class TestGeneraArma {

    private static void printRed(String str){
        System.out.println("\u001B[31m"+str+ "\u001B[0m");
    }

    private static void printGreen(String str){
        System.out.println("\u001B[32m"+str+ "\u001B[0m");
    }

    public static boolean testGetAscia() {
        IArma arma = GeneraArma.getArma(0);
        if(arma.getTipo().contains("Ascia")) {
            printGreen("TestGeneraArma.testGetAscia(): OK");
            return true;
        }
        else {
            printRed("TestGeneraArma.testGetAscia(): FAILED");
            return false;
        }
    }

    public static boolean testGetMannaia() {
        IArma arma = GeneraArma.getArma(1);
        if(arma.getTipo().contains("Mannaia")) {
            printGreen("TestGeneraArma.testGetMannaia(): OK");
            return true;
        }
        else {
            printRed("TestGeneraArma.testGetMannaia(): FAILED");
            return false;
        }
    }

    public static boolean testGetSpada() {
        IArma arma = GeneraArma.getArma(2);
        if(arma.getTipo().contains("Spada")) {
            printGreen("TestGeneraArma.testGetSpada(): OK");
            return true;
        }
        else {
            printRed("TestGeneraArma.testGetSpada(): FAILED");
            return false;
        }
    }
    
    public static boolean testGetDefault() {
        IArma arma = GeneraArma.getArma(132465);
        if(arma.getTipo().contains("Ascia")) {
            printGreen("TestGeneraArma.testGetSpada(): OK");
            return true;
        }
        else {
            printRed("TestGeneraArma.testGetSpada(): FAILED");
            return false;
        }
    }
}