package fish;

public class Tuna extends Fish {
    // Atributos
    private double swimmingSpeed;

    // Constructor
    public Tuna(String race, double weight, double length, double swimmingSpeed) {
        super(race, weight, length);
        if (swimmingSpeed <= 0) throw new IllegalArgumentException("Velocidad de nado no valida: La velocidad de nado del atun NO puede ser menor o igual a 0.");
        this.swimmingSpeed = swimmingSpeed;
    }

    // Metodos
    @Override
    public void info() {
        ConsoleColors.message("INFORMACION DEL ATUN", ConsoleColors.BLUE);
        ConsoleColors.message("Raza: " + getRace() + " | Peso: " + getWeight() + " (Kg) | Longitud: " + getLength() + " (Cm) | Velocidad de Nado: " + swimmingSpeed + " (m/s)", ConsoleColors.BLUE);
    }

    @Override
    public void sound() {
        ConsoleColors.message("¡Glub Glub!", ConsoleColors.BLUE);
    }
}
