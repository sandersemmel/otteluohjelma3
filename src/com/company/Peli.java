package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Peli {
    private static int counter = 0;
    private int peliId;
    private ArrayList<Joukkue> peli = new ArrayList<Joukkue>();
    private int peliListanKoko = peli.size();
    private int[] pelinJoukkueetArray = new int[1];
    private int joukkueMaara = 2;
    private int pelimaara = 131;


    public Peli(){
        peli.add(new Joukkue());
        peli.add(new Joukkue());
        this.peliId = counter++;
    }

    public void tulostapelinJoukkueet(){
        Helpers.tulostaArrayListJoukkue(peli);
    }
    public void tulostaYksittainenpeli(){
        Helpers.tulostaArrayListJoukkue(peli);
    }
    public int getpeliId(){
        return this.peliId;
    }

}

