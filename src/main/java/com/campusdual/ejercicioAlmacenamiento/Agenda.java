package com.campusdual.ejercicioAlmacenamiento;
 import java.util.HashMap;
 import java.util.Map;
public class Agenda {
    private Map<String, Personas> mapaContactos =new HashMap<>();

    public Agenda(){

    }

    public Map<String, Personas> getMapaContactos() {
        return mapaContactos;

    }

    public void setMapaContactos(Map<String, Personas> listaContactos) {
        this.mapaContactos = listaContactos;
    }

    public void agregarPersona(Personas persona){
        this.getMapaContactos().put(persona.getDni(), persona);
    }

    public void eliminarPersona(String dni){
        this.getMapaContactos().remove(dni);}

}
