package com.seminara.text_dungeon.partita;

import com.seminara.text_dungeon.armeria.GeneraArma;
import com.seminara.text_dungeon.armeria.IArma;
import com.seminara.text_dungeon.battaglia.Battaglia;
import com.seminara.text_dungeon.dungeon.*;
import com.seminara.text_dungeon.giocatore.Giocatore;
import com.seminara.text_dungeon.keylistener.KeyListener;
import com.seminara.text_dungeon.nemico.INemico;

public class Partita {
    private Giocatore giocatore;
    private Dungeon dungeon;
    private INemico nemico;
    private Battaglia lotta;
    private String risultatoPartita = "";

    public Partita() {
        giocatore = Giocatore.getInstance();
        lotta = new Battaglia();
    }

    public String startDungeonBosco() {
        dungeon = new Bosco();
        startAvventura();
        giocatore.resetVita();
        return risultatoPartita;
    }

    public String startDungeonDeserto() {
        dungeon = new Deserto();
        startAvventura();
        giocatore.resetVita();
        return risultatoPartita;
    }

    private void startAvventura() {
        scegliArma();
        nextLevel();
        printLevel();
        avventura();
    }

    private void avventura() {
        while(sfida() && !giocatore.isSconfitto()) {
            generaArma();
            printLevel();
        }
    }

    private boolean sfida() {
        while(!nemico.isSconfitto() && !giocatore.isSconfitto()) {
            risultatoPartita = lotta.scontro(nemico);
            printVita();
        }
        nextLevel();
        return null!=nemico;
    }

    private void scegliArma() {
        printScegliArma();
        giocatore.setArma(GeneraArma.getArma(KeyListener.inputKey().toCharArray()[0] - 48));
    }
    
    private void nextLevel() {
        nemico = dungeon.esplora();
    }

    private void generaArma() {
        IArma arma = GeneraArma.getArma(numeroRandom());
        confrontoArmi(arma);
        chiediCambioArma(arma);
    }

    private int numeroRandom() {
        return Math.round((float) Math.random()*2);
    }

    private void confrontoArmi(IArma arma) {
        System.out.println();
        System.out.println("Nuova arma trovata: ");
        printArma(arma);
        System.out.println("Vecchia arma:");
        printArma(giocatore.getArma());
        System.out.println("Differenza danno: " + differenzaDannoArmi(arma));
        System.out.println();
    }

    private float differenzaDannoArmi(IArma arma) {
        return arma.getDanno() - giocatore.getArma().getDanno();
    }

    private void chiediCambioArma(IArma arma) {
        System.out.println("Vuoi cambiare arma: y/[N]? ");
        if(KeyListener.inputKey().equalsIgnoreCase("Y")) {
            giocatore.setArma(arma);
            System.out.println("Hai cambiato arma!");
        }
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
        System.out.println("Danno: " + arma.getDanno());
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