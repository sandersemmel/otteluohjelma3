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
    public void add(Kierros kierros) {
    }

    @Override
    public void remove(Kierros kierros) {

    }

    @Override
    public void update(Kierros kierros) {

    }
}
