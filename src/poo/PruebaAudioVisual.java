package poo;

import uni1a.*; // Importa todas las clases del paquete uni1a
import java.util.ArrayList; // Necesario para List
import java.util.List;     // Necesario para List

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("--- Inicio del Sistema de Gestión de Contenido Audiovisual ---");
        System.out.println();

        // 1. Crear instancias de Pelicula y asociar Actores
        System.out.println("--- Creando Películas y asignando Actores ---");
        Pelicula peli1 = new Pelicula("El Origen", 148, "Ciencia Ficción", "Warner Bros. Pictures");
        Actor actor1 = new Actor("Leonardo DiCaprio", "11-11-1974", "Estadounidense");
        Actor actor2 = new Actor("Joseph Gordon-Levitt", "17-02-1981", "Estadounidense");
        peli1.agregarActor(actor1);
        peli1.agregarActor(actor2);

        Pelicula peli2 = new Pelicula("Parasitos", 132, "Comedia Negra/Thriller", "CJ Entertainment");
        Actor actor3 = new Actor("Song Kang-ho", "25-01-1967", "Surcoreano");
        Actor actor4 = new Actor("Choi Woo-shik", "26-03-1990", "Surcoreano");
        peli2.agregarActor(actor3);
        peli2.agregarActor(actor4);
        System.out.println("Películas creadas y actores asignados.");
        System.out.println();

        // 2. Crear instancias de SerieDeTV y asociar Temporadas
        System.out.println("--- Creando Series de TV y asignando Temporadas ---");
        SerieDeTV serie1 = new SerieDeTV("The Crown", 60, "Drama Histórico");
        Temporada temp1 = new Temporada(1, 10, 2016);
        Temporada temp2 = new Temporada(2, 10, 2017);
        Temporada temp3 = new Temporada(3, 10, 2019);
        serie1.agregarTemporada(temp1);
        serie1.agregarTemporada(temp2);
        serie1.agregarTemporada(temp3);

        SerieDeTV serie2 = new SerieDeTV("Dark", 60, "Ciencia Ficción/Misterio");
        Temporada temp4 = new Temporada(1, 10, 2017);
        Temporada temp5 = new Temporada(2, 8, 2019);
        serie2.agregarTemporada(temp4);
        serie2.agregarTemporada(temp5);
        System.out.println("Series de TV creadas y temporadas asignadas.");
        System.out.println();

        // 3. Crear instancias de Documental y asociar Investigadores
        System.out.println("--- Creando Documentales y asignando Investigadores ---");
        Documental doc1 = new Documental("My Octopus Teacher", 85, "Naturaleza", "Netflix");
        Investigador inv1 = new Investigador("Craig Foster", "Biología Marina", "Sea Change Project");
        Investigador inv2 = new Investigador("Pippa Ehrlich", "Realización Documental", "Freelance");
        doc1.agregarInvestigador(inv1);
        doc1.agregarInvestigador(inv2);
        System.out.println("Documentales creados y investigadores asignados.");
        System.out.println();

        // 4. Crear instancias de VideoYouTube y Cortometraje
        System.out.println("--- Creando Videos de YouTube y Cortometrajes ---");
        VideoYouTube youtubeVideo = new VideoYouTube("Grandes Civilizaciones Antiguas: El Legado de Roma", 30, "Historia", "Historia Viva", "https://www.youtube.com/watch?v=ejemplo123");
        youtubeVideo.reproducir();
        youtubeVideo.darMeGusta();
        youtubeVideo.comentar("¡Muy interesante, aprendí mucho!");
        youtubeVideo.reproducir(); // Otra reproducción

        Cortometraje corto1 = new Cortometraje("El Susurro del Viento", 12, "Fantasía", "Festival de Cortos de Berlín");
        corto1.participarEnFestival("Festival de Cine de Sitges");
        corto1.anunciarPremio(); // Gana un premio
        System.out.println("Videos de YouTube y Cortometrajes creados y probados.");
        System.out.println();


        // 5. Mostrar detalles de todos los contenidos audiovisuales creados
        System.out.println("--- Mostrando Detalles de Todos los Contenidos ---");
        List<ContenidoAudiovisual> todosLosContenidos = new ArrayList<>();
        todosLosContenidos.add(peli1);
        todosLosContenidos.add(peli2);
        todosLosContenidos.add(serie1);
        todosLosContenidos.add(serie2);
        todosLosContenidos.add(doc1);
        todosLosContenidos.add(youtubeVideo);
        todosLosContenidos.add(corto1);

        for (ContenidoAudiovisual contenido : todosLosContenidos) {
            contenido.mostrarDetalles(); // Demostración de polimorfismo
        }

        System.out.println("--- Fin del Sistema ---");
    }
}
