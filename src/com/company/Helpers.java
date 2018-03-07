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
    public static void tulostaYksittainenPeli(List<Joukkue> lista, int index){
        System.out.println(lista.get(index).getId() + "  "  + lista.get(index));
        System.out.println(lista.get(index+1).getId() + "  "  + lista.get(index+1));
    }
    public static void tulostaKaikkiPelit(List<Joukkue> lista){
        int peliNumero = 0 ;
        for(int i=0;i<lista.size();i+=2){
            System.out.println("Peli" + peliNumero + "[" + lista.get(i).getId() + " " + lista.get(i+1).getId() + "]");
            peliNumero++;
        }
    }
    public static void tulostaArrayListanArrayLista(ArrayList<ArrayList<Joukkue>> lista){
        int counter = 0;
        for(ArrayList<Joukkue> joukkueArray: lista){
            for(int i=0; i<joukkueArray.size(); i+=2){
                    Joukkue ensimmainenJoukkue = joukkueArray.get(i);
                    Joukkue toinenJoukkue = joukkueArray.get(i+1);


                    System.out.println( "Ensimmäisen joukkueen id: " + " " +
                                        ensimmainenJoukkue.getId()   + " " +
                                        "Toisen joukkueen id: " +
                                        toinenJoukkue.getId());

                }
            }
        }
    }

