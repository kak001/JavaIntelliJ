package Colection;

public class Duck extends Animal {
    // Constructor
    public Duck(String name, int age, String race) {
        super(name, age, race);
    }

    // Metodos
    @Override
    public void info() {
        message("INFORMACIÓN DEL PATO", YELLOW);
        message("Nombre: " + getName(), YELLOW);
        message("Edad: " + getAge(), YELLOW);
        message("Raza: " + getRace(), YELLOW);
    }

    @Override
    public void sound() {
        message("¡Cuek!", YELLOW);
    }

    @Override
    public void play() {
        message("!" + getName() + " disfruta de estar volando muy arriba!", YELLOW);
    }
}
