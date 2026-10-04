package fish;

public class Salmon extends Fish {
    // Atributos
    private String riverSource;

    // Constructor
    public Salmon(String race, double weight, double length, String riverSource) {
        super(race, weight, length);
        if (riverSource == null) throw new NullPointerException("Origen de rio no valido: El origen del rio no puede ser nulo.");
        if (riverSource.isEmpty() || riverSource.matches(".*\\d.*")) throw new IllegalArgumentException("Origen del rio no valido: El origen del rio del salmon NO puede estar vacío o contener números.");
        this.riverSource = riverSource;
    }

    // Metodos
    @Override
    public void info() {
        ConsoleColors.message("INFORMACION DEL SALMON", ConsoleColors.ORANGE);
        ConsoleColors.message("Raza: " + getRace() + " | Peso: " + getWeight() + " (Kg) | Longitud: " + getLength() + " (Cm) | Rio de Origen: " + riverSource, ConsoleColors.ORANGE);
    }

    @Override
    public void sound() {
        ConsoleColors.message("¡Blub Blub!", ConsoleColors.ORANGE);
    }
}
