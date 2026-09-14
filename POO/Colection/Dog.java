package Colection;

public class Dog extends Animal {
    // Constructor
    public Dog(String name, int age, String race) {
        super(name, age, race);
    }

    // Metodos
    @Override
    public void info() {
        message("INFORMACIÓN DEL PERRO", GREEN);
        message("Nombre: " + getName(), GREEN);
        message("Edad: " + getAge(), GREEN);
        message("Raza: " + getRace(), GREEN);
    }

    @Override
    public void sound() {
        message("¡Woof!", GREEN);
    }

    @Override
    public void play() {
        message("!" + getName() + " esta jugando con una pelota de tenis!", GREEN);
    }
}
