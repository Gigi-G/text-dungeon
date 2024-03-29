package com.seminara.text_dungeon.nemico;

public class TestChimera {
    
    public static boolean testChimera() {
        Chimera chimera = new Chimera();
        if(chimera.getNome() == "Chimera") {
            System.out.println("TestChimera.testChimera(): OK");
            return true;
        }
        else {
            System.out.println("TestChimera.testChimera(): FAILED");
            return false;
        }
    }

    public static boolean testApplicaDannoChimera() {
        Chimera chimera = new Chimera();
        chimera.applicaDanno(50f);
        if(chimera.getVita() == 200f) {
            System.out.println("TestChimera.testApplicaDannoChimera(): OK");
            return true;
        }
        else {
            System.out.println("TestChimera.testApplicaDannoChimera(): FAILED");
            return false;
        }
    }

    public static boolean testAffliggiDannoChimera() {
        Chimera chimera = new Chimera();
        float danno = chimera.infliggiDanno();
        if(danno >= 20f && danno <= 82f) {
            System.out.println("TestChimera.testAffliggiDannoChimera(): OK");
            return true;
        }
        else {
            System.out.println("TestChimera.testAffliggiDannoChimera(): FAILED");
            return false;
        }
    }

    public static boolean testIsSconfittoChimera1() {
        Chimera chimera = new Chimera();
        chimera.applicaDanno(250f);
        if(chimera.isSconfitto()) {
            System.out.println("TestChimera.testIsSconfittoChimera1(): OK");
            return true;
        }
        else {
            System.out.println("TestChimera.testIsSconfittoChimera1(): FAILED");
            return false;
        }
    }

    public static boolean testIsSconfittoChimera2() {
        Chimera chimera = new Chimera();
        chimera.applicaDanno(249f);
        if(!chimera.isSconfitto()) {
            System.out.println("TestChimera.testIsSconfittoChimera2(): OK");
            return true;
        }
        else {
            System.out.println("TestChimera.testIsSconfittoChimera2(): FAILED");
            return false;
        }
    }

    public static boolean testGetVitaChimera1() {
        Chimera chimera = new Chimera();
        chimera.applicaDanno(200f);
        if(chimera.getVita() == 50f) {
            System.out.println("TestChimera.testGetVitaChimera1(): OK");
            return true;
        }
        else {
            System.out.println("TestChimera.testGetVitaChimera1(): FAILED");
            return false;
        }
    }

    public static boolean testGetVitaChimera2() {
        Chimera chimera = new Chimera();
        chimera.applicaDanno(251f);
        if(chimera.getVita() == 0f) {
            System.out.println("TestChimera.testGetVitaChimera2(): OK");
            return true;
        }
        else {
            System.out.println("TestChimera.testGetVitaChimera2(): FAILED");
            return false;
        }
    }

    public static boolean testGetStatoCombattimentoChimera() {
        Chimera chimera = new Chimera();
        if(chimera.getStatoCombattimento().equals("Attacco")) {
            System.out.println("TestChimera.testGetStatoCombattimentoChimera(): OK");
            return true;
        }
        else {
            System.out.println("TestChimera.testGetStatoCombattimentoChimera(): FAILED");
            return false;
        }
    }
    
}