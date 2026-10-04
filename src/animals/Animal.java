package animals;

public class Animal {
    // === Atributos ===
    private String name;
    private int age;
    private double weight;

    // === Constructor ===
    public Animal(String name, int age, double weight) {
        setName(name);
        setAge(age);
        setWeight(weight);
    }

    // === Getters ===
    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // === Setters ===
    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("La edad no puede ser negativa.");
        this.age = age;
    }

    public void setName(String name) {
        if (name == null) throw new NullPointerException("El nombre no puede ser nulo.");
        if (name.isEmpty()) throw new IllegalArgumentException("El nombre no puede estar vacío");
        if (name.matches(".*\\d.*")) throw new IllegalArgumentException("El nombre no puede contener números.");
        this.name = name;
    }

    public void setWeight(double weight) {
        if (weight < 0) throw new IllegalArgumentException("El peso no puede ser negativo.");
        this.weight = weight;
    }

    // === Métodos ===
    @Override
    public String toString() {
        return "Nombre del Animal Genérico: " + name + " | Edad: " + age + " años | Peso: " + weight + " Kg";
    }

    public String sound() {
        return "Sonido Genérico";
    }
}
