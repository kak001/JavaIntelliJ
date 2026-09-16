package Fish;

public abstract class Fish {
    // Atributos
    private String race;
    private double weight;
    private double length;

    // Constructor
    public Fish(String race, double weight, double length) {
        this.race = race;
        this.weight = weight;
        this.length = length;
    }

    // Getters
    public String getRace() {
        return race;
    }

    public double getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    // Setters
    public void setRace(String race) {
        this.race = race;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Metodos
    public abstract void info();

    public abstract void sound();

    // Mensaje a Color
    public void message(String message, String consoleColors) {
        System.out.println(consoleColors + message + RESET);
    }

    // Colores
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String ORANGE = "\u001B[38;2;255;165;0m";
    public static final String LIGHT_GRAY = "\u001B[37m";
    public static final String RESET = "\u001B[0m";
}
