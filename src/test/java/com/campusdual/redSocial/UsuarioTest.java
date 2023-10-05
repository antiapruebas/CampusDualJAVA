package com.campusdual.redSocial;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    @DisplayName("Comprobar que publicamos post")
    void postPublicado() {
        Usuario antia = new Usuario("Antía");
        Post post1 = new Text("Primer post", Utils.obtenerFechaActual(), "Antía", "¿Qué tal vais?");
        antia.addPost2(post1);
        assertEquals(1, antia.getPostList().size());
        assertEquals(post1, antia.getPostList().get(0));

    }

    @Test
    @DisplayName("Prueba añadir usuario")
    void addUsuarioTest(){
        Usuario antia = new Usuario("Antia");
        Usuario.add(antia);
        assertEquals(1, DevNet.userList.size());
        assertEquals("Antia",DevNet.userList.get(0));
    }
}
