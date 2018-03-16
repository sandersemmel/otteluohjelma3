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
        k.createAll();
        k.jarjesta();

        k.createAll2();

        Collections.sort(k.getKierrokset(), new Comparator<Peli>() {
            public int compare(Peli p1, Peli p2) {
                return Integer.valueOf(p1.getPelinKierrosId()).compareTo(p2.getPelinKierrosId());
            }
        });
        /*
        * 1. Käydään läpi kierroksenpelit lista, otetaan ensimmäinen arraylista ja katsotaan sieltä ensimmäinen peli
        * 2. Otetaan seuraava arraylista ja vertaillaan, että vastaako ensimmäisen joukkueen id toisen arrayn ensimmäistä tai toista idtä
        * 3.
        * */


        int kierrostenMaara = 22;
        List<Peli> kaikkipelit = k.getKierrokset();
        int joukkueEsiintyyKerran = 1;
        int rangaistus = 1;
        HashMap<Joukkue, Integer> kierroksenJoukkueet = new HashMap<>();
        int joukkueidenIdMaara = 11;
        List<Joukkue> joukkueidenLista = j.getArrayList();





        

        for (int o = 0; o < kierrostenMaara; o++) {
            HashMap<Joukkue, Integer> hashemi = new HashMap<>();
            for (int i = 0; i < kaikkipelit.size(); i++) {
                if (kaikkipelit.get(i).getPelinKierrosId() == o) {
                    int ekanPiste = 0;
                    int tokanPiste = 0;

                    Joukkue eka = kaikkipelit.get(i).getEnsimmainenJoukkue();
                    Joukkue toka = kaikkipelit.get(i).getToinenJoukkue();

                    ekanPiste = ekanPiste + 1;
                    tokanPiste = tokanPiste + 1;

                    // Tarkistetaan löytyykö joukkue jo hashemi hashmapista
                    if (hashemi.get(eka) != null && hashemi.containsKey(eka)) {
                        hashemi.put(eka, hashemi.get(eka) + ekanPiste);
                    } else {
                        hashemi.put(eka, ekanPiste);
                    }


                    if (hashemi.get(toka) != null && hashemi.containsKey(toka)) {
                        hashemi.put(toka, hashemi.get(toka) + tokanPiste);
                    } else {
                        hashemi.put(toka, tokanPiste);
                    }
                } else {
                    for (int n = 0; n < hashemi.size(); n++) {
                        for (int s = 0; s < kaikkipelit.size(); s++) {
                            if (kaikkipelit.get(o).getPelinKierrosId() == o) {
                                Joukkue eka = kaikkipelit.get(o).getEnsimmainenJoukkue();
                                Joukkue toka = kaikkipelit.get(o).getToinenJoukkue();

                                if (hashemi.get(eka) != null && hashemi.containsKey(eka)) {
                                    // Jos hashmapista löytyy pelilistan enismmäinen joukkue
                                    int ekanEsiintymisKerrat = hashemi.get(eka);
                                    if (ekanEsiintymisKerrat == 1) {
                                        // Ei lisätä rankkaria
                                    } else {
                                        kaikkipelit.get(o).getEnsimmainenJoukkue().incrementJoukkueRankkari();

                                    }
                                } else {
                                    if (hashemi.get(toka) != null && hashemi.containsValue(toka)) {
                                        int tokanEsiintymiskerta = hashemi.get(toka);
                                        if (tokanEsiintymiskerta == 1) {
                                            //Ei lisätä rankkaria
                                        } else {
                                            kaikkipelit.get(o).getToinenJoukkue().incrementJoukkueRankkari();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for (Peli peli : kaikkipelit) {

            System.out.println("Pelin Id:" + peli.getId() + "Pelin KierrosId:" + peli.getPelinKierrosId() +
                    "Joukkue #1  " + peli.getEnsimmainenJoukkue().getId() + "Rankkari: " + peli.getEnsimmainenJoukkue().getJoukkueRankkari() + "  " +
                    "Joukkue #2  " + peli.getToinenJoukkue().getId() + "Rankkari" + peli.getToinenJoukkue().getJoukkueRankkari());
        }
    }
}

//
//
//        // what about otetaan kierros ja lasketaan kuinka monta joukkuetta siellä on ja annetaan joka kerta piste kun joukkue esiintyy
//
//        for (int i = 0; i < kierrostenMaara; i++) {
//            System.out.println("Kierros: " + i);
//            for (int e = 0; e < kaikkipelit.size(); e++) {
//                if (kaikkipelit.get(e).getPelinKierrosId() == i) {
//                    int ekanjoukkueenRankkari = 0;
//                    int tokanjoukkueenRankkari = 0;
//                    Joukkue eka = kaikkipelit.get(e).getEnsimmainenJoukkue();
//                    Joukkue toka = kaikkipelit.get(e).getToinenJoukkue();
//
//                    System.out.println("eka: " + eka.getId());
//                    System.out.println("toka: " + toka.getId());
//
//                    ekanjoukkueenRankkari++;
//                    tokanjoukkueenRankkari++;
//
//                    /*Jos joukkue jo löytyy niin päivitetään sen rankkarimäärä, muuten lisätään joukkue ja rankkari*/
//                    if (kierroksenJoukkueet.containsKey(eka)) {
//                        kierroksenJoukkueet.put(eka, kierroksenJoukkueet.get(ekanjoukkueenRankkari++));
//                    } else {
//                        if (kierroksenJoukkueet.containsKey(toka)) {
//                            kierroksenJoukkueet.put(toka, kierroksenJoukkueet.get(tokanjoukkueenRankkari++));
//                        } else {
//                            kierroksenJoukkueet.put(eka, ekanjoukkueenRankkari);
//                            kierroksenJoukkueet.put(toka, tokanjoukkueenRankkari);
//                        }
//
//                    }
//
//
//                }
//                else{
//                    /*Jos kierroksella ei ole enempää joukkueita, lasketaan joukkuekohtaiset rankkarit ja pelikohtaiset rankkarit?*/
//                    for(int y= 0; y<kierroksenJoukkueet.size(); y++){
//                        for(int l=0; l<joukkueidenLista.size(); l++){
//                            Joukkue joukkue = joukkueidenLista.get(l);
//                                if(kierroksenJoukkueet.get(joukkue)!= null && kierroksenJoukkueet.containsKey(joukkue)){
//                                    int arvo = kierroksenJoukkueet.get(joukkue);
//                                        if(arvo == 1){
//                                            /*Joukkue ei saa rankkaria, koska se esiintyy vain kerran kierroksella*/
//                                        }else{
//                                            /*Joukkue saa rangaistuksen, koska se esiintyy useammin kui kerran */
//                                            kaikkipelit.get(e).getPelinJoukkue(joukkue.getId()).incrementJoukkueRankkari();
//                                        }
//                                }
//                                else{
//                                    kaikkipelit.get(e).getPelinJoukkue(joukkue.getId()).incrementJoukkueRankkari();
//                                }
//                        }
//                    }
//
//                }
//            }
//        }
//
//
//
//
//
//
//
//
//
//
//        for (int i = 0; i < kierrostenMaara; i++) { // Otetaan eka kierros
//            int joukkueenRankkari = 0;
//                for (int g = 0; g < kaikkipelit.get(g).getJoukkeidenMaaraPerPeli(); g++) { // Eka tiimi pelistä
//                    for (int z = 0; z < kaikkipelit.size(); z++) {
//                        Joukkue vertailtava = kaikkipelit.get(z).getPelinJoukkue(g);
//                        int vertailtavanId = vertailtava.getId();
//
//                        for(int x = 0; x < kaikkipelit.size(); x++){
//                            if (kaikkipelit.get(z).getPelinKierrosId(z) == i) {
//                                if (vertailtavanId == kaikkipelit.get(x).getEnsimmainenJoukkueId() ||
//                                        vertailtavanId == kaikkipelit.get(x).getToinenJoukkueId()) {
//                                    joukkueenRankkari++;
//                                }
//                            }else {
//                                if (joukkueenRankkari == joukkueEsiintyyKerran) {
//                                    // Joukkue ei saa rankkaria
//                                } else {
//                                    vertailtava.setJoukkueRankkari(rangaistus);
//                                }
//                            }
//                        }
//
//                    }
//                }
//
//            }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        for (int i = 0; i < kierrostenMaara; i++) { // Otetaan eka kierros
//            int joukkueenRankkari = 0;
//            for (int g = 0; g < kaikkipelit.get(g).getJoukkeidenMaaraPerPeli(); g++) { // Eka tiimi pelistä
//                for (int z = 0; z < kaikkipelit.size(); z++) {
//                    Joukkue vertailtava = kaikkipelit.get(z).getPelinJoukkue(g);
//                    int vertailtavanId = vertailtava.getId();
//
//                    for(int x = 0; x < kaikkipelit.size(); x++){
//                        if (kaikkipelit.get(z).getPelinKierrosId(z) == i) {
//                            if (vertailtavanId == kaikkipelit.get(x).getEnsimmainenJoukkueId() ||
//                                    vertailtavanId == kaikkipelit.get(x).getToinenJoukkueId()) {
//                                joukkueenRankkari++;
//                            }
//                        }else {
//                            if (joukkueenRankkari == joukkueEsiintyyKerran) {
//                                // Joukkue ei saa rankkaria
//                            } else {
//                                vertailtava.setJoukkueRankkari(rangaistus);
//                            }
//                        }
//                    }
//
//                }
//            }
//
//        }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//                for(Peli peli: kaikkipelit){
//
//            System.out.println("Pelin Id:" + peli.getId() + "Pelin KierrosId:" + peli.getPelinKierrosId() +
//                    "Joukkue #1  " + peli.getEnsimmainenJoukkue().getId() + "Rankkari: " + peli.getEnsimmainenJoukkue().getJoukkueRankkari()+ "  " +
//                    "Joukkue #2  "  + peli.getToinenJoukkue().getId() + "Rankkari" + peli.getToinenJoukkue().getJoukkueRankkari());
//        }
//    }
//
//
//    }

        /*Jos joukkue löytyy kierroksen pelien listalta niin silloin sille lisätään rankkari*/
//        for(Peli peli: k.getKierrokset()){
//            System.out.println("Kierroksen Id:" + peli.getPelinKierrosId());
//                int joukkueenrankkarit = 0;
//                for(Joukkue joukkue: peli.getPelinJoukkueet()){
//
//                        Joukkue tarkistettava = peli.getPelinJoukkueet().get(i);
//                        tarkistettava.getId();
//                        for(int g  = 0; g < kierros.getKierroksenPelit().size(); i++){
//                            if(tarkistettava.getId() == kierros.getKierroksenPelit().get(g).getEnsimmainenJoukkue()
//                                    ){
//                        }

                        // Lisätään tarkistettavalle rankkari sen mukaan, kuinka monta kertaa esiintyy kierroksella
//
//                        }
//                    }

//                }
//            }
//        }



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
//    }
//}