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

    private Map<Joukkue, Integer> rankkarit;

    public Kierros(Peli peli){
        this.kierrosId = counter++;
        this.kierroksenPelit.add(peli);


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
}
