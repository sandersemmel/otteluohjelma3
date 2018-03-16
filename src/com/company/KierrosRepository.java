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
    public void createAll(){
        /***
         * Lisaa pelille random KierrosId:n ja laittaa sen kierroksenPelit listalle.
         * */
        for (int i=0;i<peliMaara; i++){
            Random R = new Random();
            int random = R.nextInt(22);
            Peli peli = this.peliLista.get(i);
            Kierros kierros = new Kierros();

            peli.setKierrosId(random);

            this.kierroksenPelit.add(peli);
        }
    }
    public void createAll2(){
        /***
         * Lisaa pelille random KierrosId:n ja laittaa sen kierroksenPelit listalle.
         * */
        for (int i=0;i<peliMaara; i++){
            Random R = new Random();
            int random = R.nextInt(22);

            Peli peli = peliLista.get(i);
            Kierros kierros = new Kierros(peli);
            kierrokset.add(kierros);
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
