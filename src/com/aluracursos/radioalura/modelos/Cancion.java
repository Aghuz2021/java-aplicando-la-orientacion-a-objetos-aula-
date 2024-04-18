package com.aluracursos.radioalura.modelos;

import java.util.Scanner;

public class Cancion extends Audio {
    private String album;
    private String cantante;
    private String genero;
    private String crearCancionDesdeEntrada;

    public static Cancion crearCancionDesdeEntrada(Scanner scanner) {
        System.out.println("Ingrese el título de la canción:");
        String titulo = scanner.nextLine();

        System.out.println("Ingrese el cantante de la canción:");
        String cantante = scanner.nextLine();

        Cancion cancion = new Cancion();
        cancion.setTitulo(titulo);
        cancion.setCantante(cantante);
        return cancion;
    }

    public String getCrearCancionDesdeEntrada() {
        return crearCancionDesdeEntrada;
    }

    public void setCrearCancionDesdeEntrada(String crearCancionDesdeEntrada) {
        this.crearCancionDesdeEntrada = crearCancionDesdeEntrada;
    }

    @Override
    public int getClasificacion() {
        if (getTotalDeMeGusta() > 5000){
            return 8;
        } else {
            return 4;
        }
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }



}

