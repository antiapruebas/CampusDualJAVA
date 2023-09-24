package com.campusdual.repaso;

public class Material {


    //ATRIBUTOS

    public String color;
    public String resource;

    //CONSTRUCTOR

    public Material(String color, String resource) {
        this.color = color;
        this.resource = resource;
    }

    //MÉTODOS GETTERS AND SETTERS

    public String getColor() {
        return color;
    }

    public String getResource() {
        return resource;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    //MÉTODOS

    @Override
    public String toString() {
         return  this.getResource()+ " " +  this.getColor();
    }
}
