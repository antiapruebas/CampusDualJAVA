package com.campusdual.repaso;

import java.util.Random;
import java.util.UUID;

public class CafeteraItaliana implements IMaquina, ICafetera {
    private boolean turnOn;

    @Override
    public void on() {
        this.setTurnOn(true);
    }

    @Override
    public int off() {
       return new Random().nextInt(81) + 20; //da un numero aleatorio entre 20 y 100

    }

    @Override
    public UUID maintenance(double hours) {

        this.setExpectedMantenaince(hours);
        return UUID.randomUUID();
    }

    @Override
    public void hacerCafe() {
        System.out.println("1.- Calienta el cafe de la parte de abajo\n2.- El vapor atraviesa el café y sube por el hueco central\n3.-El café infusionado sale del hueco calentito listo para tomar");

    }

    private double expectedMantenaince = 0.0;

    public double getExpectedMantenaince() {
        return this.expectedMantenaince;
    }

    public void setExpectedMantenaince(Double expectedMantenaince) {
        this.expectedMantenaince = expectedMantenaince;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public boolean isTurnOn() {
        return turnOn;
    }
}
