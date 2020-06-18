package com.seminara.text_dungeon.sfida;

public class TestBattleSystem {
    
    public static boolean testAttaccoVsDifesa() {
        BattleSystem battle = new BattleSystem();
        if(battle.vincitoreSfida("Attacco", "Difesa") == 2) {
            System.out.println("TestBattleSystem.testAttaccoVsDifesa(): OK");
            return true;
        }
        else {
            System.out.println("TestBattleSystem.testAttaccoVsDifesa(): FAILED");
            return false;
        }
    }

    public static boolean testAttaccoVsAssalto() {
        BattleSystem battle = new BattleSystem();
        if(battle.vincitoreSfida("Attacco", "Assalto") == 1) {
            System.out.println("TestBattleSystem.testAttaccoVsAssalto(): OK");
            return true;
        }
        else {
            System.out.println("TestBattleSystem.testAttaccoVsAssalto(): FAILED");
            return false;
        }
    }

    public static boolean testAttaccoVsAttacco() {
        BattleSystem battle = new BattleSystem();
        if(battle.vincitoreSfida("Attacco", "Attacco") == 0) {
            System.out.println("TestBattleSystem.testAttaccoVsAttacco(): OK");
            return true;
        }
        else {
            System.out.println("TestBattleSystem.testAttaccoVsAttacco(): FAILED");
            return false;
        }
    }

    public static boolean testAssaltoVsAttacco() {
        BattleSystem battle = new BattleSystem();
        if(battle.vincitoreSfida("Assalto", "Attacco") == 2) {
            System.out.println("TestBattleSystem.testAssaltoVsAttacco(): OK");
            return true;
        }
        else {
            System.out.println("TestBattleSystem.testAssaltoVsAttacco(): FAILED");
            return false;
        }
    }

    public static boolean testAssaltoVsDifesa() {
        BattleSystem battle = new BattleSystem();
        if(battle.vincitoreSfida("Assalto", "Difesa") == 1) {
            System.out.println("TestBattleSystem.testAssaltoVsDifesa(): OK");
            return true;
        }
        else {
            System.out.println("TestBattleSystem.testAssaltoVsDifesa(): FAILED");
            return false;
        }
    }

    public static boolean testAssaltoVsAssalto() {
        BattleSystem battle = new BattleSystem();
        if(battle.vincitoreSfida("Assalto", "Assalto") == 0) {
            System.out.println("TestBattleSystem.testAssaltoVsAssalto(): OK");
            return true;
        }
        else {
            System.out.println("TestBattleSystem.testAssaltoVsAssalto(): FAILED");
            return false;
        }
    }

    public static boolean testDifesaVsAssalto() {
        BattleSystem battle = new BattleSystem();
        if(battle.vincitoreSfida("Difesa", "Assalto") == 2) {
            System.out.println("TestBattleSystem.testDifesaVsAssalto(): OK");
            return true;
        }
        else {
            System.out.println("TestBattleSystem.testDifesaVsAssalto(): FAILED");
            return false;
        }
    }

    public static boolean testDifesaVsAttacco() {
        BattleSystem battle = new BattleSystem();
        if(battle.vincitoreSfida("Difesa", "Attacco") == 1) {
            System.out.println("TestBattleSystem.testDifesaVsAttacco(): OK");
            return true;
        }
        else {
            System.out.println("TestBattleSystem.testDifesaVsAttacco(): FAILED");
            return false;
        }
    }

    public static boolean testDifesaVsDifesa() {
        BattleSystem battle = new BattleSystem();
        if(battle.vincitoreSfida("Difesa", "Difesa") == 0) {
            System.out.println("TestBattleSystem.testDifesaVsDifesa(): OK");
            return true;
        }
        else {
            System.out.println("TestBattleSystem.testDifesaVsDifesa(): FAILED");
            return false;
        }
    }

}