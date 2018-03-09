package com.company;

import java.util.ArrayList;
import java.util.List;


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


        for(int i = 0; i < peliListaKierroksilla.size(); i++){
            peliListaKierroksilla.sort();

            Peli peli = peliListaKierroksilla.get(0);
                peli.getPelinKierrosId(i);
            }
        }





        for(Peli peli: peliListaKierroksilla){
            System.out.println("Pelin Id:" + peli.getId() + "Pelin KierrosId:" + peli.getPelinKierrosId() +
                                "Pelin joukkueet " + peli.getEnsimmainenJoukkue() + "  " + peli.getToinenJoukkue() );
        }

        /*Testing setting pelirankkari*/
        Joukkue j1 = new Joukkue();
        Joukkue j2 = new Joukkue();
        Peli peli = new Peli(j1,j2);



        System.out.println(peli.getPeliRankkari());
        peli.addPeliRankkari();
        System.out.println(peli.getPeliRankkari());
        peli.addPeliRankkari();
        System.out.println(peli.getPeliRankkari());
        peli.addPeliRankkari();
        System.out.println(peli.getPeliRankkari());






        System.out.println("Hello");
        /*Luodaan Joukkue, Peli ja Kierros-oliot */


        /*Arvonta olio arpoo*/

    }
}
