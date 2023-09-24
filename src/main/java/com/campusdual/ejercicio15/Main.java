package com.campusdual.ejercicio15;

public class Main {

    public static void main(String[] args) {

        Bombero b = new Bombero("Socorro", "Martínez", "Coruña");
        ConductorAutobus ca = new ConductorAutobus("María", "Mallo", "23");
        RepartidorAmazon ra = new RepartidorAmazon("Salomé", "Rodriguez", "PLK45878");
        b.getDetails();         ca.getDetails();         ra.getDetails();     }
}
