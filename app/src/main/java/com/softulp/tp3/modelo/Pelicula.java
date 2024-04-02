package com.softulp.tp3.modelo;

import java.io.Serializable;

public class Pelicula implements Serializable {
    private int imagen;
    private String resenia;
    private String titulo;
    private String actoresPrincipales;
    private String director;


    public Pelicula(int imagen, String resenia, String titulo,String actoresPrincipales, String director) {
        this.imagen = imagen;
        this.resenia = resenia;
        this.titulo = titulo;
        this.actoresPrincipales=actoresPrincipales;
        this.director=director;
    }

    public String getActoresPrincipales() {
        return actoresPrincipales;
    }

    public void setActoresPrincipales(String actoresPrincipales) {
        this.actoresPrincipales = actoresPrincipales;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getResenia() {
        return resenia;
    }

    public void setResenia(String resenia) {
        this.resenia = resenia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
