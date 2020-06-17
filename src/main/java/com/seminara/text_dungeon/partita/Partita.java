package com.seminara.text_dungeon.partita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.seminara.text_dungeon.armeria.GeneraArma;
import com.seminara.text_dungeon.armeria.IArma;
import com.seminara.text_dungeon.battaglia.Battaglia;
import com.seminara.text_dungeon.dungeon.*;
import com.seminara.text_dungeon.giocatore.Giocatore;
import com.seminara.text_dungeon.nemico.INemico;

public class Partita {
    private Giocatore giocatore;
    private Dungeon dungeon;
    private INemico nemico;
    private GeneraArma generaArma;
    private Battaglia lotta;
    private BufferedReader input;
    String risultato = "";

    public Partita() {
        giocatore = Giocatore.getInstance();
        generaArma = GeneraArma.getInstance();
        lotta = new Battaglia();
    }

    public String startDungeonBosco() {
        dungeon = new Bosco();
        startAvventura();
        return risultato;
    }

    public String startDungeonDeserto() {
        dungeon = new Deserto();
        startAvventura();
        return risultato;
    }

    private void startAvventura() {
        scegliArma();
        nextLevel();
        printLevel();
        avventura();
    }

    private void avventura() {
        while(lotta() && !giocatore.isSconfitto()) {
            generaArma();
            printLevel();
        }
    }

    private boolean lotta() {
        while(!nemico.isSconfitto() && !giocatore.isSconfitto()) {
            risultato = lotta.battaglia(nemico);
            printVita();
        }
        nextLevel();
        return null!=nemico;
    }

    private void scegliArma() {
        printScegliArma();
        try {
            input = new BufferedReader(new InputStreamReader(System.in));
            String in = input.readLine();
            if(in.length() > 0) giocatore.setArma(generaArma.getArma(Integer.parseInt(String.valueOf(in.toCharArray()[0]))));
            else giocatore.setArma(generaArma.getArma(0));
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
    
    private void nextLevel() {
        nemico = dungeon.esplora();
    }

    private void generaArma() {
        IArma arma = generaArma.getArma(numeroRandom());
        confrontoArmi(arma);
        System.out.println("Vuoi cambiare arma: y/[N]? ");
        input = new BufferedReader(new InputStreamReader(System.in));
        try {
            String in = input.readLine();
            in = String.valueOf(in.toCharArray()[0]);
            if(in.length() > 0 && in.equalsIgnoreCase("Y")) {
                giocatore.setArma(arma);
                System.out.println("Hai cambiato arma!");
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    private void confrontoArmi(IArma arma) {
        System.out.println("Nuova arma trovata: ");
        printArma(arma);
        System.out.println("Vecchia arma:");
        printArma(giocatore.getArma());
    }

    private int numeroRandom() {
        return Math.round((float) Math.random()*2);
    }

    private void printLevel() {
        System.out.println();
        System.out.println("Livello: " + dungeon.getLivello());
        System.out.println("Nemico: " + nemico.getNome());
        printArma(giocatore.getArma());
        printVita();
        System.out.println();
    }

    private void printArma(IArma arma) {
        System.out.println();
        System.out.println("Tipo: " + arma.getTipo());
        System.out.println("Danno: " + arma.getDanno());;
        System.out.println();
    }

    private void printVita() {
        System.out.println("Vita Giocatore: " + giocatore.getVita());
        System.out.println("Vita Nemico: " + nemico.getVita());
        System.out.println();
    }

    private void printScegliArma() {
        System.out.println();
        System.out.println("Scegli la tua arma:");
        System.out.println("0- Ascia");
        System.out.println("1- Mannaia");
        System.out.println("2- Spada");
        System.out.println();
    }
}