package com.seminara.text_dungeon.partita;

public class Title implements IGameState {
    private final String COLOR = "\u001B[32m";
    private static final String RESET = "\u001B[0m";

    @Override
    public boolean play(Game game, Partita partita) {
        printTitle();
        game.setStato("0");
        return game.gioca();
    }

    private void printTitle() {
        System.out.println("-".repeat(58));
        System.out.println(COLOR + "~~|~~    |        |~~\\                          ");
        System.out.println("  |/~/\\/~|~  ---  |   ||   ||/~\\ /~~|/~//~\\|/~\\ ");
        System.out.println("  |\\/_/\\ |        |__/  \\_/||   |\\__|\\/_\\_/|   |");
        System.out.println("                                 \\__|           " + RESET);
        System.out.println("-".repeat(58));
    }
    
}