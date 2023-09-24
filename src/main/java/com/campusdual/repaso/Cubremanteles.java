package com.campusdual.repaso;

public class Cubremanteles {

    public Material resource;

    public Cubremanteles(Material resource) {
        this.resource = resource;
    }

    public Material getResource() {
        return this.resource;
    }

    public void setResource(Material resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return this.getResource().toString();
    }
}
