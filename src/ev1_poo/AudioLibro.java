package ev1_poo;

public class AudioLibro extends Material {
    // Atributo
    private int duracionMinutos;
    private double costoPrestamo;

    // Constructor
    public  AudioLibro(String titulo, int anioPublicacion, int copiasDisponibles, int duracionMinutos) {
        super(titulo, anioPublicacion, copiasDisponibles);
        if (duracionMinutos <= 0) throw new IllegalArgumentException("La duración es negativa o igual a cero.");
        if (duracionMinutos > 300) {
            this.costoPrestamo = 2800 * 1.15;
        } else {
            this.costoPrestamo = 2800;
        }
        this.duracionMinutos = duracionMinutos;
    }

    // Getter
    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    // Setter
    public void setDuracionMinutos(int duracionMinutos) {
        if (duracionMinutos <= 0) throw new IllegalArgumentException("La duración es negativa o igual a cero.");
        this.duracionMinutos = duracionMinutos;
    }

    // Métodos
    @Override
    public String toString() {
        return "Titulo: " + getTitulo() + " | Año de Publicacion: " + getAnioPublicacion() + " | Copias Disponibles: : " + getCopiasDisponibles() + " | Duracion: " + duracionMinutos + " minutos.";
    }
}
