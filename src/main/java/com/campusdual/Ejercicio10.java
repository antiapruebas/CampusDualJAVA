package com.campusdual;
import java.util.Random;


public class Ejercicio10 {

    /*Ejercicio 10, sacar una bola de color verde, azul o rojo de manera aleatoria 15 veces desde una caja*/

    public static void main(String[] args) {



        final String bolaVerde = "VERDE";
        final String  bolaRoja = "ROJA";
        final String   bolaAzul = "AZUL";

        for (int i = 0; i< 15; i++) {
            Random rand = new Random();
            int numeroRandom = rand.nextInt(3) + 1;

            String bolaColor;

            switch (numeroRandom) {
                case 1:
                    bolaColor = bolaVerde;
                    break;
                case 2:
                    bolaColor = bolaRoja;
                    break;
                case 3:
                    bolaColor = bolaAzul;
                    break;
                default:
                    bolaColor = "pues  si me da otra cosa, debe ser invisible";
            }
            System.out.println("Bola n " + i + ":" + bolaColor);

        }


    }
}
