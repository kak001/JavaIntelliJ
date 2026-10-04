package animals;

public class Fish extends Animal {
    // === Atributo ===
    private boolean coldWater;

    // === Constructor ===
    public  Fish(String name, int age, double weight, boolean coldWater) {
        super(name, age, weight);
        setColdWater(coldWater);
    }

    // === Getter ===
    public boolean isColdWater() {
        return coldWater;
    }

    // === Setter ===
    public void setColdWater(boolean coldWater) {
        this.coldWater = coldWater;
    }

    // === Métodos ===
    @Override
    public String toString() {
        return "Nombre del Pez: " + getName() + " | Edad: " + getAge() + " años | Peso: " + getWeight() + " Kg | ¿Es de agua fría?: " + coldWater;
    }

    @Override
    public String sound() {
        return "¡Glug Glug!";
    }
}
