package com.company;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


/*
* Huomioitavaa, tuleeko ongelma jos pelin 0 ja pelin 132 joukkueID on sama Joukkue@1b6d3586?
*
* */

public class Main {

    public static void main(String[] args) {

/*        List<Map.Entry<Integer, Integer>> matches = new ArrayList<>();

        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 12; j++) {
                if(i != j) {
                    for(int k = 0; k < 2; k++) {
                        matches.add(new AbstractMap.SimpleEntry<>(i, j));
                    }
                }
            }
        }
        for(int i = 0; i < 22; i++) {

        }
        System.out.println(matches.size());

        System.exit(0);


        int numberOfRounds = 22;

        for(int i = 0; i < numberOfRounds; i++) {

        }*/


        /*Luodaan Repository Oliot*/
        JoukkueRepository j = new JoukkueRepository(12);
        j.createAll();

        PeliRepository p = new PeliRepository(j.getJoukkueet(), true);
        p.createAll();

        KierrosRepository k = new KierrosRepository(22, p.getPelit());
        k.createAll();
        k.jarjesta();

        k.createAll2();

        Collections.sort(k.getKierrokset(), new Comparator<Peli>() {
            public int compare(Peli p1, Peli p2) {
                return Integer.valueOf(p1.getPelinKierrosId()).compareTo(p2.getPelinKierrosId());
            }
        });


        int kierrostenMaara = 22;
        List<Peli> kaikkipelit = k.getKierrokset();
        int joukkueEsiintyyKerran = 1;
        int rangaistus = 1;
        HashMap<Joukkue, Integer> kierroksenJoukkueet = new HashMap<>();
        int joukkueidenIdMaara = 11;
        List<Joukkue> joukkueidenLista = j.getArrayList();


        for (Peli peli : kaikkipelit) {

            System.out.println("Pelin Id:" + peli.getId() + "Pelin KierrosId:" + peli.getPelinKierrosId() +
                    "Joukkue #1  " + peli.getEnsimmainenJoukkue().getId() + "Rankkari: " + peli.getEnsimmainenJoukkue().getJoukkueRankkari() + "  " +
                    "Joukkue #2  " + peli.getToinenJoukkue().getId() + "Rankkari" + peli.getToinenJoukkue().getJoukkueRankkari());
        }
    }
}

