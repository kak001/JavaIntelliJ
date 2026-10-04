package cards;

public abstract class Card {
    // === Atributo ===
    private String name;

    // === Constructor ===
    public Card(String name) {
        setName(name);
    }

    // === Getter ===
    public String getName() {
        return name;
    }

    // === Setter ===
    public void setName(String name) {
        if (name == null) throw new NullPointerException("El nombre de la carta no puede ser nulo.");
        if (name.isEmpty()) throw new IllegalArgumentException("El nombre carta no puede estar vacío");
        this.name = name;
    }

    // === Método ===
    public abstract String toString();
}
