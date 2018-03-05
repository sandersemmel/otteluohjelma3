package com.company;

import java.util.*;

public class JoukkueRepository implements Repository<Joukkue>{
    private ArrayList<Joukkue> joukkueList = new ArrayList<Joukkue>();

    @Override
    public void create(Joukkue joukkue) {
        joukkueList.add(joukkue);
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

    }
}


