package com.campusdual.ejercicio12;

import com.campusdual.Main;


public class Coche {
    public String marca;
    public String modelo;
    public static final int MAX_VELOCIDAD = 120; // VA EN MAYUSC PORQUE ES CONSTANTE, si hacemos caso a la DGT
    public String combustible;
    public int velocimetro = 0;
    public int tacometro = 0;
    public String gear = "N";
    public boolean marchaAtras = false;
    public int giroVolante = 0;

    //CONSTRUCTOR
    public Coche(String marca, String modelo, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
    }

    public void encender() {
        if (this.tacometro == 0) {
            this.tacometro = 1000;
            System.out.println("coche encendido");
        } else {
            System.out.println("el coche ya está encendido");
        }

    }

    public void apagar() {
        if (this.velocimetro == 0 && this.tacometro > 0) {
            this.tacometro = 0;
            System.out.println("Coche apagado");
        } else if (this.velocimetro != 0) {
            System.out.println("No puedes apagar el coche en movimiento");
        } else {
            System.out.println("El coche no está encendido");
        }
    }


    public void acelerar() {
        if (this.tacometro > 0 && this.velocimetro < Coche.MAX_VELOCIDAD) {
            this.velocimetro += 10;
            System.out.println("Mi velocidad es " + this.velocimetro);
        } else if (this.tacometro == 0) {
            System.out.println("El coche está apagado, no podemos acelerar");
    } else if (this.velocimetro >= Coche.MAX_VELOCIDAD) {
            System.out.println("Ya vamos a máxima velocidad");
        } else {
            System.out.println("Pide cita en el taller");
        }
    }

    public void frenar( ) {
        while (this.velocimetro > 0) {
            this.velocimetro -= 10;
            System.out.println("Mi velocidad es " + this.velocimetro);
        }

        System.out.println("Nos hemos detenido");
    }

    public void girarVolante(int giro) {
        this.giroVolante +=  giro;
        if (this.giroVolante < 0) {
            System.out.println("Giro a la izquierda");
        } else if (this.giroVolante == 0) {
            System.out.println("Vamos recto");
        } else {
            System.out.println("Giro a la derecha");
        }
    }


    public void marchaAtras () {
        if (this.velocimetro== 0) {
            if(this.marchaAtras == false){
                this.marchaAtras= true;
                System.out.println("Puesta la marcha atrás");
            } else {
                this.marchaAtras= false;
                System.out.println("Estábamos marcha atrás, volvemos a marcha normal.");
            }
        } else {
            System.out.println("El coche debe estar parado para cambiar el sentido de la marcha");
        }

    }
    public static void main(String[] args) {

        Coche micoche = new Coche("Citröen", "Xsara", "Gasolina");



        micoche.girarVolante(-10);
        micoche.girarVolante(10);
        micoche.girarVolante(20);
        micoche.marchaAtras();
        micoche.marchaAtras();



    }
}

