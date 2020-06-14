package com.seminara.text_dungeon;


public class App 
{
    public static void main( String[] args )
    {
        Arma a = GeneraArma.getInstance().getArma(0);
        System.out.println(a.getTipo());
    }
}
