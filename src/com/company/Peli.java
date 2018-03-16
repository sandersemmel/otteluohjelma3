package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Peli implements GenericInterface {
    private static int counter = 0;
    private int peliId;
    private ArrayList<Joukkue> pelinJoukkueet = new ArrayList<Joukkue>();
    private Joukkue ensimmainenJoukkue;
    private Joukkue toinenJoukkue;
    private int joukkueidenMaaraPelissa;
    private int kierrosId;
    private int peliRankkari;

    public Peli(Joukkue ensimmainenJoukkue, Joukkue toinenJoukkue){
        this.peliId = counter++;
        this.ensimmainenJoukkue = ensimmainenJoukkue;
        this.toinenJoukkue = toinenJoukkue;
        pelinJoukkueet.add(this.ensimmainenJoukkue);
        pelinJoukkueet.add(this.toinenJoukkue);
        this.joukkueidenMaaraPelissa = pelinJoukkueet.size();
    }

    public void tulostapelinJoukkueet(){

    }
    public void tulostaYksittainenpeli(){

    }
    public int getpeliId(){
        return this.peliId;
    }

    @Override
    public int getId() {
        return this.peliId;
    }

    @Override
    public void setId(int id) {

    }


    public int setId() {
        return 0;
    }
    public int getEnsimmainenJoukkueId(){
        return ensimmainenJoukkue.getId();
    }
    public int getToinenJoukkueId(){
        return toinenJoukkue.getId();
    }
    public Joukkue getEnsimmainenJoukkue(){
        return this.ensimmainenJoukkue;
    }
    public Joukkue getToinenJoukkue(){
        return this.toinenJoukkue;
    }
    public void setKierrosId(int kierrosId){
        this.kierrosId = kierrosId;
    }
    public void addPeliRankkari(){
        this.peliRankkari++;
    }
    public int getPeliRankkari(){
        return this.peliRankkari;
    }
    public int getPelinKierrosId(){
        return this.kierrosId;
    }
    public int getPelinKierrosId(int id){
        return this.kierrosId;
    }
    public List<Joukkue> getPelinJoukkueet(){
        return this.pelinJoukkueet;
    }
    public Joukkue getPelinJoukkue (int id){

        return this.pelinJoukkueet.get(id);
    }
    public int getJoukkeidenMaaraPerPeli(){
        return this.joukkueidenMaaraPelissa;
    }

}

