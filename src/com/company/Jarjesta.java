package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Sander on 11.3.2018.
 */
public class Jarjesta implements Comparator<Peli> {
    public Jarjesta(){

    }
    @Override
    public int compare(Peli o1, Peli o2) {
        if(o1.getPelinKierrosId() > o2.getPelinKierrosId()){
            return 1;
        }else{
            return -1;
        }
    }
}
