package com.campusdual;

public class Ejercicios7 {

     //Suma los primeros 15 numeros naturales  ( era muestra xD)
    //Suma los primeros 100 números naturales

    public static void main(String[] args) {

/*       int numeros = 15;
        int suma= 0;

        for (int i = 1; i <= numeros; i++ ) {
            suma +=i;
        }
       System.out.println("La suma de los primeros " + numeros + " números naturales es " + suma);
        numeros = 100;
        suma= 0;
        for (int i = 1; i <= numeros; i++ ) {
            suma +=i;
        }
        System.out.println("La suma de los primeros " + numeros + " números naturales es " + suma);*/




        muestraNaturales(15);
        sumaNaturales(100);
    }

    public static  void muestraNaturales (int numero) {

        System.out.println( "Los primeros " + numero + " naturales son: ");
        for (int i = 0; i < numero; i++) {

            System.out.println(i+1);
            }
    }
    public static void sumaNaturales (int numeros) {
        {
            int suma = 0;

            for (int i = 1; i <= numeros; i++) {
                suma += i;
            }

            System.out.println("La suma de los primeros " + numeros + " números naturales es " + suma);
        }
    }






}



