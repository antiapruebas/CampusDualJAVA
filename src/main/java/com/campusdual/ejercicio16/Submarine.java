package com.campusdual.ejercicio16;

public class Submarine implements IMachine {
    protected int deep;

    public Submarine(int deep) {
        this.deep = deep;
    }

    @Override
    public void start() {
        System.out.println("El submarino se enciende");
    }

    @Override
    public void stop() {
        System.out.println("El submarino se apaga");
    }

    @Override
    public void maintenance() {
        System.out.println("El submarino realiza tareas de mantenimiento");
    }

    public void dive() {
        System.out.println("El submarino desciende a " + this.getDeep() + ".m de profundidad");
    }

    public int getDeep() {
        return this.deep;
    }

    public void setDeep(int deep) {
        this.deep = deep;
    }
}
