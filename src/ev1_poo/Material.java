package ev1_poo;

public abstract class Material {
    // Atributos
    private String titulo;
    private int anioPublicacion;
    private int copiasDisponibles;


    // Constructor
    public Material(String titulo, int anioPublicacion, int copiasDisponibles) {
        if (titulo == null ||titulo.isEmpty()) throw new IllegalArgumentException("El titulo esta nulo o vacio.");
        if (anioPublicacion < 1450 || anioPublicacion > 2026) throw new IllegalArgumentException("Año de publicación fuera del rango (1450 - 2026).");
        if (copiasDisponibles <= 0) throw new IllegalArgumentException("Las copias disponibles son negativas o iguales a cero.");
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.copiasDisponibles = copiasDisponibles;
    }

    // Getters
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public String getTitulo() {
        return titulo;
    }

    // Setters
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion < 1450 || anioPublicacion > 2026) throw new IllegalArgumentException("Año de publicación fuera del rango (1450 - 2026).");
        this.anioPublicacion = anioPublicacion;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        if (copiasDisponibles < 0) throw new IllegalArgumentException("Las copias disponibles son negativas.");
        this.copiasDisponibles = copiasDisponibles;
    }

    public void setTitulo(String titulo) {
        if (titulo == null ||titulo.isEmpty()) throw new IllegalArgumentException("El titulo esta nulo o vacio.");
        this.titulo = titulo;
    }

    // Método
    @Override
    public String toString() {
        return super.toString();
    }
}
