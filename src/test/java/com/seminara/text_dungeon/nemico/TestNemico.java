package com.seminara.text_dungeon.nemico;

import com.seminara.text_dungeon.stato_personaggio.GeneraStato;

public class TestNemico extends Nemico {
    
    public TestNemico() {
        tipo = "Test";
        stato = GeneraStato.generaStato("2");
        vita = 200f;
        min = 10;
        max = 50;
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
            System.out.println("TestTestNemico.testApplicaDanno(): OK");
            return true;
        }
        else {
            System.out.println("TestTestNemico.testApplicaDanno(): FAILED");
            return false;
        }
    }

    public static boolean testInfliggiDanno() {
        TestNemico nemico = new TestNemico();
        float danno = nemico.infliggiDanno();
        if(danno >= 5f && danno <= 50f) {
            System.out.println("TestTestNemico.testInfliggiDanno(): OK");
            return true;
        }
        else {
            System.out.println("TestTestNemico.testInfliggiDanno(): FAILED");
            return false;
        }
    }

    public static boolean testIsSconfitto1() {
        TestNemico nemico = new TestNemico();
        nemico.applicaDanno(200f);
        if(nemico.isSconfitto()) {
            System.out.println("TestTestNemico.testIsSconfitto1(): OK");
            return true;
        }
        else {
            System.out.println("TestTestNemico.testIsSconfitto1(): FAILED");
            return false;
        }
    }

    public static boolean testIsSconfitto2() {
        TestNemico nemico = new TestNemico();
        nemico.applicaDanno(199f);
        if(!nemico.isSconfitto()) {
            System.out.println("TestTestNemico.testIsSconfitto2(): OK");
            return true;
        }
        else {
            System.out.println("TestTestNemico.testIsSconfitto2(): FAILED");
            return false;
        }
    }

    public static boolean testGetVita() {
        TestNemico nemico = new TestNemico();
        nemico.applicaDanno(100f);
        if(nemico.getVita() == 100f) {
            System.out.println("TestTestNemico.testGetVita(): OK");
            return true;
        }
        else {
            System.out.println("TestTestNemico.testGetVita(): FAILED");
            return false;
        }
    }

    public static boolean testGetStatoCombattimento() {
        TestNemico nemico = new TestNemico();
        if(nemico.getStatoCombattimento().equals("Difesa")) {
            System.out.println("TestTestNemico.testGetStatoCombattimento(): OK");
            return true;
        }
        else {
            System.out.println("TestTestNemico.testGetStatoCombattimento(): FAILED");
            return false;
        }
    }

    public static boolean testSetStatoCombattimento() {
        TestNemico nemico = new TestNemico();
        nemico.setStatoCombattimento();
        if(nemico.getStatoCombattimento().equals("Assalto") || nemico.getStatoCombattimento().equals("Difesa") || nemico.getStatoCombattimento().equals("Attacco")) {
            System.out.println("TestTestNemico.testSetStatoCombattimento(): OK");
            return true;
        }
        else {
            System.out.println("TestTestNemico.testSetStatoCombattimento(): FAILED");
            return false;
        }
    }
}