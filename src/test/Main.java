package test;

public class Main {
    static void main(String[] args) throws InvalidAgeException {
        System.out.println("Hello Java!");

        var age = 0;

        try {
            age = 20;
            System.out.println("¿Es mayor de edad?: " + anotherAgeChecker(age));

            age = -2;
            System.out.println("¿Es mayor de edad?: " + anotherAgeChecker(age));
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Fin del bloque try-catch");
        }
    }

    public static boolean ageChecker(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("La edad es negativa.");
        } else {
            return age >= 18;
        }
    }

    public static boolean anotherAgeChecker(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("La edad es negativa.");
        } else {
            return age >= 18;
        }
    }
}
