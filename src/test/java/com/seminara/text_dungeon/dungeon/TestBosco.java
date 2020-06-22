package com.seminara.text_dungeon.dungeon;

import com.seminara.text_dungeon.dungeon.Dungeon.TipoNemico;
import com.seminara.text_dungeon.nemico.*;


public class TestBosco {
    
    public static boolean testGetNemicoGoblinBosco() {
        Dungeon dungeon = new Bosco();
        INemico nemico = dungeon.getNemico(TipoNemico.FACILE);
        if(nemico.getNome() == "Goblin") {
            System.out.println("TestBosco.testGetNemicoGoblin(): OK");
            return true;
        }
        else {
            System.out.println("TestBosco.testGetNemicoGoblin(): FAILED");
            return false;
        }
    }

    public static boolean testGetNemicoChimeraBosco() {
        Dungeon dungeon = new Bosco();
        INemico nemico = dungeon.getNemico(TipoNemico.MEDIO);
        if(nemico.getNome() == "Chimera") {
            System.out.println("TestBosco.testGetNemicoChimera(): OK");
            return true;
        }
        else {
            System.out.println("TestBosco.testGetNemicoChimera(): FAILED");
            return false;
        }
    }

    public static boolean testGetNemicoStregaBosco() {
        Dungeon dungeon = new Bosco();
        INemico nemico = dungeon.getNemico(TipoNemico.DIFFICILE);
        if(nemico.getNome() == "Strega") {
            System.out.println("TestBosco.testGetNemicoStrega(): OK");
            return true;
        }
        else {
            System.out.println("TestBosco.testGetNemicoStrega(): FAILED");
            return false;
        }
    }

    public static boolean testGetNemicoNullBosco() {
        Dungeon dungeon = new Bosco();
        INemico nemico = dungeon.getNemico(null);
        if(nemico == null) {
            System.out.println("TestBosco.testGetNemicoNull(): OK");
            return true;
        }
        else {
            System.out.println("TestBosco.testGetNemicoNull(): FAILED");
            return false;
        }
    }

    public static boolean testEsploraBosco() {
        Dungeon dungeon = new Bosco();
        INemico nemico = dungeon.esplora();
        if(nemico.getNome() == "Goblin" && dungeon.getLivello() == 1) {
            System.out.println("TestBosco.testEsploraBosco(): OK");
            return true;
        }
        else {
            System.out.println("TestBosco.testEsploraBosco(): FAILED");
            return false;
        }
    }

}