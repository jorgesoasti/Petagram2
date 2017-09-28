package com.jorgesoasti.petagram2;

/**
 * Created by jorge.soasti on 28/09/2017.
 */

public class Mascota {

    private int foto;
    private String Nombre;
    private int likes;

    public Mascota(int foto, String nombre, int likes) {
        this.foto = foto;
        Nombre = nombre;
        this.likes = likes;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
