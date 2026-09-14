package Colection;

public class Cat extends Animal {
    // Constructor
    public Cat(String name, int age, String race) {
        super(name, age, race);
    }

    // Metodos
    @Override
    public void info() {
        message("INFORMACIÓN DEL GATO", BLUE);
        message("Nombre: " + getName(), BLUE);
        message("Edad: " + getAge(), BLUE);
        message("Raza: " + getRace(), BLUE);
    }

    @Override
    public void sound() {
        message("¡Meow!", BLUE);
    }

    @Override
    public void play() {
        message("!" + getName() + " esta jugando con una bola de estambre!", BLUE);
    }
}
