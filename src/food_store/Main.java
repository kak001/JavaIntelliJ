package food_store;

public class Main {
    static void main(String[] args) {
        // Pizzerias
        var pizzeria = new Pizzeria("Don Mario", "Los Champiñones 6769", 12345678);
        var anotherPizzeria = new Pizzeria("Freddy's Fazbear Family Dinner", "Don Pepe 1471", 87654321);

        // Pretzeleria
        var pretzeleria = new Pretzeleria("Mister Pretzel's", "Las Flores 1021", 87651234);

        // Mensaje en Consola
        System.out.println(pizzeria.datosTienda());
        System.out.println(pizzeria.llamarTienda());
        System.out.println(pizzeria.saludoPersonalizado());
        System.out.println();

        System.out.println(anotherPizzeria.datosTienda());
        System.out.println(anotherPizzeria.llamarTienda());
        System.out.println(anotherPizzeria.saludoPersonalizado());
        System.out.println();

        System.out.println(pretzeleria.datosTienda());
        System.out.println(pretzeleria.llamarTienda());
        System.out.println(pretzeleria.saludoPersonalizado());
    }
}
