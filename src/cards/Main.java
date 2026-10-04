package cards;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        // Cartas

        System.out.println("=== STOCK DE CARTAS ===");
        var cardList = new ArrayList<Carta>(Arrays.asList(
                new CartaMonstruo("Dragon Blanco de Ojos Azules", 3000, 2500),
                new CartaMonstruo("Mago Oscuro", 2500, 2100),
                new CartaTrampa("Fuerza de Espejo", "Destruye todos los monstruos en posicion de ataque."),
                new CartaTrampa("Cilindro Magico", "Niega un ataque e inflije daño a un oponente.")
        ));

        for (Carta card : cardList) {
            System.out.println(card.toString());
        }
    }
}
