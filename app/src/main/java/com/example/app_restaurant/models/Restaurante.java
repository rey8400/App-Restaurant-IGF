package com.example.app_restaurant.models;

import java.io.Serializable;

public class Restaurante implements Serializable {
    private String id_restaurante;
    private String nombre;
    private String descripcion;
    private String departamento;
    private String imagen;
    public Coordenada coordenadas;
    private String ubicacion;

    public Restaurante(){

    }

    public Restaurante(String id_restaurante, String nombre, String descripcion, String departamento, String imagen, Coordenada coordenadas, String ubicacion, int likes, String id_Usu) {
        this.id_restaurante = id_restaurante;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.departamento = departamento;
        this.imagen = imagen;
        this.coordenadas = coordenadas;
        this.ubicacion = ubicacion;
        this.likes = likes;
        this.id_Usu = id_Usu;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    private int likes;
    private String id_Usu; //id del usuario

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getId_restaurante() {
        return id_restaurante;
    }

    public void setId_restaurante(String id_restaurante) {
        this.id_restaurante = id_restaurante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }


    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getId_Usu() {
        return id_Usu;
    }

    public void setId_Usu(String id_Usu) {
        this.id_Usu = id_Usu;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "id_restaurante='" + id_restaurante + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", departamento='" + departamento + '\'' +
                ", imagen='" + imagen + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", likes=" + likes +
                ", id_Usu='" + id_Usu + '\'' +
                '}';
    }
}
