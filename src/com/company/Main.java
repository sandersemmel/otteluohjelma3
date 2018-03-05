package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        JoukkueRepository j = new JoukkueRepository();
        for(int i=0; i<=11; i++){
            j.add(new Joukkue());
        }
        j.printAll();
    }
}
