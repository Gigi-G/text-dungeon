package com.seminara.text_dungeon;

public class TestPietraNera {
    
    public static boolean testGetTipoPietraNera() {
        PietraNera pietra = new PietraNera();
        if  (pietra.getTipo().equals("Pietra Nera")){
            System.out.println("TestPietraNera.testGetTipoPietraNera(): OK");
            return true;
        }
        else {
            System.out.println("TestPietraNera.testGetTipoPietraNera(): FAILED");
            return false;
        }
    }
    
    public static boolean testMoltiplicatoreDannoPietraNera1() {
        PietraNera pietra = new PietraNera();
        float moltiplicatore = pietra.moltiplicatoreDanno();
        int c = 0;
        while (moltiplicatore != 1f) {
            moltiplicatore = pietra.moltiplicatoreDanno();
            if  (++c >= 2000) {
                System.out.println("TestPietraNera.testMoltiplicatoreDannoPietraNera1(): FAILED");
                return false;
            }
        }
        System.out.println("TestPietraNera.testMoltiplicatoreDannoPietraNera1(): OK");
        return true;
    }
    
    public static boolean testMoltiplicatoreDannoPietraNera2() {
        PietraNera pietra = new PietraNera();
        float moltiplicatore = pietra.moltiplicatoreDanno();
        int c = 0;
        while (moltiplicatore != 1.25f) {
            moltiplicatore = pietra.moltiplicatoreDanno();
            if  (++c >= 2000) {
                System.out.println("TestPietraNera.testMoltiplicatoreDannoPietraNera2(): FAILED");
                return false;
            }
        }
        System.out.println("TestPietraNera.testMoltiplicatoreDannoPietraNera2(): OK");
        return true;
    }
}