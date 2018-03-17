package com.company;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


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
        k.createKierrokset();
        k.createAll();


        k.jarjesta();


        Collections.sort(k.getKierrokset(), new Comparator<Peli>() {
            public int compare(Peli p1, Peli p2) {
                return Integer.valueOf(p1.getPelinKierrosId()).compareTo(p2.getPelinKierrosId());
            }
        });
    }
}



