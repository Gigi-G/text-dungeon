package com.seminara.text_dungeon;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void testPietraGrigia() {
        printHeader(TestPietraGrigia.class.getName());
        assertTrue( TestPietraGrigia.testGetTipoPietraGrigia() );
        assertTrue( TestPietraGrigia.testMoltiplicatoreDannoPietraGrigia() );
        printFooter();
    }

    @Test
    public void testPietraBianca() {
        printHeader(TestPietraBianca.class.getName());
        assertTrue( TestPietraBianca.testGetTipoPietraBianca() );
        assertTrue( TestPietraBianca.testMoltiplicatoreDannoPietraBianca1() );
        assertTrue( TestPietraBianca.testMoltiplicatoreDannoPietraBianca2() );
        printFooter();
    }

    @Test
    public void testPietraNera() {
        printHeader(TestPietraNera.class.getName());
        assertTrue( TestPietraNera.testGetTipoPietraNera() );
        assertTrue( TestPietraNera.testMoltiplicatoreDannoPietraNera1() );
        assertTrue( TestPietraNera.testMoltiplicatoreDannoPietraNera2() );
        printFooter();
    }

    @Test
    public void testAscia() {
        printHeader(TestAscia.class.getName());
        assertTrue( TestAscia.testGetTipoAsciaPietraBianca() );
        assertTrue( TestAscia.testGetTipoAsciaPietraGrigia() );
        assertTrue( TestAscia.testGetTipoAsciaPietraNera() );
        assertTrue( TestAscia.testGetDannoAsciaPietraBianca() );
        assertTrue( TestAscia.testGetDannoAsciaPietraGrigia() );
        assertTrue( TestAscia.testGetDannoAsciaPietraNera() );
        printFooter();
    }

    @Test
    public void testMannaia() {
        printHeader(TestMannaia.class.getName());
        assertTrue( TestMannaia.testGetTipoMannaiaPietraBianca() );
        assertTrue( TestMannaia.testGetTipoMannaiaPietraGrigia() );
        assertTrue( TestMannaia.testGetTipoMannaiaPietraNera() );
        assertTrue( TestMannaia.testGetDannoMannaiaPietraBianca() );
        assertTrue( TestMannaia.testGetDannoMannaiaPietraGrigia() );
        assertTrue( TestMannaia.testGetDannoMannaiaPietraNera() );
        printFooter();
    }

    @Test
    public void testSpada() {
        printHeader(TestSpada.class.getName());
        assertTrue( TestSpada.testGetTipoSpadaPietraBianca() );
        assertTrue( TestSpada.testGetTipoSpadaPietraGrigia() );
        assertTrue( TestSpada.testGetTipoSpadaPietraNera() );
        assertTrue( TestSpada.testGetDannoSpadaPietraBianca() );
        assertTrue( TestSpada.testGetDannoSpadaPietraGrigia() );
        assertTrue( TestSpada.testGetDannoSpadaPietraNera() );
        printFooter();
    }

    @Test
    public void testGeneraPietra() {
        printHeader(TestGeneraPietra.class.getName());
        assertTrue( TestGeneraPietra.testGetPietra() );
        printFooter();
    }

    @Test
    public void testGeneraArma() {
        printHeader(TestGeneraArma.class.getName());
        assertTrue( TestGeneraArma.testGetAscia() );
        assertTrue( TestGeneraArma.testGetMannaia() );
        assertTrue( TestGeneraArma.testGetSpada() );
        printFooter();
    }

    private void printHeader(String nome) {
        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println(nome);
        System.out.println("-------------------------------------------------------");
    }

    private void printFooter() {
        System.out.println("-------------------------------------------------------");
        System.out.println();
    }

}
