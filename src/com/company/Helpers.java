package com.company;

import java.util.ArrayList;

/**
 * Created by Sander on 5.3.2018.
 */
public class Helpers {
    public static void tulostaArray(int[] array){
        for (int arvo: array) {
            System.out.println(arvo);
        }
    }
    public static void tulostaArrayListJoukkue(ArrayList<Joukkue> tulostettavaArrayLista){
        for (Joukkue joukkue: tulostettavaArrayLista){
            System.out.println(joukkue.getId());
        }
    }
    public static void tulostaKaikkiMatsit(ArrayList<Matsi> tulostettavaMatsiLista){
        for(Matsi matsi: tulostettavaMatsiLista){
            matsi.tulostaYksittainenMatsi();
        }
    }
}
