package uni1a;
import java.util.ArrayList; 
import java.util.List;    
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private List<Actor> actores;
    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>(); 
    }
    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public void agregarActor(Actor actor) {
        if (actor != null) {
            this.actores.add(actor);
        }
    }

    public List<Actor> getActores() {
        return actores;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("--- Detalles de la Película ---");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println("Actores Principales:");
        if (actores.isEmpty()) {
            System.out.println("  No hay actores registrados para esta película.");
        } else {
            for (Actor actor : actores) {
                System.out.println("  - " + actor.getNombre() + " (" + actor.getNacionalidad() + ")");
            }
        }
        System.out.println();
    }
}