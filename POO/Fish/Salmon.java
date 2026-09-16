package Fish;

public class Salmon extends Fish {
    // Atributos
    private String riverSource;

    // Constructor
    public Salmon(String race, double weight, double length, String riverSource) {
        super(race, weight, length);
        this.riverSource = riverSource;
    }

    // Metodos
    @Override
    public void info() {
        message("INFORMACION DEL SALMON", ORANGE);
        message("Raza: " + getRace() + " | Peso: " + getWeight() + " (Kg) | Longitud: " + getLength() + " (Cm) | Rio de Origen: " + riverSource, ORANGE);
    }

    @Override
    public void sound() {
        message("¡Blub Blub!", ORANGE);
    }
}
