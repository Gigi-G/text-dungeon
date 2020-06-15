package com.seminara.text_dungeon.pietra;

public class TestPietraBianca {

    public static boolean testGetTipoPietraBianca() {
        PietraBianca pietra = new PietraBianca();
        if  (pietra.getTipo().equals("Pietra Bianca")){
            System.out.println("TestPietraBianca.testGetTipoPietraBianca(): OK");
            return true;
        }
        else {
            System.out.println("TestPietraBianca.testGetTipoPietraBianca(): FAILED");
            return false;
        }
    }
    
    public static boolean testMoltiplicatoreDannoPietraBianca1() {
        PietraBianca pietra = new PietraBianca();
        float moltiplicatore = pietra.moltiplicatoreDanno();
        int c = 0;
        while (moltiplicatore != 1f) {
            moltiplicatore = pietra.moltiplicatoreDanno();
            if  (++c >= 2000) {
                System.out.println("TestPietraBianca.testMoltiplicatoreDannoPietraBianca1(): FAILED");
                return false;
            }
        }
        System.out.println("TestPietraBianca.testMoltiplicatoreDannoPietraBianca1(): OK");
        return true;
    }
    
    public static boolean testMoltiplicatoreDannoPietraBianca2() {
        PietraBianca pietra = new PietraBianca();
        float moltiplicatore = pietra.moltiplicatoreDanno();
        int c = 0;
        while (moltiplicatore != 1.10f) {
            moltiplicatore = pietra.moltiplicatoreDanno();
            if  (++c >= 2000) {
                System.out.println("TestPietraBianca.testMoltiplicatoreDannoPietraBianca2(): FAILED");
                return false;
            }
        }
        System.out.println("TestPietraBianca.testMoltiplicatoreDannoPietraBianca2(): OK");
        return true;
    }
}