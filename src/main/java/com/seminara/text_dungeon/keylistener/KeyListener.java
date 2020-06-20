package com.seminara.text_dungeon.keylistener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyListener {
    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    private KeyListener() {}

    public static String inputKey() {
        try {
            String in = input.readLine();
            if(null != in && in.length() > 0) return String.valueOf(in.toCharArray()[0]);
            else return "0";
        } catch (IOException io) {
            io.printStackTrace();
        }
        return null;
    }

    public static void resetBuffer() {
        input = new BufferedReader(new InputStreamReader(System.in));
    }

}