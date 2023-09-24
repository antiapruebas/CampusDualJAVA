package com.campusdual;

public class  Sandbox {

    public  int actualFuel = 10;
    public static String fuelLabel="Gasolina";

    public int getActualFuel(){
        return this.actualFuel;
    }
    public  String getFuelLabel(){
        return this.fuelLabel;
    }

    public void setFuelLabel(String fuelLabel){
        this.fuelLabel = fuelLabel;
    }

    public void showDetails(){
        System.out.println("Tengo " + this.getActualFuel() + " l. de " + this.getFuelLabel().toLowerCase());
    }

    public static void main(String[] args) {
        Sandbox s = new Sandbox();
        Sandbox s1 = new Sandbox();
        s.showDetails();
        s1.showDetails();
        s.setFuelLabel("diésel");
        s.showDetails();
        s1.showDetails();

    }
}
