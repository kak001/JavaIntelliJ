package Animals;

public class Dog extends Animal implements Run {
    private boolean like;

    public Dog(String name, int age, char sex, boolean like) {
        super(name, age, sex);
        this.like = like;
    }

    @Override
    public void info() {
        System.out.println("INFORMACION DEL CANINO");
        System.out.println("Nombre: " + getName());
        System.out.println("Edad: " + getAge());
        System.out.println("Sexo: " + getSex());
        System.out.println("¿Al canino le gusta las croquetas?: " + like);
    }

    @Override
    public void sound() {
        System.out.println("¡Woof!");
    }

    public boolean play() {
        if (getSex() == 'M') {
            System.out.println("¡El perro " + getName() + " esta jugando con una pelota de tenis!");
            return true;
        } else if (getSex() == 'H') {
            System.out.println("¡La perra " + getName() + " esta jugando con una pelota de tenis!");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void run() {
        System.out.println("¡El canino le encanta correr por el parque!");
    }
}
