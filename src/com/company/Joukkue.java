package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Joukkue implements GenericInterface {
    private static int counter = 0;
    private int joukkueenId;
    private int joukkueRankkari;

    public Joukkue(){
        this.joukkueenId = counter++;
    }
    public int getId(){
        return this.joukkueenId;
    }
    public int setId(){
        return 0;
    }


}