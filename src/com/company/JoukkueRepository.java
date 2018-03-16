package com.company;

import java.util.*;

public class JoukkueRepository implements Repository<Joukkue>{
    private ArrayList<Joukkue> joukkueList = new ArrayList<Joukkue>();
    private int joukkueMaara;
        public JoukkueRepository(int joukkueMaara){
            this.joukkueMaara = joukkueMaara;
        }

    @Override
    public void create(Joukkue joukkue) {
        joukkueList.add(joukkue);
    }

    @Override
    public ArrayList<Joukkue> getArrayList() {
        return joukkueList;
    }

    public void add(Joukkue joukkue){
    }
    public void update(Joukkue joukkue){

    }
    public void remove(Joukkue joukkue){
        joukkueList.remove(joukkue.getId());
    }
    public void printAll(){
        for(Joukkue joukkue: this.joukkueList){
                System.out.println(joukkue.getId());
        }
    }
    public void createAll(){
        for (int i=0;i<this.joukkueMaara; i++){
            joukkueList.add(new Joukkue());
        }
    }
    public List<Joukkue> getJoukkueet(){
        return joukkueList;
    }
    public void paivitaJoukkueenRankkari(int id){
        this.joukkueList.get(id).incrementJoukkueRankkari();
    }
}


