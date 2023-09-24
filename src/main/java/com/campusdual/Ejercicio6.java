package com.campusdual;
import java.util.Calendar;

public class Ejercicio6 {

//Comprobar cuál es la estación del año  12, 1,2 (invierno), 3,4,5 (primavera), 6,7,8 (verano), 9,10,11 (otoño)
//Comprobar si es de mañana, tarde o noche de 5 a 13 (mañana), de 13 a 21 (tarde), de 21 a 5 (noche)




    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

         int mes = cal.get(Calendar.MONTH);

         int hora = cal.get(Calendar.HOUR_OF_DAY);


        switch (hora) {
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Noche");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Mañana");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("Tarde");
                break;

        }


        switch (mes + 1) {
            case 1:
            case 2:
            case 3:
                System.out.println("Invierno");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Primavera");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Verano");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Invierno");
                break;

        }
    }
}



