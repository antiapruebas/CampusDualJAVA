package com.campusdual.Red_Social;

import com.campusdual.Red_Social.Utils;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import static java.lang.System.exit;

public class DevNet {
    protected static List<String> userList = new ArrayList<>();
    private String username;

    public static void main(String[] args) {
        DevNet devNet = new DevNet();
        Usuario.usuariosEjemplo();
        devNet.home();
        //devNet.createPost();
    }

    protected void agregarUsuario(){
        String name = Utils.string("Ingrese el nombre del usuario a registrar: ");
        Usuario nuevoUsuario = new Usuario(name);
        Usuario.add(nuevoUsuario);
    }
    protected void borrarUsuario(){
        String name = Utils.string("Indica el nombre del usuario a borrar: ");
        Usuario borrarUsuario = new Usuario(name);
        Usuario.remove(borrarUsuario);
    }
    public void createPost() {

        System.out.println("Elige el tipo de post que vas a publicar:");
        System.out.println("1. Imagen");
        System.out.println("2. Video");
        System.out.println("3. Texto");

        int option = Utils.integer("Seleccione una opción: ");

        String titulo;
        String fecha = Utils.obtenerFechaActual();

        switch (option) {
            case 1:
                titulo = Utils.string("Ingrese el título de la imagen: ");
                double altura = Utils.real("Ingrese la altura de la imagen: ");
                double ancho = Utils.real("Ingrese el ancho de la imagen: ");
                Image image = new Image(titulo, fecha, username, altura, ancho );
                Usuario.addPost(image);
                break;
            case 2:
                titulo = Utils.string("Ingrese el título del video: ");
                String calidad = Utils.string("Ingrese la calidad del video: ");
                String duracion = Utils.string("Ingrese la duración del video: ");
                Video video = new Video(titulo, fecha, username, calidad, duracion);
                Usuario.addPost(video);
                break;
            case 3:
                titulo = Utils.string("Ingrese el título del texto: ");
                String texto = Utils.string("Ingrese el contenido del texto: ");
                Text textoPost = new Text(titulo, fecha, username, texto);
                Usuario.addPost(textoPost);
                break;
            default:
                System.out.println("Eso no se puede publicar. Fuera!!");
                break;
        }
    }
    public void home(){
            System.out.println("Bienvenido a DevNet");
            System.out.println("1. Registro");
            System.out.println("2. Login");
            System.out.println("3. Cerrar");
            int option = Utils.integer("Seleccione una opción: ");;
            switch (option) {
                case 1:
                    username = Utils.string("¿Cual sera tu usuario?");
                    if (!DevNet.userList.contains(username)) {
                        DevNet.userList.add(username);
                        System.out.println("Usuario " + username + " agregado con éxito.");
                        perfil();
                    } else {
                        System.out.println("Este usuario ya existe.");
                        this.home();
                    };
                break;
                case 2:
                        this.username = Utils.string("¿Cual es tu usuario?");
                        if(DevNet.userList.contains(this.username)){
                            System.out.println("Inicio de sesión correcto");
                            perfil();
                        } else {
                            System.out.println("No existe el usuario. Inténtelo de nuevo");
                            this.home();
                        }
                break;
                case 3:
                    exit(0);
                break;
                default:
                    System.out.println("No es una opción");
                break;
            }}

     public void perfil ()     {
            System.out.println("Ya estás en tu perfil");
            System.out.println("1. Posts");
            System.out.println("2. Amigos");
            System.out.println("3. Muro");
            int option = Utils.integer("Seleccione una opción: ");
            switch (option) {
                case 1:
                    System.out.println("Esto es el menú de post que aún no hicimos");

                    break;
                case 2:
                    System.out.println("Esto es el menú de Amigos que aún no hicimos");
                    break;
                case 3:
                    System.out.println("Esto es Muro  que no vamos a hacer ");
                default:
                    perfil();

        }

    }
}
