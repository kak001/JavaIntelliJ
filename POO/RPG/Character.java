package RPG;

public abstract class Character {
    // Atributos
    private String name;
    private int physicalAttack;
    private int life;
    private String status;

    // Constructor
    public Character(String name, int physicalAttack, int life) {
        this.name = name;
        this.physicalAttack = physicalAttack;
        this.life = life;
        this.status = "Normal";
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPhysicalAttack() {
        return physicalAttack;
    }

    public int getLife() {
        return life;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPhysicalAttack(int physicalAttack) {
        this.physicalAttack = physicalAttack;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Metodos
    public void message(String message){
        System.out.println(message);
    }

    public abstract void characterInfo();

    public void characterStatus() {
        if (life <= 0) {
            this.status = "Derrotado/a.";
            message(name + " esta derrotado/a.", RED);
        } else {
            System.out.println(name + " | Vida: " + life + " | Estado actual: " + status);
        }
    }

    public abstract void basicAttack(Character target);

    public boolean ownLifeChecker() {
        if (this.life <= 0) {
            this.status = "Derrotado";
            message(this.name + " su estado actual es: Derrotado/a.", RED);
            return false;
        } else {
            return true;
        }
    }

    // Metodo SOLO para sub clase Warrior
    public void receiveDamage(int damage) {
        this.setLife(this.getLife() - damage);
    }

    // Colores
    public void message(String message, String color){
        System.out.println(color + message + RESET);
    }

    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BRIGHT_PINK = "\u001B[95m";
    public static final String RESET = "\u001B[0m";
    public static final String ORANGE = "\u001B[38;2;255;165;0m";
    public static final String PURPLE = "\u001B[35m";

}
