package com.campusdual.repaso;

public class Sandbox {

    public static void main(String[] args) {



    String mat = "madera";
    Material material1 = new Material("rojo", mat);

    Mesa mesa1 = new Mesa(1.5, 1.8,8.6, 4, new Material("gris","acero") );
    Mesa mesa2 = new Mesa(1.5, 1.8,8.6, 4, material1 );
    MesaComedor mesa3 = new MesaComedor(1.5, 1.8,8.6, 4, material1 );

        System.out.println(material1);
        System.out.println(mesa1);
        System.out.println(mesa2);
        System.out.println(mesa3);

    }
}