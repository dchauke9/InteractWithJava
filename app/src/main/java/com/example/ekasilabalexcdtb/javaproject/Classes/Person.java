package com.example.ekasilabalexcdtb.javaproject.Classes;

/**
 * Created by eKasiLab Alex CDTB on 16 Oct 2017.
 */

public class Person {
    String name;
    String surname;
    String id_Nr;
    String gender;
    String race;
    int age;

    //Constructor
    public Person(String name, String surname, String id_Nr, String gender, String race, int age) {
        this.name = name;
        this.surname = surname;
        this.id_Nr = id_Nr;
        this.gender = gender;
        this.race = race;
        this.age = age;
    }

    //Generate Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId_Nr() {
        return id_Nr;
    }

    public void setId_Nr(String id_Nr) {
        this.id_Nr = id_Nr;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //The that other classes inherits from.

    public Person() {
        super();
    }
}

