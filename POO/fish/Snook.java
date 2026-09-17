package fish;

public class Snook extends Fish {
    // Atributos
    private double habitatDepth;

    // Constructor
    public Snook(String race, double weight, double length, double habitatDepth) {
        super(race, weight, length);
        if (habitatDepth <= 0) throw new IllegalArgumentException("Profundidad de habitat no valida: La profundidad del habitat del robalo NO puede ser menor o igual a 0.");
        this.habitatDepth = habitatDepth;
    }

    // Metodos
    @Override
    public void info() {
        ConsoleColors.message("INFORMACION DEL ROBALO", ConsoleColors.LIGHT_GRAY);
        ConsoleColors.message("Raza: " + getRace() + " | Peso: " + getWeight() + " (Kg) | Longitud: " + getLength() + " (Cm) | Profundidad de su Habitat: " + habitatDepth + " (Metros)", ConsoleColors.LIGHT_GRAY);
    }

    @Override
    public void sound() {
        ConsoleColors.message("¡Splash Splash!", ConsoleColors.LIGHT_GRAY);
    }
}
