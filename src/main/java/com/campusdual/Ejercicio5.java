package com.campusdual;

public class Ejercicio5 {

    //Comprobar si un numero es positivo o negativo
    //Comprobar si un numero es múltiplo de otro
    // Comprobar que un número sea menos que otro
public static void comprobarPositivo (int number) {
    if (number > 0){
    System.out.println("El número es positivo");
} else if (number == 0) {
        System.out.println("El número es cero");
    } else {
        System.out.println("El número es negativo");
    }
}

 public static boolean esMultiplo ( int multiplo, int numero) {
        if (numero%multiplo == 0) {
            return true;
        } else {
            return false;
        }

}
    public static void main(String[] args) {

       comprobarPositivo(0);
       comprobarPositivo(5);

        System.out.println(esMultiplo(5,10));

        int numero = 2;
        int multiplo = 8;


        

        }



    }

