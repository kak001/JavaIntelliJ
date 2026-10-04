package cards;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        // Variables
        MonsterCard monsterCard = null;
        MonsterCard monsterCard2 = null;
        TrapCard trapCard = null;
        TrapCard trapCard2 = null;
        ArrayList<Card> cards;

        // try-catch
        try {
            monsterCard = new MonsterCard("Dragón Blanco de Ojos Azules", 3000, 2500);
            monsterCard2 = new MonsterCard("Mago Oscuro", 2500, 2100);
            trapCard = new TrapCard("Fuerza de Espejo", "Destruye todos los monstruos en posición de ataque.");
            trapCard2 = new TrapCard("Cilindro magico", "Niega un ataque e inflige daño al oponente.");

            cards = new ArrayList<Card>(Arrays.asList(monsterCard, monsterCard2, trapCard, trapCard2));

            System.out.println("=== STOCK DE CARTAS ===");
            int i = 0;
            for (Card c: cards) {
                i++;
                System.out.println("Carta " + i + ": " + c.toString());
            }
            System.out.println();
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error Inesperado: "  + e.getMessage());
        } finally {
            System.out.println("Fin del Programa.");
        }
    }
}
