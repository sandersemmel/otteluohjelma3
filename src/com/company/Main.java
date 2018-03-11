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
        List<Peli> peliListaKierroksilla = k.getKierrokset();



        // Otetetaan ensimmäinen kierros ja siltä kierrokselta satunnainen peli
        // Käydään kaikki kierrokset läpi ja valitaan se kierros jossa rankkarit vähenevät eniten ja siirretään peli sinne
        // Mikäli kuitenkin löytyy useampi kierros jossa rankkarit vähenevät yhtä paljon, arvotaan näiden väliltä kohdekierros

//        Peli peli = peliListaKierroksilla.get(0).getPelinKierrosId(0);
//        List<Peli> pelitsortattuna = peliListaKierroksilla.stream().sorted(());
//
//
//            Collections.sort(peliListaKierroksilla, peliListaKierroksilla.get(0).getPelinKierrosId(0));
//            peliListaKierroksilla.sort();


//
//
//        Jarjesta jarjesta = new Jarjesta(peliListaKierroksilla);
//        jarjesta.
//
//        List<Peli> pelilista = new ArrayList<>();
//        arvoRandomKierros(pelilista); // palauttaa random Pelin
//        arvoSiirrettavaPeli(Peli); // palauttaa
//        laskerankkarit(pelilista); // palauttaa kierrosId:n jolla on isoin rankkarimäärä



//        for(Peli peli: peliListaKierroksilla){
//            System.out.println(peli.getPelinKierrosId());
//        }


        //peliListaKierroksilla.sort(Comparator.comparing(x-> x.getPelinKierrosId()));


//        for(int i = 0; i < peliListaKierroksilla.size(); i++){
//
//            Peli peli = peliListaKierroksilla.get(0);
//                peli.getPelinKierrosId(i);
//            }

        Collections.sort(peliListaKierroksilla, new Jarjesta());

        for(Peli peli: peliListaKierroksilla){
            System.out.println("Pelin Id:" + peli.getId() + "Pelin KierrosId:" + peli.getPelinKierrosId() +
                    "Pelin joukkueet " + peli.getEnsimmainenJoukkue() + "  " + peli.getToinenJoukkue() );
        }

        

        /*Testing setting pelirankkari*/

        /*Luodaan Joukkue, Peli ja Kierros-oliot */


        /*Arvonta olio arpoo*/

    }
}