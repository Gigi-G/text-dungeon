package com.seminara.text_dungeon.nemico;

public class TestGoblin {
    
    public static boolean testGoblin() {
        Goblin goblin = new Goblin();
        if(goblin.getNome() == "Goblin") {
            System.out.println("TestGoblin.testGoblin(): OK");
            return true;
        }
        else {
            System.out.println("TestGoblin.testGoblin(): FAILED");
            return false;
        }
    }

    public static boolean testApplicaDannoGoblin() {
        Goblin goblin = new Goblin();
        goblin.applicaDanno(50f);
        if(goblin.getVita() == 30f) {
            System.out.println("TestGoblin.testApplicaDannoGoblin(): OK");
            return true;
        }
        else {
            System.out.println("TestGoblin.testApplicaDannoGoblin(): FAILED");
            return false;
        }
    }

    public static boolean testAffliggiDannoGoblin() {
        Goblin goblin = new Goblin();
        float danno = goblin.infliggiDanno();
        if(danno >= 5f && danno <= 22f) {
            System.out.println("TestGoblin.testAffliggiDannoGoblin(): OK");
            return true;
        }
        else {
            System.out.println("TestGoblin.testAffliggiDannoGoblin(): FAILED");
            return false;
        }
    }

    public static boolean testIsSconfittoGoblin1() {
        Goblin goblin = new Goblin();
        goblin.applicaDanno(80f);
        if(goblin.isSconfitto()) {
            System.out.println("TestGoblin.testIsSconfittoGoblin1(): OK");
            return true;
        }
        else {
            System.out.println("TestGoblin.testIsSconfittoGoblin1(): FAILED");
            return false;
        }
    }

    public static boolean testIsSconfittoGoblin2() {
        Goblin goblin = new Goblin();
        goblin.applicaDanno(79f);
        if(!goblin.isSconfitto()) {
            System.out.println("TestGoblin.testIsSconfittoGoblin2(): OK");
            return true;
        }
        else {
            System.out.println("TestGoblin.testIsSconfittoGoblin2(): FAILED");
            return false;
        }
    }

    public static boolean testGetVitaGoblin1() {
        Goblin goblin = new Goblin();
        goblin.applicaDanno(30f);
        if(goblin.getVita() == 50f) {
            System.out.println("TestGoblin.testGetVitaGoblin1(): OK");
            return true;
        }
        else {
            System.out.println("TestGoblin.testGetVitaGoblin1(): FAILED");
            return false;
        }
    }

    public static boolean testGetVitaGoblin2() {
        Goblin goblin = new Goblin();
        goblin.applicaDanno(81f);
        if(goblin.getVita() == 0f) {
            System.out.println("TestGoblin.testGetVitaGoblin2(): OK");
            return true;
        }
        else {
            System.out.println("TestGoblin.testGetVitaGoblin2(): FAILED");
            return false;
        }
    }

    public static boolean testGetStatoCombattimentoGoblin() {
        Goblin goblin = new Goblin();
        if(goblin.getStatoCombattimento().equals("Attacco")) {
            System.out.println("TestGoblin.testGetStatoCombattimentoGoblin(): OK");
            return true;
        }
        else {
            System.out.println("TestGoblin.testGetStatoCombattimentoGoblin(): FAILED");
            return false;
        }
    }

}