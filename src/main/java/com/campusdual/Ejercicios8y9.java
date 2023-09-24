package com.campusdual;

public class Ejercicios8y9 {


    public static void main(String[] args) {

        muestraNaturalesWhile(5);
        muestraNaturalesDoWhile(9);

    }

    public static void muestraNaturalesWhile(int numeroMax) {
        System.out.println("Los primeros " + numeroMax + " naturales son: ");

        int i = 0;
        while (i < numeroMax) {
            System.out.println(i + 1);
            i++;
        }
    }


    public static void muestraNaturalesDoWhile(int numero) {
        System.out.println("Los primeros " + numero + " naturales son: ");

        int i = 0;
        do {
            System.out.println(i + 1);
            i++;
        } while (i < numero);
    }
}
