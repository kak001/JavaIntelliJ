package Colection;

public abstract class Animal {
    // Atributos
    private String name;
    private int age;
    private String race;

    // Constructor
    public Animal(String name, int age, String race) {
        this.name = name;
        this.age = age;
        this.race = race;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRace(String race) {
        this.race = race;
    }

    // Metodos
    public abstract void info();
    public abstract void sound();
    public abstract void play();

    // Colores
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RESET = "\u001B[0m";

    // Mensaje a Color
    public void message(String message, String color){
        System.out.println(color + message + RESET);
    }
}
