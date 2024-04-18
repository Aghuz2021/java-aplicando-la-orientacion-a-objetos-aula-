package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear canción
        Cancion miCancion = Cancion.crearCancionDesdeEntrada(scanner);
        Podcast mipodcast = Podcast.crearPodcastDesdeEntrada(scanner);

    }


    private static void simularInteracciones(Cancion cancion, Podcast podcast) {
        // Simular interacciones con canciones y podcasts
        simularInteraccionesConCancion(cancion);
        simularInteraccionesConPodcast(podcast);
    }

    private static void simularInteraccionesConCancion(Cancion cancion) {
        for (int i = 0; i < 100; i++) {
            cancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            cancion.reproduce();
        }
    }

    private static void simularInteraccionesConPodcast(Podcast podcast) {
        for (int i = 0; i < 100; i++) {
            podcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            podcast.reproduce();
        }
    }

    private static void mostrarEstadisticas(Cancion cancion) {
        // Mostrar estadísticas de reproducción y favoritos
        System.out.println("Total reproducciones de la canción: " + cancion.getTotalDeReproducciones());
        System.out.println("Total de Me Gusta de la canción: " + cancion.getTotalDeMeGusta());
    }
}