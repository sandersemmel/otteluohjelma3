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
    private int ensimmainenjoukkue = 0;
    private int toinenJoukkue = 1;

    public Matsi(){
        Joukkue ensimmainenJoukkue = new Joukkue();
        Joukkue toinenJoukkue = new Joukkue();
        matsi.add(ensimmainenJoukkue);
        matsi.add(toinenJoukkue);
    }


    public void tulostaMatsinJoukkueet(){
        Helpers.tulostaArray(matsinJoukkueetArray);
    }
    public void tulostaYksittainenMatsi(){
        Helpers.tulostaArrayList(matsi);
    }

}

