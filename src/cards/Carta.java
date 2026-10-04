package cards;

public abstract class Carta {
    // Atributo
    private String name;

    // Constructor
    public Carta(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Método
    @Override
    public String toString() {
        return super.toString();
    }
}
