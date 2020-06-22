package com.seminara.text_dungeon;

public class Coloring {

    private static final String RESET = "\u001B[0m";

    private Coloring() {}

    public static void printblue(String str) {
        System.out.println("\u001B[34m" + str + RESET);
    }

    public static void printcyan(String str) {
        System.out.println("\u001B[36m" + str + RESET);
    }

    public static void printpurple(String str) {
        System.out.println("\u001B[35m" + str + RESET);
    }

    public static void printyellow(String str) {
        System.out.println("\u001B[33m" + str + RESET);
    }

    public static void printmagenta(String str) {
        System.out.println("\u001b[35m" + str + RESET);
    }

    public static void printred(String str){
        System.out.println("\u001B[31m"+str+ RESET);
    }

    public static void printgreen(String str){
        System.out.println("\u001B[32m"+str+ RESET);
    }
    
}