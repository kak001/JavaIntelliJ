package Animals;

public class Cat extends Animal implements Run {
    private boolean like;

    public Cat(String name, int age, char sex, boolean like) {
        super(name, age, sex);
        this.like = like;
    }

    @Override
    public void info() {
        System.out.println("INFORMACION DEL FELINO");
        System.out.println("Nombre: " + getName());
        System.out.println("Edad: " + getAge());
        System.out.println("Sexo: " + getSex());
        System.out.println("¿Al felino le gusta bañarse?: " + like);
    }

    @Override
    public void sound() {
        System.out.println("¡Meow!");
    }

    public boolean sleep() {
        if (getSex() == 'M') {
            System.out.println("El gato esta tomando una siesta rutinaria: \"Zzz...\"");
            return true;
        } else if (getSex() == 'H') {
            System.out.println("La gata esta tomando una siesta rutinaria.. \"Zzz...\"");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void run() {
        System.out.println("¡Al felino le emociona correr detras de un juguete para gatos!");
    }
}
