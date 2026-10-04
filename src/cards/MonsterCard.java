package cards;

public class MonsterCard extends Card {
    // === Atributos ===
    private int attack;
    private int defense;
    
    // === Constructor ===
    public MonsterCard(String name, int attack, int defense) {
        super(name);
        setAttack(attack);
        setDefense(defense);
    }
    
    // === Getters ===
    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }
    
    // === Setters ===
    public void setAttack(int attack) {
        if (attack < 0) throw new IllegalArgumentException("El ataque no puede ser negativo.");
        this.attack = attack;
    }

    public void setDefense(int defense) {
        if (defense < 0) throw new IllegalArgumentException("La defensa no puede ser negativa.");
        this.defense = defense;
    }
    
    // === Método ===
    @Override
    public String toString() {
        return "Carta Monstruo: " + getName() + " | ATK: " + getAttack() + " | DEF: " + getDefense();
    }
}
