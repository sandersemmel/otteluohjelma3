package com.company;

import java.util.ArrayList;

/**
 * Created by Sander on 5.3.2018.
 */
public class Kierros implements GenericInterface{
    private static int counter = 0;
    private int kierrosId;

    public Kierros(){
        this.kierrosId = counter++;
    }
    public int getId(){
        return this.kierrosId;
    }
    public int setId(){
        return 0;
    }
}
