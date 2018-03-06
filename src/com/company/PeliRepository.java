package com.company;

import java.util.ArrayList;


public class PeliRepository implements Repository<Peli>{
    private ArrayList<Peli> pelit = new ArrayList<Peli>();
    @Override
    public void add(Peli peli) {

    }

    @Override
    public void remove(Peli peli) {

    }

    @Override
    public void update(Peli peli) {

    }

    @Override
    public void create(Peli peli) {

    }

    @Override
    public ArrayList<Peli> getArrayList() {
        return pelit;
    }

    public void createAll(int number){
        ArrayList<Peli> lista = new ArrayList<Peli>();
        for (int i=0;i<number; i++){
            lista.add(new Peli());
        }
            this.pelit = lista;
    }
    public void printAll(){
        for(Peli p: pelit){
            System.out.println(p.getId());
        }
    }

}
