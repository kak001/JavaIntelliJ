package Football;

import java.util.Random;

public class Player {
    // Atributos
    private String name;
    private int precision;
    private Random probability;

    // Constructor
    public Player(String name, int precision) {
        this.name = name;
        this.precision = precision;
        this.probability = new Random();
    }

    // Getters
    public String getName() {
        return name;
    }

    public Random getProbability() {
        return probability;
    }

    public int getProbNumber() {
        return precision;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setProbability(Random probability) {
        this.probability = probability;
    }

    public void setProbNumber(int probNumber) {
        this.precision = probNumber;
    }

    // Metodos
    public void message(String message, String color) {
        System.out.println(color + message + RESET);
    }

    public void kick() throws ArithmeticException, NullPointerException, NumberFormatException {
        if (precision <= 0) {
            throw new ArithmeticException("Numero no valido.");
        } else if (name == null) {
            throw new NullPointerException("Nombre no valido.");
        } else if (name.matches(".*\\d.*")) {
            throw new NumberFormatException("Nombre no valido.");
        } else {
            if (probability.nextInt(precision) <= precision / 2) {
                message("¡Casi, " + name + " ha fallado el penal!", RED);
            } else {
                message("¡GOL DE " + name.toUpperCase() + "!", GREEN);
            }
        }
    }

    // Colores
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";
}
