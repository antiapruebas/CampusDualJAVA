package com.campusdual.ejercicioAlmacenamiento;
import com.campusdual.Red_Social.Utils;
import java.util.ArrayList;
import java.util.List;

public class Personas {

    protected String dni;
    protected String nombre;
    protected String apellido;
    protected String ciudad;
    protected String codigoPostal;
    protected List<String>  numeroTelefonoList = new ArrayList<>(); //probé con long pero por el  util no va

    protected String telefonoPrincipal;




    public Personas(String dni, String nombre, String apellido, String ciudad, String codigoPostal) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public Personas () {
        this.nombre = Utils.string("Introduce el nombre:" );
        this.apellido = Utils.string("Introduce el apellido:");
        this.ciudad = Utils.string("Introduce ciudad:");
        this.codigoPostal = Utils.string("Introduce código postal:");
        this.dni = Utils.string("Introduce DNI");}




    //MÉTODOS




    public void incluirTelefono(String numero){
        this.getNumeroTelefonoList().add(numero); //añadir a la lista de telefono, el parámetro
   if (this.telefonoPrincipal == null) {
       this.setTelefonoPrincipal(numero);

   }}

    public void llamarPersona( Personas persona ){
        System.out.println(this.getNombre() + " " + this.getApellido() + " llamando a " +
                persona.getNombre() + " " + persona.getApellido()+ "("+persona.getTelefonoPrincipal() +")" );

    }



//GETTERS Y SETTERS
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public List<String> getNumeroTelefonoList() {
        return numeroTelefonoList;
    }

    public String getTelefonoPrincipal() {
        return telefonoPrincipal;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setTelefonoPrincipal(String telefonoPrincipal) {
        this.telefonoPrincipal = telefonoPrincipal;
    }

    public void setNumeroTelefonoList(List<String> numeroTelefonoList) {
        this.numeroTelefonoList = numeroTelefonoList;


    }
}
