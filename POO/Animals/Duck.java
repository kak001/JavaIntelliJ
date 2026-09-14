package Animals;

public class Duck extends Animal implements Fly {
    private boolean like;

    public Duck(String name, int age, char sex, boolean like) {
        super(name, age, sex);
        this.like = like;
    }

    @Override
    public void info() {
        System.out.println("INFORMACION DEL PLUMIFERO");
        System.out.println("Nombre: " + getName());
        System.out.println("Edad: " + getAge());
        System.out.println("Sexo: " + getSex());
        System.out.println("¿Al plumifero le gusta comer frutos secos?: " + like);
    }

    @Override
    public void sound() {
        System.out.println("¡Cuak!");
    }

    public boolean play() {
        if (getSex() == 'M') {
            System.out.println("¡El pato " + getName() + " le gusta correr detras de unas lombrices!");
            return true;
        } else if (getSex() == 'H') {
            System.out.println("A la pata " + getName() + " le gusta correr detras de unas lombrices!");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void fly() {
        System.out.println("El plumifero esta volando a gran altura en el cielo...");
    }
}
