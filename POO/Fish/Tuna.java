package Fish;

public class Tuna extends Fish {
    // Atributos
    private double swimmingSpeed;

    // Constructor
    public Tuna(String race, double weight, double length, double swimmingSpeed) {
        super(race, weight, length);
        this.swimmingSpeed = swimmingSpeed;
    }

    // Metodos
    @Override
    public void info() {
        message("INFORMACION DEL ATUN", BLUE);
        message("Raza: " + getRace() + " | Peso: " + getWeight() + " (Kg) | Longitud: " + getLength() + " (Cm) | Velocidad de Nado: " + swimmingSpeed + " (m/s)", BLUE);
    }

    @Override
    public void sound() {
        message("¡Glub Glub!", BLUE);
    }
}
