package food;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        // Variables
        Pizzeria pizza = null;
        Pizzeria pizza2 = null;
        PretzelShop pretzel = null;
        ArrayList<FoodStore> stores = null;

        // try-catch
        try {
            stores = new ArrayList<FoodStore>(Arrays.asList(
                    pizza = new Pizzeria("Don Mario", "Los Champiñones 1342", 12345678),
                    pizza2 = new Pizzeria("Zappi Luigi", "Camino Las Estrellas 4352", 87654321),
                    pretzel = new PretzelShop("Mammi Lola", "Av. Vicuña Mackenna, Local 6", 18273645)
            ));

            System.out.println("=== INFORMACIÓN TIENDAS DE COMIDA ===");
            int i = 0;
            for (FoodStore s : stores) {
                i++;
                System.out.println("Tienda " + i + ": " + s.infoStore());
                System.out.println();

                System.out.println(s.callStore());
                System.out.println();

                System.out.println(s.personalizedGreeting());
                System.out.println();
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error Inesperado: " + e.getMessage() );
        } finally {
            System.out.println("Fin del Programa.");
        }
    }
}
