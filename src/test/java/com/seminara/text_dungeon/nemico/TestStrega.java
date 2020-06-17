package com.seminara.text_dungeon.nemico;

public class TestStrega {

    public static boolean testStrega() {
        Strega strega = new Strega();
        if(strega.getNome() == "Strega") {
            System.out.println("TestStrega.testStrega(): OK");
            return true;
        }
        else {
            System.out.println("TestStrega.testStrega(): FAILED");
            return false;
        }
    }

    public static boolean testApplicaDannoStrega() {
        Strega strega = new Strega();
        strega.applicaDanno(50f);
        if(strega.getVita() == 400f) {
            System.out.println("TestStrega.testApplicaDannoStrega(): OK");
            return true;
        }
        else {
            System.out.println("TestStrega.testApplicaDannoStrega(): FAILED");
            return false;
        }
    }

    public static boolean testAffliggiDannoStrega() {
        Strega strega = new Strega();
        float danno = strega.affliggiDanno();
        if(danno >= 40f && danno <= 92f) {
            System.out.println("TestStrega.testAffliggiDannoStrega(): OK");
            return true;
        }
        else {
            System.out.println("TestStrega.testAffliggiDannoStrega(): FAILED");
            return false;
        }
    }

    public static boolean testIsSconfittoStrega1() {
        Strega strega = new Strega();
        strega.applicaDanno(450f);
        if(strega.isSconfitto()) {
            System.out.println("TestStrega.testIsSconfittoStrega1(): OK");
            return true;
        }
        else {
            System.out.println("TestStrega.testIsSconfittoStrega1(): FAILED");
            return false;
        }
    }

    public static boolean testIsSconfittoStrega2() {
        Strega strega = new Strega();
        strega.applicaDanno(449f);
        if(!strega.isSconfitto()) {
            System.out.println("TestStrega.testIsSconfittoStrega2(): OK");
            return true;
        }
        else {
            System.out.println("TestStrega.testIsSconfittoStrega2(): FAILED");
            return false;
        }
    }

    public static boolean testGetVitaStrega() {
        Strega strega = new Strega();
        strega.applicaDanno(400f);
        if(strega.getVita() == 50f) {
            System.out.println("TestStrega.testGetVitaStrega(): OK");
            return true;
        }
        else {
            System.out.println("TestStrega.testGetVitaStrega(): FAILED");
            return false;
        }
    }

    public static boolean testGetStatoCombattimentoStrega() {
        Strega strega = new Strega();
        if(strega.getStatoCombattimento().equals("Attacco")) {
            System.out.println("TestStrega.testGetStatoCombattimentoStrega(): OK");
            return true;
        }
        else {
            System.out.println("TestStrega.testGetStatoCombattimentoStrega(): FAILED");
            return false;
        }
    }

}