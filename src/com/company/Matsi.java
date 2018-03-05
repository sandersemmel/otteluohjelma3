package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Matsi {
    private static int counter = 0;
    private ArrayList<Joukkue> matsi = new ArrayList<Joukkue>();
    private int matsiListanKoko = matsi.size();
    private int[] matsinJoukkueetArray = new int[1];
    private int joukkueMaara = 2;
    private int matsimaara = 131;


    public Matsi(){
        matsi.add(new Joukkue());
        matsi.add(new Joukkue());
    }

    public void tulostaMatsinJoukkueet(){
        Helpers.tulostaArrayListJoukkue(matsi);
    }
    public void tulostaYksittainenMatsi(){
        Helpers.tulostaArrayListJoukkue(matsi);
    }

}

