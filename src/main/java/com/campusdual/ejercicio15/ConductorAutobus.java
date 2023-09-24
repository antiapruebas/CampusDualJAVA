package com.campusdual.ejercicio15;

public class ConductorAutobus extends Trabajador {


    protected String linea;

    public ConductorAutobus(String name, String surname, String linea){
        super(name, surname);
        this.linea = linea;
    }
    @Override
    public void getDetails() {
        System.out.println("Conductor de autobus " + name + " " + surname + ", linea " + linea);
    }
}
