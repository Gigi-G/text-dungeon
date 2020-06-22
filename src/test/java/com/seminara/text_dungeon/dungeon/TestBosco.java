package com.seminara.text_dungeon.dungeon;

import com.seminara.text_dungeon.dungeon.Dungeon.TipoNemico;
import com.seminara.text_dungeon.nemico.*;


public class TestBosco {

    private static void printRed(String str){
        System.out.println("\u001B[31m"+str+ "\u001B[0m");
    }

    private static void printGreen(String str){
        System.out.println("\u001B[32m"+str+ "\u001B[0m");
    }
    
    public static boolean testGetNemicoGoblinBosco() {
        Dungeon dungeon = new Bosco();
        INemico nemico = dungeon.getNemico(TipoNemico.FACILE);
        if(nemico.getNome() == "Goblin") {
            printGreen("TestBosco.testGetNemicoGoblin(): OK");
            return true;
        }
        else {
            printRed("TestBosco.testGetNemicoGoblin(): FAILED");
            return false;
        }
    }

    public static boolean testGetNemicoChimeraBosco() {
        Dungeon dungeon = new Bosco();
        INemico nemico = dungeon.getNemico(TipoNemico.MEDIO);
        if(nemico.getNome() == "Chimera") {
            printGreen("TestBosco.testGetNemicoChimera(): OK");
            return true;
        }
        else {
            printRed("TestBosco.testGetNemicoChimera(): FAILED");
            return false;
        }
    }

    public static boolean testGetNemicoStregaBosco() {
        Dungeon dungeon = new Bosco();
        INemico nemico = dungeon.getNemico(TipoNemico.DIFFICILE);
        if(nemico.getNome() == "Strega") {
            printGreen("TestBosco.testGetNemicoStrega(): OK");
            return true;
        }
        else {
            printRed("TestBosco.testGetNemicoStrega(): FAILED");
            return false;
        }
    }

    public static boolean testGetNemicoNullBosco() {
        Dungeon dungeon = new Bosco();
        INemico nemico = dungeon.getNemico(null);
        if(nemico == null) {
            printGreen("TestBosco.testGetNemicoNull(): OK");
            return true;
        }
        else {
            printRed("TestBosco.testGetNemicoNull(): FAILED");
            return false;
        }
    }

    public static boolean testEsploraBosco() {
        Dungeon dungeon = new Bosco();
        INemico nemico = dungeon.esplora();
        if(nemico.getNome() == "Goblin" && dungeon.getLivello() == 1) {
            printGreen("TestBosco.testEsploraBosco(): OK");
            return true;
        }
        else {
            printRed("TestBosco.testEsploraBosco(): FAILED");
            return false;
        }
    }

}