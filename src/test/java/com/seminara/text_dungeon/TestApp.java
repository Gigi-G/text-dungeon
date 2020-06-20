package com.seminara.text_dungeon;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.seminara.text_dungeon.keylistener.KeyListener;

public class TestApp {

    public static boolean testMain() {
        File file = new File("src/test/java/com/seminara/text_dungeon/GameAction.txt");
        InputStream in;
        try {
            in = new FileInputStream(file);
            System.setIn(in);
            KeyListener.resetBuffer();
            App.main(new String[] { "com.seminara.text_dungeon" });
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
}