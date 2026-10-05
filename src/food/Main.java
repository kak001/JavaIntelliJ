package food;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        // try-catch
        try {
            // Variables
            ArrayList<FoodStore> stores = new ArrayList<FoodStore>(Arrays.asList(
                    new Pizzeria("Don Mario", "Los Champiñones 1342", 12345678),
                    new Pizzeria("Zappi Luigi", "Camino Las Estrellas 4352", 87654321),
                    new PretzelShop("Mammi Lola", "Av. Vicuña Mackenna, Local 6", 18273645)
            ));

            System.out.println("=== INFORMACIÓN TIENDAS DE COMIDA ===");
            int i = 0;
            for (FoodStore s : stores) {
                i++;
                System.out.println("Tienda " + i + ": " + s.infoStore());
                System.out.println(s.callStore());
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
