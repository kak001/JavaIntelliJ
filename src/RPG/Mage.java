package RPG;

public class Mage extends Character {
    // Atributo especial
    private int magicAttack;

    // Constructor
    public Mage(String name, int physicalAttack, int life, int magicAttack) {
        super(name, physicalAttack, life);
        this.magicAttack = magicAttack;
    }

    // Getter
    public int getMagicAttack() {
        return magicAttack;
    }

    // Setter
    public void setMagicAttack(int magicAttack) {
        this.magicAttack = magicAttack;
    }

    // Metodos
    @Override
    public void characterInfo() {
        System.out.println("Nombre: " + getName() + " | Daño fisico: " + getPhysicalAttack() + " | Daño magico: " + this.magicAttack + " | Vida: " + getLife() + " | Estado: " + getStatus());
    }

    @Override
    public void basicAttack(Character target) {
        if (ownLifeChecker()) {
            message("!" + getName() + " realiza un ataque físico basico!", GREEN);
            int damage = getPhysicalAttack();
            target.setLife(target.getLife() - damage);
            message("!" + target.getName() + " pierde " + damage + " puntos de vida!", YELLOW);
        } else {
            message(getName() + " no puede atacar.", RED);
        }
    }

    public void lightningAttack(Character target) {
        if (ownLifeChecker()) {
            message("!" + getName() + " realiza una ataque especial magico!", BLUE);
            int magicDamage = (int)(1.5 * this.magicAttack);
            target.setLife(target.getLife() - magicDamage);
            message("!" + target.getName() + " pierde " + magicDamage + " puntos de vida!", YELLOW);
        } else {
            message(getName() + " no puede atacar.", RED);
        }
    }

    public void blizzardAttack(Character target) {
        if (ownLifeChecker()) {
            message("!" + getName() + " realiza un ataque especial magico!", BLUE);
            int magicAttack = (int)(3 * this.magicAttack);
            target.setLife(target.getLife() - magicAttack);
            message("!" + target.getName() + " pierde " + magicAttack + " puntos de vida!", YELLOW);
        } else {
            message(getName() + " no puede atacar.", RED);
        }
    }
}
