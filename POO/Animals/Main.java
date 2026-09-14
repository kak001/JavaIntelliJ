package Animals;

public class Main {
    public static void main(String[] args) {
        var dog = new Dog("Max", 4, 'M', true);
        dog.info();
        dog.sound();
        dog.play();
        dog.run();
        System.out.println();

        var cat = new Cat("Nami", 2, 'H', false);
        cat.info();
        cat.sound();
        cat.sleep();
        cat.run();
        System.out.println();

        var duck = new Duck("Donald", 6, 'M', true);
        duck.info();
        duck.sound();
        duck.play();
        duck.fly();
    }
}
