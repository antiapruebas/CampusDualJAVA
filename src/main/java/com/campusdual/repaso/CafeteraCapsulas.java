package com.campusdual.repaso;

import java.util.Random;
import java.util.UUID;

public class CafeteraCapsulas implements IMaquina, ICafetera {

    private boolean turnOn;
    private double expectedMantenaince = 0.0;

    public double getExpectedMantenaince() {
        return this.expectedMantenaince;
    }

    public void setExpectedMantenaince(Double expectedMantenaince) {
        this.expectedMantenaince = expectedMantenaince;
    }

    private boolean isTurnOn() {
        return this.turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }


    @Override
    public void on() {
        this.setTurnOn(true);
    }

    @Override
    public int off() {
        this.setTurnOn(false);
        return new Random().nextInt(81) + 20; //da un numero aleatorio entre 20 y 100
    }

    @Override
    public UUID maintenance(double hours) {

        this.setTurnOn(false);
        this.setExpectedMantenaince(hours);
        return UUID.randomUUID();
    }

    @Override
    public void hacerCafe() {
        System.out.println("1.- Calienta el agua del tanque\n2.-Baja la aguja\n3.Perfora la capsula\n4.- Intoduce el agua a presión\n5.-Deja caer el café en la taza");
    }
}
