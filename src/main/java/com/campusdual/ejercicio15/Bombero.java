package com.campusdual.ejercicio15;

public class Bombero extends Trabajador {

    protected String area;

    public Bombero(String name, String surname, String area){
        super(name, surname);
        this.area = area;
    }
    @Override
    public void getDetails(){
        System.out.println("Bombero " + name + " " + surname + ", area " + area );
    }
}






