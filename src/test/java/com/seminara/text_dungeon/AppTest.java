package com.seminara.text_dungeon;

import com.seminara.text_dungeon.armeria.*;
import com.seminara.text_dungeon.battaglia.TestBattaglia;
import com.seminara.text_dungeon.pietra.*;
import com.seminara.text_dungeon.sfida.TestBattleSystem;
import com.seminara.text_dungeon.giocatore.*;
import com.seminara.text_dungeon.nemico.*;
import com.seminara.text_dungeon.partita.TestGame;
import com.seminara.text_dungeon.partita.TestPartita;
import com.seminara.text_dungeon.dungeon.*;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    @Test
    public void testPietraGrigia() {
        printHeader(TestPietraGrigia.class.getName());
        assertTrue(TestPietraGrigia.testGetTipoPietraGrigia());
        assertTrue(TestPietraGrigia.testMoltiplicatoreDannoPietraGrigia());
        printFooter();
    }

    @Test
    public void testPietraBianca() {
        printHeader(TestPietraBianca.class.getName());
        assertTrue(TestPietraBianca.testGetTipoPietraBianca());
        assertTrue(TestPietraBianca.testMoltiplicatoreDannoPietraBianca1());
        assertTrue(TestPietraBianca.testMoltiplicatoreDannoPietraBianca2());
        printFooter();
    }

    @Test
    public void testPietraNera() {
        printHeader(TestPietraNera.class.getName());
        assertTrue(TestPietraNera.testGetTipoPietraNera());
        assertTrue(TestPietraNera.testMoltiplicatoreDannoPietraNera1());
        assertTrue(TestPietraNera.testMoltiplicatoreDannoPietraNera2());
        printFooter();
    }

    @Test
    public void testAscia() {
        printHeader(TestAscia.class.getName());
        assertTrue(TestAscia.testGetTipoAsciaPietraBianca());
        assertTrue(TestAscia.testGetTipoAsciaPietraGrigia());
        assertTrue(TestAscia.testGetTipoAsciaPietraNera());
        assertTrue(TestAscia.testGetDannoAsciaPietraBianca());
        assertTrue(TestAscia.testGetDannoAsciaPietraGrigia());
        assertTrue(TestAscia.testGetDannoAsciaPietraNera());
        printFooter();
    }

    @Test
    public void testMannaia() {
        printHeader(TestMannaia.class.getName());
        assertTrue(TestMannaia.testGetTipoMannaiaPietraBianca());
        assertTrue(TestMannaia.testGetTipoMannaiaPietraGrigia());
        assertTrue(TestMannaia.testGetTipoMannaiaPietraNera());
        assertTrue(TestMannaia.testGetDannoMannaiaPietraBianca());
        assertTrue(TestMannaia.testGetDannoMannaiaPietraGrigia());
        assertTrue(TestMannaia.testGetDannoMannaiaPietraNera());
        printFooter();
    }

    @Test
    public void testSpada() {
        printHeader(TestSpada.class.getName());
        assertTrue(TestSpada.testGetTipoSpadaPietraBianca());
        assertTrue(TestSpada.testGetTipoSpadaPietraGrigia());
        assertTrue(TestSpada.testGetTipoSpadaPietraNera());
        assertTrue(TestSpada.testGetDannoSpadaPietraBianca());
        assertTrue(TestSpada.testGetDannoSpadaPietraGrigia());
        assertTrue(TestSpada.testGetDannoSpadaPietraNera());
        printFooter();
    }

    @Test
    public void testGeneraPietra() {
        printHeader(TestGeneraPietra.class.getName());
        assertTrue(TestGeneraPietra.testGetPietra());
        printFooter();
    }

    @Test
    public void testGeneraArma() {
        printHeader(TestGeneraArma.class.getName());
        assertTrue(TestGeneraArma.testGetAscia());
        assertTrue(TestGeneraArma.testGetMannaia());
        assertTrue(TestGeneraArma.testGetSpada());
        assertTrue(TestGeneraArma.testGetDefault());
        printFooter();
    }

    @Test
    public void testGiocatore() {
        printHeader(TestGiocatore.class.getName());
        assertTrue(TestGiocatore.testSingleton());
        assertTrue(TestGiocatore.testIsSconfitto1());
        assertTrue(TestGiocatore.testIsSconfitto2());
        assertTrue(TestGiocatore.testArma());
        assertTrue(TestGiocatore.testGetStatoCombattimento());
        assertTrue(TestGiocatore.testSetStatoCombattimento());
        assertTrue(TestGiocatore.testAffliggiDanno());
        printFooter();
    }

    @Test
    public void testNemico() {
        printHeader(TestNemico.class.getName());
        assertTrue(TestNemico.testInfliggiDanno());
        assertTrue(TestNemico.testApplicaDanno());
        assertTrue(TestNemico.testNemico());
        assertTrue(TestNemico.testGetVita1());
        assertTrue(TestNemico.testGetVita2());
        assertTrue(TestNemico.testIsSconfitto1());
        assertTrue(TestNemico.testIsSconfitto2());
        assertTrue(TestNemico.testGetStatoCombattimento());
        assertTrue(TestNemico.testSetStatoCombattimento());
        printFooter();
    }

    @Test
    public void testChimera() {
        printHeader(TestChimera.class.getName());
        assertTrue(TestChimera.testAffliggiDannoChimera());
        assertTrue(TestChimera.testApplicaDannoChimera());
        assertTrue(TestChimera.testChimera());
        assertTrue(TestChimera.testGetVitaChimera1());
        assertTrue(TestChimera.testGetVitaChimera2());
        assertTrue(TestChimera.testIsSconfittoChimera1());
        assertTrue(TestChimera.testIsSconfittoChimera2());
        assertTrue(TestChimera.testGetStatoCombattimentoChimera());
        printFooter();
    }

    @Test
    public void testCiclope() {
        printHeader(TestCiclope.class.getName());
        assertTrue(TestCiclope.testAffliggiDannoCiclope());
        assertTrue(TestCiclope.testApplicaDannoCiclope());
        assertTrue(TestCiclope.testCiclope());
        assertTrue(TestCiclope.testGetVitaCiclope1());
        assertTrue(TestCiclope.testGetVitaCiclope2());
        assertTrue(TestCiclope.testIsSconfittoCiclope1());
        assertTrue(TestCiclope.testIsSconfittoCiclope2());
        assertTrue(TestCiclope.testGetStatoCombattimentoCiclope());
        printFooter();
    }

    @Test
    public void testGoblin() {
        printHeader(TestGoblin.class.getName());
        assertTrue(TestGoblin.testAffliggiDannoGoblin());
        assertTrue(TestGoblin.testApplicaDannoGoblin());
        assertTrue(TestGoblin.testGoblin());
        assertTrue(TestGoblin.testGetVitaGoblin1());
        assertTrue(TestGoblin.testGetVitaGoblin2());
        assertTrue(TestGoblin.testIsSconfittoGoblin1());
        assertTrue(TestGoblin.testIsSconfittoGoblin2());
        assertTrue(TestGoblin.testGetStatoCombattimentoGoblin());
        printFooter();
    }

    @Test
    public void testStrega() {
        printHeader(TestStrega.class.getName());
        assertTrue(TestStrega.testAffliggiDannoStrega());
        assertTrue(TestStrega.testApplicaDannoStrega());
        assertTrue(TestStrega.testStrega());
        assertTrue(TestStrega.testGetVitaStrega1());
        assertTrue(TestStrega.testGetVitaStrega2());
        assertTrue(TestStrega.testIsSconfittoStrega1());
        assertTrue(TestStrega.testIsSconfittoStrega2());
        assertTrue(TestStrega.testGetStatoCombattimentoStrega());
        printFooter();
    }

    @Test
    public void testBosco() {
        printHeader(TestBosco.class.getName());
        assertTrue(TestBosco.testEsploraBosco());
        assertTrue(TestBosco.testGetNemicoChimeraBosco());
        assertTrue(TestBosco.testGetNemicoGoblinBosco());
        assertTrue(TestBosco.testGetNemicoNullBosco());
        assertTrue(TestBosco.testGetNemicoStregaBosco());
        printFooter();
    }

    @Test
    public void testDeserto() {
        printHeader(TestDeserto.class.getName());
        assertTrue(TestDeserto.testEsploraDeserto());
        assertTrue(TestDeserto.testGetNemicoChimeraDeserto());
        assertTrue(TestDeserto.testGetNemicoGoblinDeserto());
        assertTrue(TestDeserto.testGetNemicoNullDeserto());
        assertTrue(TestDeserto.testGetNemicoCiclopeDeserto());
        printFooter();
    }

    @Test
    public void testBattleSystem() {
        printHeader(TestBattleSystem.class.getName());
        assertTrue(TestBattleSystem.testAssaltoVsAssalto());
        assertTrue(TestBattleSystem.testAssaltoVsAttacco());
        assertTrue(TestBattleSystem.testAssaltoVsDifesa());
        assertTrue(TestBattleSystem.testAttaccoVsAssalto());
        assertTrue(TestBattleSystem.testAttaccoVsAttacco());
        assertTrue(TestBattleSystem.testAttaccoVsDifesa());
        assertTrue(TestBattleSystem.testDifesaVsAssalto());
        assertTrue(TestBattleSystem.testDifesaVsAttacco());
        assertTrue(TestBattleSystem.testDifesaVsDifesa());
        printFooter();
    }

    @Test
    public void testBattaglia() {
        printHeader(TestBattaglia.class.getName());
        assertTrue(TestBattaglia.testBattagliaVittoriaDifesa());
        assertTrue(TestBattaglia.testBattagliaSconfittaDifesa());
        assertTrue(TestBattaglia.testBattagliaPareggioDifesa());
        assertTrue(TestBattaglia.testBattagliaVittoriaAssalto());
        assertTrue(TestBattaglia.testBattagliaSconfittaAssalto());
        assertTrue(TestBattaglia.testBattagliaPareggioAssalto());
        assertTrue(TestBattaglia.testBattagliaVittoriaAttacco());
        assertTrue(TestBattaglia.testBattagliaSconfittaAttacco());
        assertTrue(TestBattaglia.testBattagliaPareggioAttacco());
        assertTrue(TestBattaglia.testBattagliaInputErratoVittoria());
        assertTrue(TestBattaglia.testBattagliaInputErratoSconfitta());
        assertTrue(TestBattaglia.testBattagliaInputErratoPareggio());
        printFooter();
    }

    @Test
    public void testPartita() {
        printHeader(TestPartita.class.getName());
        assertTrue(TestPartita.testStartDungeonBosco());
        assertTrue(TestPartita.testStartDungeonDeserto());
        printFooter();
    }

    @Test
    public void testGame() {
        printHeader(TestGame.class.getName());
        assertTrue(TestGame.testGameStatoIniziale());
        assertTrue(TestGame.testSetStatoRegole());
        assertTrue(TestGame.testSetStatoLivelloBosco());
        assertTrue(TestGame.testSetStatoLivelloDeserto());
        assertTrue(TestGame.testSetStatoVittoria());
        assertTrue(TestGame.testSetStatoSconfitta());
        assertTrue(TestGame.testSetStatoEnd());
        printFooter();
    }

    @Test
    public void testApp() {
        printHeader(TestApp.class.getName());
        assertTrue(TestApp.testMain("src/test/java/com/seminara/text_dungeon/GameAction.txt"));
        System.out.println("TestApp.logs generato in /src/test/java/com/seminara/text_dungeon/");
        printFooter();
    }

    private void printHeader(String nome) {
        System.out.println();
        printYellow("-------------------------------------------------------");
        printBlue(nome);
        printYellow("-------------------------------------------------------");
    }

    private void printFooter() {
        printYellow("-------------------------------------------------------");
        System.out.println();
        System.out.println();
    }

    private void printYellow(String str) {
        System.out.println("\u001B[33m" + str + "\u001B[0m");
    }

    private void printBlue(String str) {
        System.out.println("\u001B[34m" + str + "\u001B[0m");
    }

}
