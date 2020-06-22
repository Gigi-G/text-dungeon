package com.seminara.text_dungeon.partita;

public class Regole implements IGameState {

    @Override
    public boolean play(Game game, Partita partita) {
        printRegole();
        game.setStato("0");
        return game.gioca();
    }

    private void printRegole() {
        printTitle();
        printDungeonInfo();
        printBattagliaInfo();
        printComVincereInfo();
        System.out.println("Buona fortuna!");
    }

    private void printTitle() {
        System.out.println();
        System.out.println("REGOLE:");
        System.out.println();
    }

    private void printDungeonInfo() {
        System.out.println();
        System.out.println("Nei dungeon sono presenti 4 mostri da dover affrontare.");
        System.out.println();
    }

    private void printBattagliaInfo() {
        System.out.println();
        System.out.println("L'utente ogni turno dovrà selezionare una modalità fra: Attacco, Assalto e Difesa.");
        System.out.println("L’Attacco batte l’Assalto e chi si trova nello stato di Assalto subisce un danno pari a quello che può infliggere chi si trova nello stato di attacco."); 
        System.out.println("La Difesa batte l’Attacco e chi si trova nello stato di attacco subisce un danno più o meno alla metà di quello che può essere inflitto da chi si trova nello stato di difesa.");
        System.out.println("L’Assalto batte la Difesa e chi si trova nello stato di Difesa subisce un danno pari alla metà di quello che può essere inflitto da chi si trova nello stato di assalto.");
        System.out.println("In caso di pareggio non accade nulla.");
        System.out.println("ATTENZIONE: se si sbaglia a digitare, per default la modalità sarà Attacco.");
        System.out.println();
    }

    private void printComVincereInfo() {
        System.out.println();
        System.out.println("Dopo ogni attacco vengono visualizzati i punti vita.");
        System.out.println("In caso di sconfitta la partita si conclude, ma in caso di vittoria viene proposta una nuova arma e i punti vita vengono ripristinati.");
        System.out.println("Si vince se si riescono a battere tutti i nemici.\n");
        System.out.println();
    }
    
}