package com.campusdual.repaso;

public class Mesa {

    // Atributos

    public static final String TIPO_DE_MUEBLE = "Mesa";
    public double height;
    public double width;
    public double length;
    public int n_legs;
    public Material resource;


    //Construtores


    public Mesa(double height, double width, double length, int n_legs, Material resource) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.n_legs = n_legs;
        this.resource = resource;
    }

    // Getters

    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }

    public int getN_legs() {
        return n_legs;
    }

    public Material getResource() {
        return resource;
    }

    // Setters

    public void setHeight(double height) {
        this.height = height;
       }


    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public void setN_legs(int n_legs) {
        this.n_legs = n_legs;
    }

    public void setResource(Material resource) {
        this.resource = resource;
    }

    // Métodos

    @Override
    public String toString() {
        return "Mesa de " + getResource() + " que mide  " + getHeight() + "cm de alto, " + getWidth() + "cm de ancho," + getLength() + "cm de largo, y que tiene " + getN_legs() + " patas";
    };


    public double area() {
        return this.height * this.width;
    }

    //Cambiar los atributos del material
    public void setColor(String color) {
        this.getResource().setColor(color);
    }
    public void setResource(String resource) {
        this.getResource().setResource(resource);
    }


}