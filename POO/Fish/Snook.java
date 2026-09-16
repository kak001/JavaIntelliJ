package Fish;

public class Snook extends Fish {
    // Atributos
    private double habitatDepth;

    // Constructor
    public Snook(String race, double weight, double length, double habitatDepth) {
        super(race, weight, length);
        this.habitatDepth = habitatDepth;
    }

    // Metodos
    @Override
    public void info() {
        message("INFORMACION DEL ROBALO", LIGHT_GRAY);
        message("Raza: " + getRace() + " | Peso: " + getWeight() + " (Kg) | Longitud: " + getLength() + " (Cm) | Profundidad de su Habitat: " + habitatDepth + " (Metros)", LIGHT_GRAY);
    }

    @Override
    public void sound() {
        message("¡Splash Splash!", LIGHT_GRAY);
    }
}
