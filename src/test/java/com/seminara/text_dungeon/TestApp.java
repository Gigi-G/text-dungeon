package com.seminara.text_dungeon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import com.seminara.text_dungeon.keylistener.KeyListener;

public class TestApp {

    public static boolean testMain(String path) {
        File file = new File(path);
        InputStream in;
        PrintStream out = System.out;
        File fileOut = openFile("src/test/java/com/seminara/text_dungeon/TestApp.logs");
        setOutSystem(fileOut);
        try {
            in = new FileInputStream(file);
            System.setIn(in);
            KeyListener.resetBuffer();
            App.main(new String[] { "com.seminara.text_dungeon.App" });
            System.out.println("TestApp.testApp(): OK");
            System.setOut(out);
            return true;
        } catch (IOException e) {
            System.out.println("TestApp.testApp(): OK");
            e.printStackTrace();
            System.setOut(out);
            return false;
        }
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
            printInfo();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void printInfo() {
        System.out.println();
        System.out.println("***Si consiglia di visualizzare il file Test.logs con il comando cat***");
        System.out.println();
    }
    
}