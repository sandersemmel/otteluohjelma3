package com.company;

import java.util.ArrayList;
import java.util.List;

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
        List<Joukkue> yksittaisetPelit = ArvotutPelit.getYksittaisetPelit();
        Helpers.tulostaListJoukkue(ArvotutPelit.getYksittaisetPelit());
        System.out.println("kek");
        System.out.println(yksittaisetPelit.size());
    }
}
