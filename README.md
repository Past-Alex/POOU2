# Sistema de Gestión de Contenido Audiovisual (POO Java)
Este proyecto es una demostración práctica de los principios de la Programación Orientada a Objetos (POO) en Java, aplicado al modelado y gestión de diferentes tipos de contenido audiovisual y sus relaciones. Implementa conceptos clave como herencia, asociación, composición y polimorfismo para crear un sistema modular y extensible.

## 🌟 Características Principales

* **Modelado Orientado a Objetos:** Estructura de clases bien definida para `ContenidoAudiovisual` (abstracta), `Pelicula`, `SerieDeTV`, `Documental`, `VideoYouTube` y `Cortometraje`.
* **Relaciones Complejas:** Implementación de asociaciones (ej. `Pelicula` con `Actor`, `Documental` con `Investigador`) y composición/agregación (ej. `SerieDeTV` con `Temporada`).
* **Herencia y Polimorfismo:** Extensión de la clase base `ContenidoAudiovisual` y sobrescritura de métodos para demostración del polimorfismo (ej. `mostrarDetalles()`).
* **Gestión de Entidades Relacionadas:** Manejo de colecciones de objetos (Listas de Actores, Temporadas, Investigadores) dentro de las clases principales.
* **Sistema Funcional:** Una clase de prueba (`PruebaAudioVisual.java`) que demuestra la creación, manipulación e interacción de todas las entidades del sistema.

## 🚀 Tecnologías Utilizadas

* **Lenguaje de Programación:** Java
* **Entorno de Desarrollo (IDE):** Eclipse IDE
* **Control de Versiones:** Git / GitHub

## 📁 Estructura del Proyecto

El proyecto está organizado en dos paquetes principales:

* `uni1a/`: Contiene todas las clases del modelo de dominio:
    * `ContenidoAudiovisual.java` (abstracta)
    * `Pelicula.java`
    * `SerieDeTV.java`
    * `Documental.java`
    * `VideoYouTube.java`
    * `Cortometraje.java`
    * `Actor.java`
    * `Temporada.java`
    * `Investigador.java`
* `poo/`: Contiene la clase principal para la ejecución y pruebas:
    * `PruebaAudioVisual.java`
