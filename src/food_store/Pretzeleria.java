package food_store;

public class Pretzeleria extends Tienda implements TiendaComida {
    // Constructor
    public Pretzeleria(String name, String address, int phoneNumber) {
        super(name, address, phoneNumber);
    }

    // Metodos
    @Override
    public String datosTienda() {
        return "Nombre de la Pretzeleria: " + getName() + " | Direccion: " + getAddress() + " | Numero telefonico: +569 " + getPhoneNumber();
    }

    @Override
    public String llamarTienda() {
        return "Llamando a la pretzeleria " + getName() + " al numero +569 " + getPhoneNumber() + "...";
    }

    @Override
    public String saludoPersonalizado() {
        return "¿Rico, suave y adictivo? ¡Esa es la tienda de " + getName() + ", la mejor pretzeleria de Santiago!";
    }
}
