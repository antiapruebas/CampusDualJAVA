package com.campusdual.redSocial;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {

    @Test
    @DisplayName("Comprobamos si se publica comentario en un post determinado")
    void comentarioPublicadoTest() {
        Usuario antia = new Usuario("Antía");
        Comentarios comentario1 = new Comentarios(antia.getName(), Utils.obtenerFechaActual(), "Yo también quiero.");
        Post post2 = new Text("La merienda", Utils.obtenerFechaActual(), "Nestor", "Traeme un sandwich");
        int index = post2.getCommentsList().size();
        post2.addComentario(comentario1);
        assertEquals(index +1, post2.getCommentsList().size());
        assertEquals(comentario1, post2.getCommentsList().get(0));
        index = post2.getCommentsList().size();
        post2.addComentario(comentario1);
        assertEquals(index +1, post2.getCommentsList().size());
        assertEquals(comentario1, post2.getCommentsList().get(0));
        index = post2.getCommentsList().size();
        post2.addComentario(comentario1);
        assertEquals(index +1, post2.getCommentsList().size());
        assertEquals(comentario1, post2.getCommentsList().get(0));

    }


}



