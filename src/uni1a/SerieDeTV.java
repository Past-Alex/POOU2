package uni1a;
import java.util.ArrayList; 
import java.util.List;    
public class SerieDeTV extends ContenidoAudiovisual {
   
    private List<Temporada> listaTemporadas; 
    
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.listaTemporadas = new ArrayList<>(); 
    }
    
    public void agregarTemporada(Temporada temporada) {
        if (temporada != null) {
            this.listaTemporadas.add(temporada);
        }
    }
    
    public List<Temporada> getListaTemporadas() {
        return listaTemporadas;
    }
   
    public int getNumeroTotalTemporadas() {
        return listaTemporadas.size();
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("--- Detalles de la Serie de TV ---");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Número Total de Temporadas: " + getNumeroTotalTemporadas());
        System.out.println("Detalles de las Temporadas:");
        if (listaTemporadas.isEmpty()) {
            System.out.println("  No hay temporadas registradas para esta serie.");
        } else {
            for (Temporada temp : listaTemporadas) {
                System.out.println("  - " + temp.toString()); 
            }
        }
        System.out.println();
    }
}
