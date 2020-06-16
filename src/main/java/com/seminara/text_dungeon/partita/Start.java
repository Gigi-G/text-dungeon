package com.seminara.text_dungeon.partita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start implements GameState {
    BufferedReader input;

    @Override
    public boolean play(Partita partita) {
        printBenvenuto();
        printMenu();
        try {
            input = new BufferedReader(new InputStreamReader(System.in));
            partita.setStato(input.readLine());
        } catch (IOException io) {
            partita.setStato("0");
            return true;
        }
        return true;
    }

    private void printBenvenuto() {
        System.out.println("Benvenuto/a su text_dungeon!\n");
    }

    private void printMenu() {
        System.out.println("Cosa vuoi fare?");
        System.out.println("1 - Regole");
        System.out.println("2 - Gioca livello 1");
        System.out.println("3 - Gioca livello 2");
        System.out.println();
    }
    
}