package food;

public class Pizzeria extends Store implements FoodStore {
    // === Constructor ===
    public Pizzeria(String name, String address, int phoneNumber) {
        super(name, address, phoneNumber);
    }

    // === Métodos ===
    @Override
    public String infoStore() {
        return "Nombre de la Pizzeria: " + getName() + " | Dirección: " + getAddress() + " | Numero Telefónico: +569 " + getPhoneNumber();
    }

    @Override
    public String callStore() {
        return "Estas llamando a la pizzeria " + getName() + ", un momento...";
    }

    @Override
    public String personalizedGreeting() {
        return "¡Mamma mia, pero que ricas pizzas de " + getName() + " las mejores de todo Puente Alto!";
    }
}
