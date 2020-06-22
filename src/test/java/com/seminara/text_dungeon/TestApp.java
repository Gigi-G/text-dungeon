package com.seminara.text_dungeon;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.seminara.text_dungeon.keylistener.KeyListener;

public class TestApp {

    public static boolean testMain(String path) {
        File file = new File(path);
        InputStream in;
        try {
            in = new FileInputStream(file);
            System.setIn(in);
            KeyListener.resetBuffer();
            App.main(new String[] { "com.seminara.text_dungeon.App" });
            System.out.println("TestApp.testMain(): OK");
            return true;
        } catch (IOException e) {
            System.out.println("TestApp.testMain(): OK");
            e.printStackTrace();
            return false;
        }
    }
    
}