package RPG;

public class FinalBoss extends Character {
    // Constructor
    public FinalBoss(String name, int physicalAttack, int life) {
        super(name, physicalAttack, life);
    }

    // Metodos
    @Override
    public void characterInfo() {
        message("Nombre: " + getName() + " | Daño físico: " + getPhysicalAttack() + " | Vida: " + getLife() + " | Estado: " + getStatus(), RED);
    }

    @Override
    public void basicAttack(Character target) {
        if (ownLifeChecker()) {
            message("¡" + getName() + " esta preparando un fuerte ataque!", YELLOW);
            int damage = (int) (2 * getPhysicalAttack());
            target.setLife(target.getLife() - damage);
            message("¡" + target.getName() + " ha recibido el fuerte ataque del jefe, quitándole " + damage + " puntos de vida!", RED);
        } else {
            message(getName() + " no puede atacar.", RED);
        }
    }

    public void poisoning(Character target) {
        if (ownLifeChecker()) {
            message("¡Oh no, el jefe " + getName() + " ha usado un hechizo maligno!", BLUE);
            int damage = 5;
            target.setLife(target.getLife() - damage);
            target.setStatus("Envenenado/a.");
            message("¡" + target.getName() + " ha sido envenenado/a!", PURPLE);
            message("¡El jefe ha envenenado a todo el equipo, todos pierden " + damage + " puntos de vida durante 3 rondas!", PURPLE);
        } else {
            message(getName() + " no puede envenenar.", RED);
        }
    }

    public void pasivePoisoning(Character target) {
        if (ownLifeChecker()) {
            int damage = 5;
            target.setLife(target.getLife() - damage);
            if (target.getLife() <= 0) {
                message("¡Oh no, " + target.getName() + " ha sido derrotado/a debido al veneno!", PURPLE);
            }
        }
    }

    public void mortalHit(Character target) {
        if (ownLifeChecker()) {
            message("¡El jefe esta preparando su ataque definitivo!", YELLOW);
            int damage = (int) (5 * getPhysicalAttack());
            target.setLife(target.getLife() - damage);
            if (target.getLife() < 50) {
                message("¡ONE SHOT!" + target.getName() + " ha sido derrotado de UN solo golpe!", RED);
                target.setStatus("Derrotado/a.");
            } else {
                message("¡" + getName() + " ha sobrevido al golpe mortal del jefe, recibiendo " + damage + " puntos de daño!", YELLOW);
            }
        } else {
            message(getName() + " no puede atacar.", RED);
        }
    }
}
