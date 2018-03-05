package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class Joukkue {
    private static int counter = 0;
    private int joukkueenId;

    public Joukkue(){
        this.joukkueenId = counter++;
    }
    public void tulostaJoukkueenId(){
        System.out.println(this.joukkueenId);
    }
    public int getId(){
        return this.joukkueenId;
    }
}