package com.seminara.text_dungeon.partita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.seminara.text_dungeon.armeria.GeneraArma;
import com.seminara.text_dungeon.dungeon.*;
import com.seminara.text_dungeon.giocatore.Giocatore;
import com.seminara.text_dungeon.nemico.INemico;
import com.seminara.text_dungeon.sfida.Battaglia;

public class Partita {
    private Giocatore giocatore;
    private Dungeon dungeon;
    private INemico nemico;
    private GeneraArma generaArma;
    private BufferedReader input;
    private Battaglia battaglia;

    public Partita() {
        giocatore = Giocatore.getInstance();
        generaArma = GeneraArma.getInstance();
        battaglia = new Battaglia();
    }

    public boolean startDungeonBosco() {
        dungeon = new Bosco();
        return startAvventura();
    }

    public boolean startDungeonDeserto() {
        dungeon = new Deserto();
        return startAvventura();
    }

    private boolean startAvventura() {
        scegliArma();
        do {
            nextLevel();
            printLevel();
            printVita();
        } while(lotta() && !giocatore.isSconfitto());
        return giocatore.isSconfitto();
    }

    private void scegliArma() {
        System.out.println("\nScegli la tua arma:\n0- Ascia \n1- Mannaia \n2- Spada");
        try {
            input = new BufferedReader(new InputStreamReader(System.in));
            giocatore.setArma(generaArma.getArma(Integer.parseInt(input.readLine().substring(0, 1))));
        } catch (IOException io) {
            giocatore.setArma(generaArma.getArma(0));
        }
    }
    
    private void nextLevel() {
        nemico = dungeon.esplora();
        printLevel();
    }

    private boolean lotta() {
        while(!nemico.isSconfitto() && !giocatore.isSconfitto()) {
            try {
                input = new BufferedReader(new InputStreamReader(System.in));
                giocatore.setStatoCombattimento(input.readLine().substring(0, 1));
            } catch (IOException io) {
                giocatore.setStatoCombattimento("0");
            }
            nemico.setStatoCombattimento();
            int r = battaglia.vincitoreSfida(giocatore.getStatoCombattimento(), nemico.getStatoCombattimento());
            if  (r == 1) {
                nemico.applicaDanno(giocatore.affliggiDanno());
            }
            else if(r == 2) {
                giocatore.applicaDanno(nemico.affliggiDanno());
            }
            risultatoLotta();
        }
        return nemico.isSconfitto();
    }

    private void printLevel() {
        System.out.println("\nLivello: " + dungeon.getLivello());
        System.out.println("Nemico: " + nemico.getNome());
        printArmaGiocatore();
        System.out.println();
    }

    private void printArmaGiocatore() {
        System.out.println("\nArma Giocatore: " + giocatore.getArma().getTipo());
        System.out.println();
    }

    private void printVita() {
        System.out.println("\nVita Giocatore: " + giocatore.getVita());
        System.out.println("Vita Nemico: " + nemico.getVita());
        System.out.println();
    }

    private void risultatoLotta() {
        System.out.println("\nStato combattimento Giocatore: " + giocatore.getStatoCombattimento());
        System.out.println("Stato combattimento Nemico: " + nemico.getStatoCombattimento());
        printVita();
        System.out.println();
    }
}