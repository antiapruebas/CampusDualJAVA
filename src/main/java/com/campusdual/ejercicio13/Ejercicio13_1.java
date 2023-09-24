package com.campusdual.ejercicio13;

public class Ejercicio13_1 {

    private int actualFuel = 10;



    public void setactualFuel(int actualFuel) {
        if (actualFuel >= 0) {
            this.actualFuel = actualFuel;
        } else {
            System.out.println("El mínimo debe ser 0");
        }
    }


    public void showDetails() {
        System.out.println("La capacidad actual es de " + this.actualFuel + " litros.");
    }

    public static void main(String[] args) {
        Ejercicio13_1 cO = new Ejercicio13_1();
        cO.showDetails();
        System.out.println("Actualización capacidad");
        cO.setactualFuel(-8);;//cO.actualFuel = -8;
        cO.showDetails();
    }
}
