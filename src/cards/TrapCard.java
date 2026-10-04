package cards;

public class TrapCard extends Card {
    // === Atributo ===
    private String effect;

    // === Constructor ===
    public TrapCard(String name, String effect) {
        super(name);
        setEffect(effect);
    }

    // === Getter ===
    public String getEffect() {
        return effect;
    }

    // === Setter ===
    public void setEffect(String effect) {
        if (effect == null) throw new NullPointerException("El efecto no puede ser nulo.");
        if (effect.isEmpty()) throw new IllegalArgumentException("El efecto no puede estar vacío");
        this.effect = effect;
    }

    // === Método ===
    @Override
    public String toString() {
        return "Carta Trampa: " + getName() + " | Efecto: " + effect;
    }
}
