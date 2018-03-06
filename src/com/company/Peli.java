package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Peli implements GenericInterface {
    private static int counter = 0;
    private int peliId;
    private ArrayList<Joukkue> peli = new ArrayList<Joukkue>();
    private int peliListanKoko = peli.size();
    private int[] pelinJoukkueetArray = new int[1];
    private int joukkueMaara = 2;
    private int pelimaara = 131;


    public Peli(){
        this.peliId = counter++;
    }

    public void tulostapelinJoukkueet(){
        Helpers.tulostaArrayListJoukkueenId(peli);
    }
    public void tulostaYksittainenpeli(){
        Helpers.tulostaArrayListJoukkueenId(peli);
    }
    public int getpeliId(){
        return this.peliId;
    }

    @Override
    public int getId() {
        return this.peliId;
    }

    @Override
    public int setId() {
        return 0;
    }

}

