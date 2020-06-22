package com.seminara.text_dungeon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class TestMain {

    public static void main(String[] args) {
        printInfo();
        File file = openFile("prjSeminara/text_dungeon/Test.logs");
        setOutSystem(file);
        TestApp.testMain("prjSeminara/text_dungeon/target/test-classes/com/seminara/text_dungeon/GameAction.txt");
        AppTest appTest = new AppTest();
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

    private static File openFile(String path) {
        File file = new File(path);
        if (file.exists())
            file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    private static void setOutSystem(File file) {
        try {
            System.setOut(new PrintStream(file.getPath()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printInfo();
    }

    private static void printInfo() {
        System.out.println();
        System.out.println("***Si consiglia di visualizzare il file Test.logs con il comando cat***");
        System.out.println();
    }

}