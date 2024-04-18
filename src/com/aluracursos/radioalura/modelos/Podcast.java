package com.aluracursos.radioalura.modelos;

import java.util.Scanner;

public class Podcast extends Audio {
    private String presentador;
    private String descripcion;

    public static Podcast crearPodcastDesdeEntrada(Scanner scanner) {
        System.out.println("Ingrese el título del podcast:");
        String tituloPodcast = scanner.nextLine();

        System.out.println("Ingrese el presentador del podcast:");
        String presentadorPodcast = scanner.nextLine();

        Podcast podcast = new Podcast();
        podcast.setTitulo(tituloPodcast);
        podcast.setPresentador(presentadorPodcast);
        return podcast;
    }
    @Override
    public int getClasificacion() {
        if (getTotalDeReproducciones() >= 2000){
            return 9;
        } else {
            return 2;
        }
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
