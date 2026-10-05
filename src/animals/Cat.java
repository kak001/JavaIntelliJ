package animals;

public class Cat extends Animal {
    // === Atributos ===
    private String colorFur;

    // === Constructor ===
    public Cat(String name, int age, double weight, String colorFur) {
        super(name, age, weight);
        setColorFur(colorFur);
    }

    // === Getter ===
    public String getColorFur() {
        return colorFur;
    }

    // === Setter ===
    public void setColorFur(String colorFur) {
        if (colorFur == null) throw new NullPointerException("El color del pelaje no puede ser nulo.");
        if (colorFur.isEmpty()) throw new IllegalArgumentException("El color del pelaje no puede estar vacío");
        if (colorFur.matches(".*\\d.*"))
            throw new IllegalArgumentException("El color del pelaje no puede contener números.");
        this.colorFur = colorFur;
    }

    // === Métodos ===
    @Override
    public String toString() {
        return "Nombre del Gato: " + getName() + " | Edad: " + getAge() + " años | Peso: " + getWeight() + " Kg | Color del Pelaje: " + getColorFur();
    }

    @Override
    public String sound() {
        return "¡Meow!";
    }
}
