package com.seminara.text_dungeon.dungeon;

import com.seminara.text_dungeon.dungeon.Dungeon.TipoNemico;
import com.seminara.text_dungeon.nemico.*;

public class TestDeserto {
    
    public static boolean testGetNemicoGoblinDeserto() {
        Dungeon dungeon = new Deserto();
        Nemico nemico = dungeon.getNemico(TipoNemico.FACILE);
        if(nemico.getNome() == "Goblin") {
            System.out.println("TestDeserto.testGetNemicoGoblin(): OK");
            return true;
        }
        else {
            System.out.println("TestDeserto.testGetNemicoGoblin(): FAILED");
            return false;
        }
    }

    public static boolean testGetNemicoChimeraDeserto() {
        Dungeon dungeon = new Deserto();
        Nemico nemico = dungeon.getNemico(TipoNemico.MEDIO);
        if(nemico.getNome() == "Chimera") {
            System.out.println("TestDeserto.testGetNemicoChimera(): OK");
            return true;
        }
        else {
            System.out.println("TestDeserto.testGetNemicoChimera(): FAILED");
            return false;
        }
    }

    public static boolean testGetNemicoCiclopeDeserto() {
        Dungeon dungeon = new Deserto();
        Nemico nemico = dungeon.getNemico(TipoNemico.DIFFICILE);
        if(nemico.getNome() == "Ciclope") {
            System.out.println("TestDeserto.testGetNemicoCiclope(): OK");
            return true;
        }
        else {
            System.out.println("TestDeserto.testGetNemicoCiclope(): FAILED");
            return false;
        }
    }

    public static boolean testGetNemicoNullDeserto() {
        Dungeon dungeon = new Deserto();
        Nemico nemico = dungeon.getNemico(null);
        if(nemico == null) {
            System.out.println("TestDeserto.testGetNemicoNull(): OK");
            return true;
        }
        else {
            System.out.println("TestDeserto.testGetNemicoNull(): FAILED");
            return false;
        }
    }

    public static boolean testEsploraDeserto() {
        Dungeon dungeon = new Deserto();
        Nemico nemico = dungeon.esplora();
        if(nemico.getNome() == "Goblin" && dungeon.getLivello() == 1) {
            System.out.println("TestDeserto.testEsploraDeserto(): OK");
            return true;
        }
        else {
            System.out.println("TestDeserto.testEsploraDeserto(): FAILED");
            return false;
        }
    }

}