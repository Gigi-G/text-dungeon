package com.seminara.text_dungeon.pietra;

public class TestGeneraPietra {

    public static boolean testGetPietra() {
        IPietra pietra = GeneraPietra.getInstance().getPietra();
        float rand = GeneraPietra.getInstance().getRand();
        if  ((rand >= 0f && rand <= 0.74f) && pietra.getTipo() == "Pietra Grigia") {
            System.out.println("TestGeneraPietra.testGetPietra(): OK");
            return true;
        }
        else if  ((rand >= 0.75f && rand <= 0.89f) && pietra.getTipo() == "Pietra Bianca") {
            System.out.println("TestGeneraPietra.testGetPietra(): OK");
            return true;
        }
        else if  (rand >= 0.90f && pietra.getTipo() == "Pietra Nera") {
            System.out.println("TestGeneraPietra.testGetPietra(): OK");
            return true;
        }
        else {
            System.out.println("TestGeneraPietra.testGetPietra(): FAILED");
            return false;
        }
    }
}