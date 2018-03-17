package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Sander on 5.3.2018.
 */
public class KierrosRepository implements Repository<Kierros>{
    private List<Peli> kierroksenPelit = new ArrayList<>();
    private List<Peli> peliLista = new ArrayList<Peli>();
    private List<Kierros> kierrokset = new ArrayList<>();
    private int peliMaara;
    private int kierrosMaara;

    public KierrosRepository(int kierrosMaara, List<Peli> peliLista){
        this.kierrosMaara = kierrosMaara;
        this.peliLista = peliLista;
        this.peliMaara = peliLista.size();
    }


    @Override
    public void create(Kierros kierros) {

    }

    @Override
    public List<Peli> getArrayList() {
        return kierroksenPelit;
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

    public void createKierrokset(){
        for (int kierros = 0; kierros < kierrosMaara; kierros++){
            Kierros uusiKierros = new Kierros();
            kierrokset.add(uusiKierros);
        }
    }


    public void createAll(){
        // Tehdään kaikki 22 kierrosta ja lisätään niille sitten aina pelit
        for (int i=0;i<peliMaara; i++){
            Random R = new Random();
            int randomKierrosId = R.nextInt(22);

            Peli peli = peliLista.get(i);

            kierrokset.get(randomKierrosId).addPeliToKierros(peli);

        }
    }

    public List<Peli> getKierrokset(){
        return kierroksenPelit;
    }

    public void jarjesta(){
        Collections.sort(kierroksenPelit, new Jarjesta());
    }
    public List<Kierros> getKierroksetJaPelit2(){
        return kierrokset;
    }
}

