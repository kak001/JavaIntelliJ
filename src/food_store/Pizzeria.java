package food_store;

public class Pizzeria extends Tienda implements TiendaComida {
    // Constructor
    public Pizzeria(String name, String address, int phoneNumber) {
        super(name, address, phoneNumber);
    }

    // Metodos
    @Override
    public String datosTienda() {
        return "Nombre de la Pizzeria: " + getName() + " | Direccion: " + getAddress() + " | Numero telefonico: +569 " + getPhoneNumber();
    }

    @Override
    public String llamarTienda() {
        return "Llamando a la pizzeria " + getName() + " al numero +569 " + getPhoneNumber() + "...";
    }

    @Override
    public String saludoPersonalizado() {
        return "¡Hola, estas llamando a la mejor pizzeria de Puente Alto, la pizzeria " + getName() + "!";
    }
}
