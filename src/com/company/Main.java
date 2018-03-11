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

        PeliRepository p = new PeliRepository(j.getJoukkueet(), true);
        p.createAll();

        KierrosRepository k = new KierrosRepository(22, p.getPelit());
        k.createAll();
        k.jarjesta();

        k.createAll2();



        /*Jos joukkue löytyy kierroksen pelien listalta niin silloin sille lisätään rankkari*/
        for(Kierros kierros: k.getKierroksetJaPelit2()){
            System.out.println("Kierroksen Id:" + kierros.getId());
            for(Peli peli : kierros.getKierroksenPelit()){
                int joukkueenrankkarit = 0;
                for(Joukkue joukkue: peli.getPelinJoukkueet()){
                    for(int i=0;i < peli.getPelinJoukkueet().size(); i++){
                        Joukkue tarkistettava = peli.getPelinJoukkueet().get(i);
                        tarkistettava.getId();

                        if(kierros.getKierroksenPelit().contains(tarkistettava)){
                            // Lisätään tarkistettavalle rankkari sen mukaan, kuinka monta kertaa esiintyy kierroksella

                        }
                    }
                }
            }
        }



        /*Kierrosten ja niiden pelien tulostus*/


//        for(int i=0; i<k.getKierrokset().size(); i++) {
//
//            for(k.getKierrokset().get(0).getPelinJoukkueet().get(i)){
//
//            }
//
//            }
//        }

//        for(Peli peli: peliListaKierroksilla){
//
//            System.out.println("Pelin Id:" + peli.getId() + "Pelin KierrosId:" + peli.getPelinKierrosId() +
//                    "Pelin joukkueet " + peli.getEnsimmainenJoukkue() + "  " + peli.getToinenJoukkue() );
//        }
    }
}