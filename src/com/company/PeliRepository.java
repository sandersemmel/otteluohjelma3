package com.company;

import java.util.ArrayList;
import java.util.List;


public class PeliRepository implements Repository<Peli>{
    private List<Peli> pelit = new ArrayList<Peli>();
    private List<Joukkue> joukkueet = new ArrayList<>();
    private boolean roundRobin;
    private int eraMaara = 1;
    private int joukkueidenMaara;
    private Joukkue pelinEnsimmainenJoukkue;
    private Joukkue pelinToinenJoukkue;



        public PeliRepository(List<Joukkue> joukkueet, boolean roundrobin){
            if(roundrobin == true){
                this.joukkueet = joukkueet;
                this.eraMaara = 2;
                this.joukkueidenMaara = joukkueet.size();
            }
        }
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
    public List<Peli> getArrayList() {
        return pelit;
    }


    public void printAll(){
        for(Peli p: pelit){
            System.out.println(p.getId());
        }
    }
    public void createAll(){
        /**
         * Luo pelit joukkuemäärän perusteella
         * @return void
         * **/
        int counter = 0;
        int toisenJoukkueenId = 0;
        while(counter < this.eraMaara){
            for (int i = 0; i<joukkueidenMaara; i++){
                toisenJoukkueenId = (i + 1);
                if(toisenJoukkueenId > joukkueidenMaara){
                    break;
                }else{
                    for (int j=0; j<joukkueidenMaara; j++){
                        if(toisenJoukkueenId >= joukkueidenMaara){
                            break;
                        }else {

                            pelinEnsimmainenJoukkue = joukkueet.get(i);
                            pelinToinenJoukkue = joukkueet.get(toisenJoukkueenId);
                            Peli peli = new Peli(pelinEnsimmainenJoukkue,pelinToinenJoukkue);
                            pelit.add(peli);
                            toisenJoukkueenId++;
                        }
                    }
                }
                toisenJoukkueenId = 0;
            }
            counter++;
        }
    }
    public List<Peli> getPelit(){
        return this.pelit;
    }

}
