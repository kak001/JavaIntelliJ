package RPG;

import javax.management.remote.JMXServerErrorException;
import javax.swing.plaf.BorderUIResource;

public class Healer extends Character {
    // Atributo especial
    private int magicStat;

    // Constructor
    public Healer(String name, int physicalAttack, int life, int magicStat) {
        super(name, physicalAttack, life);
        this.magicStat = magicStat;
    }

    // Metodos
    @Override
    public void characterInfo() {
        System.out.println("Nombre: " + getName() + " | Daño fisico: " + getPhysicalAttack() + " | Capacidad de Curacion: " + this.magicStat + " | Vida: " + getLife() + " | Estado: " + getStatus());
    }

    public void basicAttack(Character target) {
        if (ownLifeChecker()) {
            message("!" + getName() + " realiza un ataque físico basico!", GREEN);
            int damage = (int) ( 0.5 * getPhysicalAttack());
            target.setLife(target.getLife() - damage);
            message("!" + target.getName() + " pierde " + damage + " puntos de vida!", YELLOW);
        } else {
            message(getName() + " no puede atacar.", RED);
        }
    }

    public void healCharacterLife(Character target) {
        if (ownLifeChecker()) {
            message("!" + getName() + " esta sanando a " + target.getName() + "!", GREEN);
            int heal = magicStat;
            target.setLife(target.getLife() + magicStat);
            message("!" + target.getName() + " recupera " + heal + " puntos de vida!", BRIGHT_PINK);
        } else {
            message(getName() + " no puede sanar.", RED);
        }
    }

    public void cureCharacterStatus(Character target) {
        if (ownLifeChecker()) {
            if (target.getStatus().equals("Normal")) {
                message("!" + getName() + " no puede curar aun aliado con un estado \"Normal\"!", YELLOW);
            } else {
                message("!" + getName() + " esta curando a " + target.getName() + "!", GREEN);
                target.setStatus("Normal");
                message("!" + getName() + " ha curado el estado de " + target.getName() + "!", BRIGHT_PINK);
            }
        } else {
            message(getName() + " no puede curar.", RED);
        }
    }

    public void blessCharacterStats(Character target) {
        if (ownLifeChecker()) {
            if (target instanceof Mage) {
                var mageTarget = (Mage) target;
                message("!" + getName() + " esta bendiciendo al mago " + mageTarget.getName() + "!", BRIGHT_PINK);
                int bless = 10;
                mageTarget.setMagicAttack(mageTarget.getMagicAttack() + bless);
                message("!" + getName() + " ha bendecido al mago " + mageTarget.getName() + " con " + bless + " puntos extras a su atributo de daño magico!", BLUE);
            } else {
                message("!" + getName() + " esta bendiciendo a " + target.getName() + "!", BRIGHT_PINK);
                int bless = 10;
                target.setPhysicalAttack(target.getPhysicalAttack() + bless);
                message("!" + getName() + " ha bendecido a " + target.getName() + " con " + bless + " puntos extras a su atributo de daño físico!", GREEN);
            }
        } else {
            message(getName() + " no puede bendecir.", RED);
        }
    }
}
