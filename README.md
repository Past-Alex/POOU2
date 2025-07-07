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
  ## 📦 Cómo Clonar y Ejecutar el Proyecto

Sigue estos pasos para obtener una copia local del proyecto y ejecutarlo en tu máquina:

1.  **Clonar el Repositorio:**
    ```bash
    git clone [https://github.com/PastFlex1/POO.git](https://github.com/PastFlex1/POO.git)
    cd POO
    ```

2.  **Importar en Eclipse (o tu IDE de Java preferido):**
    * Abre Eclipse.
    * Ve a `File > Import...`.
    * Selecciona `General > Existing Projects into Workspace` y haz clic en `Next`.
    * Haz clic en `Browse...` y selecciona la carpeta `POO` que clonaste.
    * Asegúrate de que el proyecto (`poo_unidad1` o similar, si se importó con ese nombre en tu informe) se detecte. Si no, puedes importar desde Git y luego configurarlo como proyecto Java.
    * Si no se reconoce como proyecto Java automáticamente: Haz clic derecho en el proyecto en el "Package Explorer" > `Configure` > `Convert to Java Project`.

3.  **Ejecutar el Programa:**
    * Navega hasta la clase `PruebaAudioVisual.java` dentro del paquete `poo`.
    * Haz clic derecho sobre `PruebaAudioVisual.java` y selecciona `Run As > Java Application`.
    * La salida del programa se mostrará en la consola de Eclipse.

## 📊 Diagrama de Clases UML

Un diagrama de clases visualiza la estructura de las clases y sus relaciones (herencia, asociación, composición)

## 🤝 Contribuciones

Si deseas contribuir a este proyecto (por ejemplo, añadiendo más tipos de contenido, mejorando la lógica, etc.), por favor sigue el flujo de trabajo estándar de GitHub:

1.  Haz un "fork" de este repositorio.
2.  Crea una nueva rama (`git checkout -b feature/nueva-caracteristica`).
3.  Realiza tus cambios y haz commits significativos.
4.  Haz "push" a tu rama (`git push origin feature/nueva-caracteristica`).
5.  Abre una "Pull Request" describiendo tus cambios.

##Alex Palma - Desarrollo de Software
