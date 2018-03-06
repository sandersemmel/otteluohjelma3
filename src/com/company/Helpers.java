package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sander on 5.3.2018.
 */
public class Helpers {
    public static void tulostaArray(int[] array) {
        for (int arvo : array) {
            System.out.println(arvo);
        }
    }

    public static void tulostaArrayListJoukkueenId(ArrayList<Joukkue> tulostettavaArrayLista) {
        for (Joukkue joukkue : tulostettavaArrayLista) {
            System.out.println(joukkue.getId());
        }
    }
    public static void tulostaListJoukkue(List<Joukkue> lista){
        for(Joukkue joukkue: lista){
            System.out.println(joukkue.getId());
        }
    }

}
