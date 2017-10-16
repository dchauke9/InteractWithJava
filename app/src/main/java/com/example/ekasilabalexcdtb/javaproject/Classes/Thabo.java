package com.example.ekasilabalexcdtb.javaproject.Classes;

/**
 * Created by eKasiLab Alex CDTB on 16 Oct 2017.
 */

public class Thabo extends Person {
    //Unique identifier
   private String licenceNr;

    public Thabo(String name, String surname, String id_Nr, String gender, String race, int age) {
        super(name, surname, id_Nr, gender, race, age);
    }

    //Generates getters and setters of licence number
    public String getLicenceNr() {
        return licenceNr;
    }

    public void setLicenceNr(String licenceNr) {
        this.licenceNr = licenceNr;
    }

}
