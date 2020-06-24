package com.seminara.text_dungeon.nemico;

import com.seminara.text_dungeon.stato_combattimento.GeneraStato;

public class TestNemico extends Nemico {
    
    public TestNemico() {
        tipo = "Test";
        stato = GeneraStato.generaStato("2");
        vita = 200f;
        minDanno = 10;
        maxDanno = 50;
    }

    public static boolean testNemico() {
        TestNemico nemico = new TestNemico();
        if(nemico.getNome() == "Test") {
            System.out.println("TestNemico.testNemico(): OK");
            return true;
        }
        else {
            System.out.println("TestNemico.testNemico(): FAILED");
            return false;
        }
    }

    public static boolean testApplicaDanno() {
        TestNemico nemico = new TestNemico();
        nemico.applicaDanno(50f);
        if(nemico.getVita() == 150f) {
            System.out.println("TestNemico.testApplicaDanno(): OK");
            return true;
        }
        else {
            System.out.println("TestNemico.testApplicaDanno(): FAILED");
            return false;
        }
    }

    public static boolean testInfliggiDanno() {
        TestNemico nemico = new TestNemico();
        float danno = nemico.infliggiDanno();
        if(danno >= 5f && danno <= 50f) {
            System.out.println("TestNemico.testInfliggiDanno(): OK");
            return true;
        }
        else {
            System.out.println("TestNemico.testInfliggiDanno(): FAILED");
            return false;
        }
    }

    public static boolean testIsSconfitto1() {
        TestNemico nemico = new TestNemico();
        nemico.applicaDanno(200f);
        if(nemico.isSconfitto()) {
            System.out.println("TestNemico.testIsSconfitto1(): OK");
            return true;
        }
        else {
            System.out.println("TestNemico.testIsSconfitto1(): FAILED");
            return false;
        }
    }

    public static boolean testIsSconfitto2() {
        TestNemico nemico = new TestNemico();
        nemico.applicaDanno(199f);
        if(!nemico.isSconfitto()) {
            System.out.println("TestNemico.testIsSconfitto2(): OK");
            return true;
        }
        else {
            System.out.println("TestNemico.testIsSconfitto2(): FAILED");
            return false;
        }
    }

    public static boolean testGetVita1() {
        TestNemico nemico = new TestNemico();
        nemico.applicaDanno(100f);
        if(nemico.getVita() == 100f) {
            System.out.println("TestNemico.testGetVita1(): OK");
            return true;
        }
        else {
            System.out.println("TestNemico.testGetVita1(): FAILED");
            return false;
        }
    }

    public static boolean testGetVita2() {
        TestNemico nemico = new TestNemico();
        nemico.applicaDanno(201f);
        if(nemico.getVita() == 0f) {
            System.out.println("TestNemico.testGetVita2(): OK");
            return true;
        }
        else {
            System.out.println("TestNemico.testGetVita2(): FAILED");
            return false;
        }
    }

    public static boolean testGetStatoCombattimento() {
        TestNemico nemico = new TestNemico();
        if(nemico.getStatoCombattimento().equals("Difesa")) {
            System.out.println("TestNemico.testGetStatoCombattimento(): OK");
            return true;
        }
        else {
            System.out.println("TestNemico.testGetStatoCombattimento(): FAILED");
            return false;
        }
    }

    public static boolean testSetStatoCombattimento() {
        TestNemico nemico = new TestNemico();
        nemico.setStatoCombattimento();
        if(nemico.getStatoCombattimento().equals("Assalto") || nemico.getStatoCombattimento().equals("Difesa") || nemico.getStatoCombattimento().equals("Attacco")) {
            System.out.println("TestNemico.testSetStatoCombattimento(): OK");
            return true;
        }
        else {
            System.out.println("TestNemico.testSetStatoCombattimento(): FAILED");
            return false;
        }
    }
}