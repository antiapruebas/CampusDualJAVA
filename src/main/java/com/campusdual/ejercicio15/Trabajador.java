package com.campusdual.ejercicio15;

public abstract class Trabajador {

    protected String name;
    protected String surname;

    public Trabajador(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public abstract void getDetails();
}




