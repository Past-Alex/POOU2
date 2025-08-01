package uni1a;

public class Temporada {
    private int numeroTemporada;
    private int cantidadEpisodios;
    private int anioLanzamiento;

    public Temporada(int numeroTemporada, int cantidadEpisodios, int anioLanzamiento) {
        this.numeroTemporada = numeroTemporada;
        this.cantidadEpisodios = cantidadEpisodios;
        this.anioLanzamiento = anioLanzamiento;
    }


    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }


    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    @Override
    public String toString() {
        return "Temporada " + numeroTemporada + " (" + cantidadEpisodios + " episodios, " + anioLanzamiento + ")";
    }
}
