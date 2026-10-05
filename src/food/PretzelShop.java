package food;

public class PretzelShop extends Store implements FoodStore {
    // === Constructor ===
    public PretzelShop(String name, String address, int phoneNumber) {
        super(name, address, phoneNumber);
    }

    // === Métodos ===
    @Override
    public String infoStore() {
        return "Nombre de la Pretzeleria: " + getName() + " | Direccion: " + getAddress() + " | Numero Telefonico: +569 " + getPhoneNumber();
    }

    @Override
    public String callStore() {
        return "Llamando a la pretzeleria " + getName() + ", espere por favor...";
    }

    @Override
    public String personalizedGreeting() {
        return "¡Pero que ricas son los pretzels de " + getName() + ", la mejor pretzeleria de todo Santiago!";
    }
}
