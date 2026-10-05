package animals;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        // === Test ===
        System.out.println("Hello Java!");
        System.out.println();

        // === Variables ===
        Animal animal = null;
        Cat cat = null;
        Fish fish = null;
        ArrayList<Animal> animals;

        // === try-catch ===
        try {
            animals = new ArrayList<Animal>(Arrays.asList(
                    animal = new Animal("Max", 5, 12.1),
                    cat = new Cat("Arenita", 6, 4.5, "Amarilla, blanca y Negra (calico)"),
                    fish = new Fish("Panxo", 1, 0.2, true)
            ));

            System.out.println("=== INFORMATION DE LOS ANIMALES ===");
            int i = 0;
            for (Animal a : animals) {
                i++;
                System.out.println("Animal " + i + ": " + a.toString());
            }
            System.out.println();

            int j = 0;
            System.out.println("=== SONIDO DE LOS ANIMALES ===");
            j++;
            for (Animal a : animals) {
                j++;
                System.out.println("Animal " + j + ": " + a.sound());
            }
            System.out.println();
        } catch(NullPointerException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch(Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            System.out.println("Fin del programa.");
        }
    }
}
