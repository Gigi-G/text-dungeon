package com.seminara.text_dungeon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class TestMain {

    public static void main(String[] args) {
        AppTest appTest = new AppTest();
        File file = new File("logs");
        if (file.exists())
            file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            System.setOut(new PrintStream("logs"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        appTest.testApp();
        appTest.testAscia();
        appTest.testBattaglia();
        appTest.testBattleSystem();
        appTest.testBosco();
        appTest.testChimera();
        appTest.testCiclope();
        appTest.testDeserto();
        appTest.testGame();
        appTest.testGeneraArma();
        appTest.testGeneraPietra();
        appTest.testGiocatore();
        appTest.testGoblin();
        appTest.testMannaia();
        appTest.testNemico();
        appTest.testPartita();
        appTest.testPietraBianca();
        appTest.testPietraGrigia();
        appTest.testPietraNera();
        appTest.testSpada();
        appTest.testStrega();
    }

}