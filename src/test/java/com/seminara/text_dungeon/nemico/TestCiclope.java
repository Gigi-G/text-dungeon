package com.seminara.text_dungeon.nemico;

public class TestCiclope {
    
    public static boolean testCiclope() {
        Ciclope ciclope = new Ciclope();
        if(ciclope.getNome() == "Ciclope") {
            System.out.println("TestCiclope.testCiclope(): OK");
            return true;
        }
        else {
            System.out.println("TestCiclope.testCiclope(): FAILED");
            return false;
        }
    }

    public static boolean testApplicaDannoCiclope() {
        Ciclope ciclope = new Ciclope();
        ciclope.applicaDanno(50f);
        if(ciclope.getVita() == 450f) {
            System.out.println("TestCiclope.testApplicaDannoCiclope(): OK");
            return true;
        }
        else {
            System.out.println("TestCiclope.testApplicaDannoCiclope(): FAILED");
            return false;
        }
    }

    public static boolean testAffliggiDannoCiclope() {
        Ciclope ciclope = new Ciclope();
        float danno = ciclope.affliggiDanno();
        if(danno >= 50f && danno <= 102f) {
            System.out.println("TestCiclope.testAffliggiDannoCiclope(): OK");
            return true;
        }
        else {
            System.out.println("TestCiclope.testAffliggiDannoCiclope(): FAILED");
            return false;
        }
    }

    public static boolean testIsSconfittoCiclope1() {
        Ciclope ciclope = new Ciclope();
        ciclope.applicaDanno(500f);
        if(ciclope.isSconfitto()) {
            System.out.println("TestCiclope.testIsSconfittoCiclope1(): OK");
            return true;
        }
        else {
            System.out.println("TestCiclope.testIsSconfittoCiclope1(): FAILED");
            return false;
        }
    }

    public static boolean testIsSconfittoCiclope2() {
        Ciclope ciclope = new Ciclope();
        ciclope.applicaDanno(499f);
        if(!ciclope.isSconfitto()) {
            System.out.println("TestCiclope.testIsSconfittoCiclope2(): OK");
            return true;
        }
        else {
            System.out.println("TestCiclope.testIsSconfittoCiclope2(): FAILED");
            return false;
        }
    }

    public static boolean testGetVitaCiclope() {
        Ciclope ciclope = new Ciclope();
        ciclope.applicaDanno(200f);
        if(ciclope.getVita() == 300f) {
            System.out.println("TestCiclope.testGetVitaCiclope(): OK");
            return true;
        }
        else {
            System.out.println("TestCiclope.testGetVitaCiclope(): FAILED");
            return false;
        }
    }

    public static boolean testGetStatoCombattimentoCiclope() {
        Ciclope ciclope = new Ciclope();
        int statoCombattimento = ciclope.getStatoCombattimento();
        if(statoCombattimento >= 0 && statoCombattimento <= 2) {
            System.out.println("TestCiclope.testGetStatoCombattimentoCiclope(): OK");
            return true;
        }
        else {
            System.out.println("TestCiclope.testGetStatoCombattimentoCiclope(): FAILED");
            return false;
        }
    }

}