package com.campusdual.ejercicio15;

public class RepartidorAmazon extends Trabajador{

    protected String ruta;

    public RepartidorAmazon(String name, String surname, String ruta){
        super(name, surname);
        this.ruta = ruta;
    }
    @Override
    public void getDetails() {
        System.out.println("Repartidor de amazon " + name + " " + surname + ", ruta " + ruta);
    }
}
