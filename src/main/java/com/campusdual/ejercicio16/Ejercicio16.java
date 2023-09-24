package com.campusdual.ejercicio16;



public class Ejercicio16 {

    public static void main(String[] args) {
        IMachine plane = new Plane("Boeing");
        IMachine tractor = new Tractor(3500);
        IMachine submarine = new Submarine(1500);

        plane.start();
        tractor.start();
        submarine.start();

        ((Plane) plane).fly();
        ((Tractor) tractor).forward();
        ((Submarine) submarine).dive();

        ((Tractor)submarine).forward();
    }
}
