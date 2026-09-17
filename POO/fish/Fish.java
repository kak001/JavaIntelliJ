package fish;

public abstract class Fish {
    // Atributos
    private String race;
    private double weight;
    private double length;

    // Constructor
    public Fish(String race, double weight, double length) {
        if (race == null) throw new NullPointerException("Raza no valida: La raza del pescado NO puede ser nulo.");
        if (race.isEmpty() || race.matches(".*\\d.*")) throw new IllegalArgumentException("Raza no valida: La raza del pescado NO puede estar vacía o contener números. ");
        if (weight <= 0) throw new IllegalArgumentException("Peso no valido: El peso del pescado NO puede ser menor o igual a 0.");
        if (length <= 0) throw new IllegalArgumentException("Longitud no valida: La longitud del pescado NO puede ser menor o igual a 0.");

        this.race = race;
        this.weight = weight;
        this.length = length;
    }

    // Getters
    public String getRace() {
        return race;
    }
    public double getWeight() {
        return weight;
    }
    public double getLength() {
        return length;
    }

    // Setters
    public void setRace(String race) {
        if (race == null) throw new NullPointerException("Raza no valida: La raza del pescado NO puede ser nula.");
        if (race.isEmpty() || race.matches(".*\\d.*")) throw new IllegalArgumentException("Raza no valida: La raza del pescado NO puede estar vacía o contener números.");
        this.race = race;
    }
    public void setWeight(double weight) {
        if (weight <= 0) throw new IllegalArgumentException("Peso no valido: El peso del pescado NO puede ser menor o igual a 0.");
        this.weight = weight;
    }
    public void setLength(double length) {
        if (length <= 0) throw new IllegalArgumentException("Longitud no valida: La longitud del pescado NO puede ser menor o igual a 0.");
        this.length = length;
    }

    // Metodos
    public abstract void info();
    public abstract void sound();
}
