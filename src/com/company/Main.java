package com.company;

import java.util.*;


/*
* Huomioitavaa, tuleeko ongelma jos pelin 0 ja pelin 132 joukkueID on sama Joukkue@1b6d3586?
*
* */

public class Main {

    public static void main(String[] args) {
        /*Luodaan Repository Oliot*/
        JoukkueRepository j = new JoukkueRepository(12);
            j.createAll();

        PeliRepository p = new PeliRepository(j.getJoukkueet(),true);
            p.createAll();

        KierrosRepository k = new KierrosRepository(22,p.getPelit());
        k.createAll();
        k.jarjesta();

        /*Kierrosten ja niiden pelien tulostus*/



        for(int i=0; i<k.getKierrokset().size(); i++) {

            for(k.getKierrokset().get(0).getPelinJoukkueet().get(i)){

            }

            }
        }

//        for(Peli peli: peliListaKierroksilla){
//
//            System.out.println("Pelin Id:" + peli.getId() + "Pelin KierrosId:" + peli.getPelinKierrosId() +
//                    "Pelin joukkueet " + peli.getEnsimmainenJoukkue() + "  " + peli.getToinenJoukkue() );
//        }
    }