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
        JoukkueRepository j = new JoukkueRepository();
        PeliRepository p = new PeliRepository();
        KierrosRepository k = new KierrosRepository();

        /*Luodaan Joukkue, Peli ja Kierros-oliot */
        j.createAll(12);
        p.createAll(132);
        k.createAll(22);


        /*Arvonta olio arpoo*/

        Arvonta ArvotutPelit =  new Arvonta(j.getArrayList(),k.getArrayList(),p.getArrayList());
        ArvotutPelit.arvoJoukkueetPeleihin();
        ArrayList<ArrayList<Joukkue>> ensimmainenEra = ArvotutPelit.getYksittaisetPelit();


        Helpers.tulostaArrayListanArrayLista(ensimmainenEra);

    }
}
