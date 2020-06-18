package com.seminara.text_dungeon.battaglia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.function.Function;

import com.seminara.text_dungeon.giocatore.Giocatore;
import com.seminara.text_dungeon.nemico.INemico;
import com.seminara.text_dungeon.sfida.BattleSystem;

public class Battaglia {
    private BattleSystem battleSystem;
    private Giocatore giocatore;
    private final List <Function<INemico, String>> caseBattle = List.of( x -> "Pareggio", x -> { x.applicaDanno(giocatore.infliggiDanno()); return "Vittoria";}, x -> {giocatore.applicaDanno(x.infliggiDanno()); return "Sconfitta";} );

    public Battaglia() {
        battleSystem = new BattleSystem();
        giocatore = Giocatore.getInstance();
    }

    public String battaglia(INemico nemico) {
        scegliPosizioneCombattimento();
        nemico.setStatoCombattimento();
        printPosizioniAttuali(nemico);
        int risultatoSfida = battleSystem.vincitoreSfida(giocatore.getStatoCombattimento(), nemico.getStatoCombattimento());
        return caseBattle.get(risultatoSfida).apply(nemico);
    }

    private void scegliPosizioneCombattimento() {
        printPosizioniDaCombattimento();
        posizioneGiocatore();
    }

    private void posizioneGiocatore() {
        BufferedReader input;
        input = new BufferedReader(new InputStreamReader(System.in));
        try {
            String in = input.readLine();
            if(in.length() > 0) giocatore.setStatoCombattimento(String.valueOf(in.toCharArray()[0]));
            else giocatore.setStatoCombattimento("0");
            input.close();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    private void printPosizioniDaCombattimento() {
        System.out.println();
        System.out.println("Scegli la posizione da combattimento:");
        System.out.println("0- Attacco");
        System.out.println("1- Assalto");
        System.out.println("2- Difesa");
        System.out.println();
    }

    private void printPosizioniAttuali(INemico nemico) {
        System.out.println();
        System.out.println("Posizione Giocatore: " + giocatore.getStatoCombattimento());
        System.out.println("Posizione " + nemico.getNome() + ": " + nemico.getStatoCombattimento());
        System.out.println();
    }
    
}