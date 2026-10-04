package fish;

import java.util.ArrayList;
import java.util.Random;

public class Fisher {
    // Atributos
    private String name;
    private int age;
    private String nationality;
    private final Random prob;
    private final ArrayList<Fish> fishList;

    // Constructor
    public Fisher(String name, int age, String nationality) {
        if (name == null) throw new NullPointerException("Nombre no valido: El nombre del pescador NO puede ser nulo.");
        if (name.isEmpty() || name.matches(".*\\d.*")) throw new IllegalArgumentException("Nombre no valido: El nombre del pescador NO puede estar vacío o contener números.");
        if (age <= 0) throw new IllegalArgumentException("Edad no valida: La edad del pescador NO puede ser menor o igual a 0.");
        if (nationality == null) throw new NullPointerException("Nacionalidad no valida: La nacionalidad del pescador NO puede ser nulo.");
        if (nationality.isEmpty() || nationality.matches(".*\\d.*")) throw new IllegalArgumentException("Nacionalidad no valida: La nacionalidad del pescador NO puede estar vacío o contener números.");

        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.prob = new Random();
        this.fishList = new ArrayList<Fish>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    // Setters
    public void setName(String name) {
        if (name == null) throw new NullPointerException("Nombre no valido: El nombre del pescador NO puede ser nulo.");
        if (name.isEmpty() || name.matches(".*\\d.*")) throw new IllegalArgumentException("Nombre no valido: El nombre del pescador NO puede estar vacío o contener números.");
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) throw new IllegalArgumentException("Edad no valida: La edad del pescador NO puede ser menor o igual a 0.");
        this.age = age;
    }

    public void setNationality(String nationality) {
        if (nationality == null) throw new NullPointerException("Nacionalidad no valida: La nacionalidad del pescador NO puede ser nula.");
        if (nationality.isEmpty() || nationality.matches(".*\\d.*")) throw new IllegalArgumentException("Nacionalidad no valida: La nacionalidad del pescador NO puede estar vacío o contener números.");
        this.nationality = nationality;
    }

    // Metodos
    public void fisherInfo() {
        ConsoleColors.message("INFORMACION DEL PESCADOR", ConsoleColors.BRIGHT_WHITE);
        ConsoleColors.message("Nombre: " + name + " | Edad: " + age + " años | Nacionalidad: " + nationality, ConsoleColors.BRIGHT_WHITE);
    }

    public void fishing(Fish fish) {
        if (prob.nextInt(100) <= 54) {
            ConsoleColors.message("¡Oh no, el pescado " + fish.getRace() + " se ha escapado!", ConsoleColors.RED);
        } else {
            fishList.add(fish);
            ConsoleColors.message("¡El pescador " + name + " ha pescado un " + fish.getRace() + "!", ConsoleColors.GREEN);
        }
    }

    public void showFish() {
        if (fishList.isEmpty()) {
            ConsoleColors.message("No hay peces pescados.", ConsoleColors.RED);
        } else {
            int index = 0;
            ConsoleColors.message("PECES CAPTURADOS", ConsoleColors.BRIGHT_PINK);
            for (Fish fish : fishList) {
                index++;
                ConsoleColors.message("Pez N°" + index + " | Nombre: " + fish.getRace(), ConsoleColors.BRIGHT_PINK);
            }
        }
    }
}
