package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Sander on 5.3.2018.
 */
public class Kierros implements GenericInterface{
    private static int counter = 0;
    private int kierrosId;
    private List<Peli> kierroksenPelit = new ArrayList<>();
    private List<Joukkue> kierroksenJoukkueet = new ArrayList<>();
    private List<Joukkue> kaikkiJoukkueet = new ArrayList<>();


    private Map<Joukkue, Integer> rankkarit;

    public Kierros(){
        this.kierrosId = counter++;
    }

    public int getId(){
        return this.kierrosId;
    }
    public void setId(int kierrosId){
        this.kierrosId = kierrosId;
    }
    public List<Peli> getKierroksenPelit(){
        return this.kierroksenPelit;
    }
    public void addPeliToKierros(Peli peli){
        kierroksenPelit.add(peli);
        addJoukkueetKierroksenOmaanListaan();
    }
    public List<Joukkue> getKierroksenJoukkueet(){
        return this.kierroksenJoukkueet;
    }
    public void addKaikkiJoukkueet(List<Joukkue> joukkueet){
        this.kaikkiJoukkueet = joukkueet;
    }
    private void addJoukkueetKierroksenOmaanListaan(){
        for(int peliIndex=0;peliIndex<kierroksenPelit.size(); peliIndex++){
            Joukkue eka = kierroksenPelit.get(peliIndex).getEnsimmainenJoukkue();
            Joukkue toka = kierroksenPelit.get(peliIndex).getToinenJoukkue();
            kierroksenJoukkueet.add(eka);
            kierroksenJoukkueet.add(toka);
        }
    }
    public Joukkue getKierroksellaEiEsiintyväJoukkue(int id){
         return this.kaikkiJoukkueet.get(id);
    }

}
