package com.seminara.text_dungeon.pietra;

public class TestPietraGrigia {
    public static boolean testGetTipoPietraGrigia() {
        PietraGrigia pietra = new PietraGrigia();
        if  (pietra.getTipo().equals("Pietra Grigia")){
            System.out.println("TestPietraGrigia.testGetTipoPietraGrigia(): OK");
            return true;
        }
        else {
            System.out.println("TestPietraGrigia.testGetTipoPietraGrigia(): FAILED");
            return false;
        }
    }
    
    public static boolean testMoltiplicatoreDannoPietraGrigia() {
        PietraGrigia pietra = new PietraGrigia();
        if  (1f == pietra.moltiplicatoreDanno()) {
            System.out.println("TestPietraGrigia.testMoltiplicatoreDannoPietraGrigia(): OK");
            return true;
        }
        else {
            System.out.println("TestPietraGrigia.testMoltiplicatoreDannoPietraGrigia(): FAILED");
            return false;
        }
    }
}