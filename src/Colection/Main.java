package Colection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Array
        Animal[] arrayAnimals = {
                new Dog("Max", 4, "Mestiza"),
                new Cat("Nami", 2, "Ginger"),
                new Duck("Donald", 3, "Campestre")
        };

        for (Animal animal: arrayAnimals) {
            animal.info();
            System.out.println();

            animal.sound();
            System.out.println();

            animal.play();
            System.out.println();
        }
        System.out.println("====================================================");

        // ArrayList
        var arrayListAnimals = new ArrayList<Animal>(Arrays.asList(
                new Dog("Luna", 8, "Mestiza"),
                new Cat("Arenita", 6, "Calico"),
                new Duck("Patrick", 3, "Salvaje¿")
        ));

        for (Animal animal:arrayListAnimals) {
            animal.info();
            System.out.println();

            animal.sound();
            System.out.println();

            animal.play();
            System.out.println();
        }
        System.out.println("====================================================");

        // HashSet
        var hastSetAnimals = new HashSet<Animal>(Set.of(
                new Dog("Firulais", 6, "Poodle"),
                new Cat("Miku", 4,"Chichilla¿"),
                new Duck("Washington", 3, "Acuatico")
        ));

        for (Animal animal:hastSetAnimals) {
            animal.info();
            System.out.println();

            animal.sound();
            System.out.println();

            animal.play();
            System.out.println();
        }
        System.out.println("====================================================");

        // HashMap
        var hashMapAnimals = new HashMap<String, Animal>(Map.of(
                "Perro", new Dog("Dusty", 2, "San Bernardo"),
                "Gato", new Cat("Bills", 2, "Sphynix"),
                "Pato", new Duck("Mam", 9, "Pantano")
        ));

        for (Map.Entry<String, Animal> entry:hashMapAnimals.entrySet()) {
            System.out.println("Tipo de animal: " + entry.getKey());

            var animal = entry.getValue();
            animal.info();
            System.out.println();

            animal.sound();
            System.out.println();

            animal.play();
            System.out.println();
        }
    }
}
