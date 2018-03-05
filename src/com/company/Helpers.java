package com.company;

import java.util.ArrayList;

/**
 * Created by Sander on 5.3.2018.
 */
public class Helpers {
    public static void tulostaArray(int[] array) {
        for (int arvo : array) {
            System.out.println(arvo);
        }
    }

    public static void tulostaArrayListJoukkue(ArrayList<Joukkue> tulostettavaArrayLista) {
        for (Joukkue joukkue : tulostettavaArrayLista) {
            System.out.println(joukkue.getId());
        }
    }

    public static void tulostaGeneerinen(ArrayList<?> arraylist) {
        for (Object o : arraylist) {

        }
    }
    public static ArrayList<Joukkue> createAllObjects(int number, Joukkue joukkue){
        ArrayList<Joukkue> lista = new ArrayList<Joukkue>();
        for (int i=0;i<number; i++){
            lista.add(new Joukkue());
        }
        return lista;
    }
}
