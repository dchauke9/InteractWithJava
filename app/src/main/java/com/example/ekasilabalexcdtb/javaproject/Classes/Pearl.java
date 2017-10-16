package com.example.ekasilabalexcdtb.javaproject.Classes;

/**
 * Created by eKasiLab Alex CDTB on 16 Oct 2017.
 */

public class Pearl extends Person {

    private int numOfWeaves;

    public Pearl(String name, String surname, String id_Nr, String gender, String race, int age) {
        super(name, surname, id_Nr, gender, race, age);
    }

    public int getNumOfWeaves() {
        return numOfWeaves;
    }

    public void setNumOfWeaves(int numOfWeaves) {
        this.numOfWeaves = numOfWeaves;
    }
}
