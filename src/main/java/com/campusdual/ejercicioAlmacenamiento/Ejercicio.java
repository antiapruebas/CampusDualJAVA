package com.campusdual.ejercicioAlmacenamiento;

import com.campusdual.redSocial.Utils;


public class Ejercicio {

    public static void main(String[] args) {
   Agenda agenda1 = new Agenda();
   Personas persona1 = new Personas();
   persona1.incluirTelefono(Utils.string("Introduce el número de teléfono: "));
   agenda1.agregarPersona(persona1);

/*
     Personas persona1 = new Personas("4696679Y", "Juan", "Perez", "A Coruña", "15001");
     Personas   persona2 = new Personas("8795478R", "Sara ", "Escudero", "A Coruña", "15007");

     persona1.incluirTelefono(981452535L);
     persona2.incluirTelefono(982452535L);
     persona2.llamarPersona(persona1);

*/



}   }
