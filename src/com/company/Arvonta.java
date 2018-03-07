package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arvonta {
    private List<Joukkue> joukkueet = new ArrayList<Joukkue>();
    private ArrayList<Kierros> kierrokset = new ArrayList<>();
    private ArrayList<Peli> pelit = new ArrayList<>();
    private List<List<Joukkue>> arvotutPelit = new ArrayList<List<Joukkue>>();
    private ArrayList<Kierros> arvotutKierrokset = new ArrayList<>();
    private Joukkue pelinEnsimmainenJoukkue;
    private Joukkue pelinToinenJoukkue;
    private ArrayList<ArrayList<Joukkue>> yksittaisetPelit = new ArrayList<ArrayList<Joukkue>>();

    /**/
    private int joukkueidenMaara;
    private int kierrostenMaara;
    private int pelienMaara;
    private int counter = 0;

    public Arvonta(ArrayList<Joukkue> joukkueet, ArrayList<Kierros> kierrokset, ArrayList<Peli> pelit){
        this.joukkueet = joukkueet;
        this.kierrokset = kierrokset;
        this.pelit = pelit;

        this.joukkueidenMaara = joukkueet.size();
        this.kierrostenMaara = kierrokset.size();
        this.pelienMaara = pelit.size();
    }


    /* What about käydä läpi vain yksi peli ja sitten lisätä ne johonkin listaan,
     jonka jälkeen jakaa tämä lista kahdella eli ottaa aina [0] ja [1] ja lisätä ne arvotutpelit listaan*/
    public void arvoJoukkueetPeleihin(){
        int toisenJoukkueenId = 0;
        for (int i = 0; i<joukkueidenMaara; i++){
            toisenJoukkueenId = (i + 1);
            if(toisenJoukkueenId > joukkueidenMaara){
                break;
            }else{
                for (int j=0; j<joukkueidenMaara; j++){
                    if(toisenJoukkueenId >= joukkueidenMaara){
                        break;
                    }else {
                        this.pelinEnsimmainenJoukkue = joukkueet.get(i);
                        this.pelinToinenJoukkue = joukkueet.get(toisenJoukkueenId);

                        ArrayList<Joukkue> yksittainenPeliArray = new ArrayList<Joukkue>();
                        yksittainenPeliArray.add(pelinEnsimmainenJoukkue);
                        yksittainenPeliArray.add(pelinToinenJoukkue);

                        yksittaisetPelit.add(yksittainenPeliArray);
                        toisenJoukkueenId++;
                    }
                }
            }
            toisenJoukkueenId = 0;
        }
    }
    public ArrayList<ArrayList<Joukkue>> getYksittaisetPelit(){
        return yksittaisetPelit;
    }
}
