package com.campusdual.Red_Social;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Usuario {
    protected String userName;
    protected List<String> followList = new ArrayList<>();
    protected static List<Post> postList = new ArrayList<>();

    public Usuario(String name) {
        this.userName = name;
    }

    public Usuario(String name, List<String> followList, List<Post> postList) {
        this.userName = name;
        this.followList = followList;
        this.postList = postList;
    }

    public static void add(Usuario nuevoUsuario) {
        String nuevoUsuarioName = nuevoUsuario.getName();
        if (!DevNet.userList.contains(nuevoUsuarioName)) {
            DevNet.userList.add(nuevoUsuarioName);
            System.out.println("Usuario " + nuevoUsuarioName + " agregado con éxito.");
        } else {
            System.out.println("Este usuario ya existe.");
        }
    }

    public static void add2(Usuario nuevoUsuario) {
        String nuevoUsuarioName = nuevoUsuario.getName();
        if (!DevNet.userList.contains(nuevoUsuarioName)) {
            DevNet.userList.add(nuevoUsuarioName);
        }
    }

    public static void remove(Usuario usuario) {
        String nombreUsuario = usuario.getName();

        if (DevNet.userList.contains(nombreUsuario)) {
            DevNet.userList.remove(nombreUsuario);
            System.out.println("Usuario " + nombreUsuario + " eliminado");
        } else {
            System.out.println("El usuario no está registrado");
        }
    }



    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public List<String> getFollowList() {
        return followList;
    }

    public void setFollowList(List<String> followList) {
        this.followList = followList;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        Usuario.postList = postList;
    }

    //Metodos
    public static void addPost(Post post) {
        postList.add(post);
        System.out.println("Post publicado xd");
    }

    public static void usuariosEjemplo(){

        Usuario.add2(new Usuario ("Antía"));
        Usuario.add2(new Usuario ("Nestor"));
        Usuario.add2(new Usuario ("Jose"));
        Usuario.add2(new Usuario ("Pedro"));
        Usuario.add2(new Usuario ("María"));
        Usuario.add2(new Usuario ("Pepe"));



    }
}
