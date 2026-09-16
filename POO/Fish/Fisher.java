package Fish;

import java.util.ArrayList;
import java.util.Random;

public class Fisher {
    // Atributos
    private String name;
    private int age;
    private String nationality;
    private Random prob;
    private ArrayList<Fish> fishList;

    // Constructor
    public Fisher(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.prob = new Random();
        this.fishList = new ArrayList<Fish>();
    }

    // Metodos
    public void fisherInfo() {
        message("INFORMACION DEL PESCADOR", BRIGHT_WHITE);
        message("Nombre: " + name + " | Edad: " + age + " años | Nacionalidad: " + nationality, BRIGHT_WHITE);
    }

    public void fishing(Fish fish) {
        if (prob.nextInt(100) <= 55) {
            message("¡Oh no, el pescado " + fish.getRace() + " se ha escapado!", RED);
        } else {
            fishList.add(fish);
            message("¡El pescador " + name + " ha pescado un " + fish.getRace() + "!", GREEN);
        }
    }

    public void showFish() {
        if (fishList.isEmpty()) {
            message("No hay peces pescados.", RED);
        } else {
            int index = 0;
            message("PECES CAPTURADOS", BRIGHT_PINK);
            for (Fish fish:fishList) {
                index ++;
                message("Pez N°" + index + " | Nombre: " + fish.getRace(), BRIGHT_PINK);
            }
        }
    }

    // Mensaje a Color
    public void message(String message, String consoleColors) {
        System.out.println(consoleColors + message + RESET);
    }

    // Colores
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BRIGHT_PINK = "\u001B[95m";
    public static final String BRIGHT_WHITE = "\u001B[97m";
    public static final String RESET = "\u001B[0m";
}
