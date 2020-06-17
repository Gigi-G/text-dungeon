package com.seminara.text_dungeon.partita;

public class Regole implements IGameState {

    @Override
    public boolean play(Game game, Partita partita) {
        printRegole();
        game.setStato("0");
        return true;
    }

    private void printRegole() {
        System.out.println("\nIl gioco è molto semplice, queste sono le regole:\n");
        System.out.println("Nei dungeon sono presenti 4 mostri da dover affrontare.");
        System.out.println("L'utente ogni turno dovrà selezionare una modalità di attacco tra: Attacco = 0, Assalto = 1 e Difesa = 2.\n");

        System.out.println("L’Attacco batte l’Assalto e chi si trova nello stato di Assalto subisce un danno pari a quello che può infliggere " + 
        "chi si trova nello stato di attacco; la Difesa batte l’Attacco e non si hanno danni da entrambe le parti; l’Assalto "+
        "batte la Difesa e chi si trova nello stato di Difesa subisce un danno pari alla metà dio quello che può essere inflitto "+
        "da chi si trova nello stato di assalto; in caso di pareggio non accade nulla.\n");

        System.out.println("ATTENZIONE: se si sbaglia a digitare, per default la modalità sarà Attacco.\n");
        System.out.println("Dopo ogni attacco vengono visualizzati i punti vita.");
        System.out.println("In caso di sconfitta la partita si conclude, ma in caso di vittoria viene proposta una nuova arma e i punti vita vengono ripristinati.");
        System.out.println("Si vince se si riescono a battere tutti i nemici.\n");
        System.out.println("Buona fortuna!\n");
    }
    
}