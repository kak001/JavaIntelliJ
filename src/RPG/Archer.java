package RPG;

public class Archer extends Character {
    // Atributo especial
    private int range;

    // Constructor
    public Archer(String name, int physicalAttack, int life, int range) {
        super(name, physicalAttack, life);
        this.range = range;
    }

    // Getter
    public int getRange() {
        return range;
    }

    // Setter
    public void setRange(int range) {
        this.range = range;
    }

    // Metodos
    @Override
    public void characterInfo() {
        System.out.println("Nombre: " + getName() + " | Daño fisico: " + getPhysicalAttack() + " | Vida: " + getLife() + " | Alcanze (metros): " + range + " | Estado: " + getStatus());
    }

    @Override
    public void basicAttack(Character target) {
        if (ownLifeChecker()) {
            if (range >= 1 && range <= 15) {
                message("!" + getName() + " ha disparado una flecha triple a corta distancia!", GREEN);
                int damage = getPhysicalAttack();
                target.setLife(target.getLife() - damage);
                message("!" + getName() + " ha herido a " + target.getName() + " infringiendo " + damage + " puntos de daño fisico!", ORANGE);
            } else if (range >= 16 && range <= 25) {
                message("!" + getName() + " ha disparado una flecha triple a media distancia!", GREEN);
                int damageMultiplier = 2;
                int damage = (int) (damageMultiplier * getPhysicalAttack());
                target.setLife(target.getLife() - damage);
                message("!" + getName() + " ha herido a " + target.getName() + " infringiendo " + damage + " puntos de daño fisico!", ORANGE);
            } else if (range >= 26) {
                message("!" + getName() + " ha disparado una flecha triple a larga distancia!", GREEN);
                int damageMultiplier = 3;
                int damage = (int) (damageMultiplier * getPhysicalAttack());
                target.setLife(target.getLife() - damage);
                message("!" + getName() + " ha herido a " + target.getName() + " infringiendo " + damage + " puntos de daño fisico!", ORANGE);
            } else {
                message("!Oh no, " + getName() + " ha fallado sus flechas triples!", RED);
            }
        } else {
            message(getName() + " no puede atacar.", RED);
        }
    }
}
