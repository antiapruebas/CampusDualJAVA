package com.campusdual.repaso;

import java.util.UUID;

public interface IMaquina {

    public final  String greetingsBisbal = "Cómo están los máquinas?, Lo primero de todo";

    /**
     * Encender la máquina
     */
    public void on();

    /**
     * Método para apagar la máquina
     */
    public int off();

    public UUID maintenance (double hours);


}
