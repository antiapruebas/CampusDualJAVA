package com.campusdual;

public class Ejercicio4 {

    //sumar los 5 primeros números naturales
    //sumar los 20 primeros números pares
    //Calcular el factorial de un número

    public static int sumanatural (){
        int resultado = 1+2+3+4+5;
        return resultado;}


        public static void sumaPares(){
            int resultado = 2+4+6+8+10+12+14+16+18+20+22+24+26+28+30+32+34+36+38+40;
            System.out.println("El resultado de la suma de los numeros pares hasta el 40 es  " + resultado);
        }


    public static void main(String[] args) {

        int resultado5 = sumanatural(); // 1+2+3+4+5;
        System.out.println("El resultado de la suma de los primeros números naturales es " + resultado5);


        int resultado20 = 2+4+6+8+10+12+14+16+18+20+22+24+26+28+30+32+34+36+38+40;
        System.out.println("El resultado de la suma de los numeros pares hasta el 40 es  " + resultado20);

        sumaPares();

        int factorial = 5*4*3*2*1;
        System.out.println( "El factorial de 5 es " + factorial);





    }
}
