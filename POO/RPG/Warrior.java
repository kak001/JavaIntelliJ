package RPG;

import java.util.Random;

public class Warrior extends Character {
    // Atributo especial
    private Random prob;

    // Constructor
    public Warrior(String name, int physicalAttack, int life) {
        super(name, physicalAttack, life);
        this.prob = new Random();
    }

    // Metodos
    @Override
    public void characterInfo() {
        System.out.println("Nombre: " + getName() + " | Daño físico: " + getPhysicalAttack() + " | Vida: " + getLife() + " | Estado: " + getStatus());
    }

    @Override
    public void basicAttack(Character target) {
        if (ownLifeChecker()) {
            message("!" + getName() + " realizo un ataque físico basico!", GREEN);
            int damage = getPhysicalAttack();
            target.setLife(target.getLife() - damage);
            message("!" + target.getName() + " pierde " + damage + " puntos de vida!", YELLOW);
        } else {
            message(getName() + " no puede atacar.", RED);
        }
    }

    public boolean parryAttack() {
        if (ownLifeChecker()) {
            if (prob.nextInt(100) <= 39) {
                return true;
            } else {
                return false;
            }
        }
        message(getName() + " no puede bloquear.", RED);
        return false;
    }

    @Override
    public void receiveDamage(int damage) {
        if (parryAttack()) {
            message("¡" + getName() + " logro bloquear totalmente el ataque de Gwyn!", GREEN);
        } else {
            message("¡Oh no, " + getName() + " ha fallado el bloqueo!", YELLOW);
            int increasedDamage = (int) (1.5 * damage);
            super.receiveDamage(increasedDamage);
            message("¡" + getName() + " recibe un 50% mas de daño del jefe!", RED);
        }
    }

    public void justiceStrike(Character target) {
        if (ownLifeChecker()) {
            message("¡" + getName() + " realiza un ataque especial fisico!", GREEN);
            int damage = (int) (2.2 * getPhysicalAttack());
            target.setLife(target.getLife() - damage);
            message("¡" + target.getName() + " pierde " + damage + " puntos de vida!", YELLOW);
        } else {
            message(getName() + " no puede hacer el ataque especial.", RED);
        }
    }
}
