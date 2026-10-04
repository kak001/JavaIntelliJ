package cards;

public class CartaMonstruo extends Carta {
    // Atributos
    private int attack;
    private int defense;

    // Constructor
    public CartaMonstruo(String name, int attack, int defense) {
        super(name);
        this.attack = attack;
        this.defense = defense;
    }

    // Metodo
    @Override
    public String toString() {
        return "Carta Monstruo: " + getName() + " | ATK: " + attack + " | DEF: " + defense;
    }
}
