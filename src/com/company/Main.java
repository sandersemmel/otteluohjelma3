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

        KierrosRepository k = new KierrosRepository(22, p.getPelit(),j.getJoukkueet());
        k.createKierrokset();
        k.createAll();


        k.jarjesta();




        List<Kierros> kierroksetPeleineen = k.getKierrokset();
        /*Rankkareiden laskeminen*/


        for (int kierros = 0; kierros < kierroksetPeleineen.size(); kierros++) {
            List<Peli> kierroksenPelit = kierroksetPeleineen.get(0).getKierroksenPelit();
            HashMap<Joukkue, Integer> JoukkueJaRankkari = new HashMap<>();
            int joukkueEsiintyyKerran = 1;

            for (int peli = 0; peli < kierroksenPelit.size(); peli++) {
                Joukkue pelinEnsimmainenJoukkue = kierroksenPelit.get(peli).getEnsimmainenJoukkue();
                Joukkue pelinToinenJoukkue = kierroksenPelit.get(peli).getToinenJoukkue();

                int ensimmainsenJoukkueenId = pelinEnsimmainenJoukkue.getId();
                int toisenJoukkueenId = pelinEnsimmainenJoukkue.getId();

                int ekanRankkari = joukkueEsiintyyKerran;
                int tokanRankkari = joukkueEsiintyyKerran;

                kierroksenPelit.get(peli).getEnsimmainenJoukkue();
                kierroksenPelit.get(peli).getToinenJoukkue();

                if (JoukkueJaRankkari.containsKey(pelinEnsimmainenJoukkue)) {
                    JoukkueJaRankkari.putIfAbsent(pelinEnsimmainenJoukkue, JoukkueJaRankkari.get(pelinEnsimmainenJoukkue) + 1);
                } else {
                    JoukkueJaRankkari.put(pelinEnsimmainenJoukkue, ekanRankkari);
                }

                if (JoukkueJaRankkari.containsKey(pelinToinenJoukkue)) {
                    JoukkueJaRankkari.putIfAbsent(pelinToinenJoukkue, JoukkueJaRankkari.get(pelinToinenJoukkue) + 1);
                } else {
                    JoukkueJaRankkari.put(pelinToinenJoukkue, tokanRankkari);
                }

            }
            /*Kuinka monta kertaa joukkue esiintyy kierroksella*/
            for (Map.Entry<Joukkue, Integer> map : JoukkueJaRankkari.entrySet()) {
                int tarkasteltavaJoukkueId = map.getKey().getId();
                int value = map.getValue();

                if (value == joukkueEsiintyyKerran) {
                    // Ei lisätä rankkaria, koska Joukkue esiintyy vain kerran kierroksella
                } else {
                    kierroksenPelit.get(kierros).getPelinJoukkue(tarkasteltavaJoukkueId).incrementJoukkueRankkari();
                }
            }
            /*Jos joukkue ei esiinny kierroksella, se saa rankkarin*/
            for (Joukkue joukkue : j.getJoukkueet()) {
                if (JoukkueJaRankkari.containsKey(joukkue)) {
                    // Joukkue on jo saanut rankkarin Kierrokselta
                } else {
                    // Lisää joukkuelle rankkarin, joka ei esiinny kierroksella, nämä joukkueet ovat omassa listassaan Kierros luokassa
                    Kierros nykyinenKierros = kierroksetPeleineen.get(kierros);
                    Joukkue kierroksenJoukkue = nykyinenKierros.getKierroksellaEiEsiintyväJoukkue(joukkue.getId());
                    kierroksenJoukkue.incrementJoukkueRankkari();
                }
            }


        }


        for(int kierros = 0; kierros < kierroksetPeleineen.size(); kierros++){
            System.out.println("Kierros: " + kierroksetPeleineen.get(kierros).getId());

            for(int peli = 0; peli < kierroksetPeleineen.get(kierros).getKierroksenPelit().size(); peli++){
                System.out.println("Peli " + kierroksetPeleineen.get(kierros).getKierroksenPelit().get(peli).getId() + "  " +
                                   "Joukkue: " + kierroksetPeleineen.get(kierros).getKierroksenPelit().get(peli).getEnsimmainenJoukkue().getId() + "  " +
                                    "Rankkari: " + kierroksetPeleineen.get(kierros).getKierroksenPelit().get(peli).getEnsimmainenJoukkue().getJoukkueRankkari() + "  " +
                                    "Joukkue: " + kierroksetPeleineen.get(kierros).getKierroksenPelit().get(peli).getToinenJoukkue().getId() + "  " +
                                    "Rankkari: " + kierroksetPeleineen.get(kierros).getKierroksenPelit().get(peli).getToinenJoukkue().getJoukkueRankkari());
            }
        }



    }

}









