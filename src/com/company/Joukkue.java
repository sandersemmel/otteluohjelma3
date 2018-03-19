package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Joukkue implements GenericInterface {
    private static int counter = 0;
    private int joukkueenId;
    private int joukkueRankkari;
    private HashMap<Kierros,Integer> kierrosJaRankkari = new HashMap<>();

    public Joukkue(){
        this.joukkueenId = counter++;
    }
    public int getId(){
        return this.joukkueenId;
    }

    @Override
    public void setId(int id) {

    }

    public int setId(){
        return 0;
    }
    public void setJoukkueRankkari(int rankkari){
        this.joukkueRankkari = rankkari;
    }
    public void incrementJoukkueRankkari(){
        this.joukkueRankkari = joukkueRankkari+1;
    }
    public int getJoukkueRankkari(){
        return this.joukkueRankkari;
    }

    public void setKierrosJaRankkariJoukkueelle(Kierros kierros,int rankkari){
        this.kierrosJaRankkari.put(kierros,rankkari);
    }
}