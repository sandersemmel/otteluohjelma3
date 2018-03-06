package com.company;

import java.util.ArrayList;

/**
 * Created by Sander on 5.3.2018.
 */
public class KierrosRepository implements Repository<Kierros>{
    private ArrayList<Kierros> kierrosList = new ArrayList<Kierros>();


    @Override
    public void create(Kierros kierros) {
        kierrosList.add(kierros);
    }

    @Override
    public ArrayList<Kierros> getArrayList() {
        return kierrosList;
    }

    @Override
    public void add(Kierros kierros) {
    }

    @Override
    public void remove(Kierros kierros) {

    }

    @Override
    public void update(Kierros kierros) {

    }
    public void createAll(int number){
        ArrayList<Kierros> lista = new ArrayList<Kierros>();
        for (int i=0;i<number; i++){
            lista.add(new Kierros());
        }
        this.kierrosList = lista;
    }
}
