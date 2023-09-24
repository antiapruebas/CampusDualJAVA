package com.campusdual;

public class Main {
    public static void main(String[] args) {
        //Calcula el área de un circulo de radio 15     A = PI  * R al cuadrado     PI = 3.1416

        double r = 15;
        final double PI = 3.1416;

        double a = PI * r * r;
        System.out.println(a);

        // Calcula la longitud de la circunferencia de radio 15 Longitud = 2 * PI  * r    PI = 3.1416

        double l = 2 * PI * r;
        System.out.println(l);

        System.out.println(area(5));
    }

    public static double area(double r) {
        double value = Math.PI * Math.pow(r, 2);
        return value;
    }
}