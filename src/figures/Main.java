package figures;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        // Variables
        ArrayList<Figuras> lista = null;

        try {
            var figurasList = new ArrayList<Figuras>(Arrays.asList(
                    new Cuadrado("kako", "29/09/2026", 5),
                    new Rectangulo("kako", "29/09/2026", 5, 7),
                    new Triangulo("kako", "29/09/2026", 7, 12),
                    new Circulo("kako", "29/09/2026", 15)
            ));

            System.out.println("=== INFORMACION DE LAS FIGURAS Y CREADOR ===");
            int index = 0;
            for (Figuras figuras : figurasList) {
                index++;
                System.out.println("Figura " + index + ": " + figuras.toString());
                System.out.println();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            System.out.println("Fin del bloque try-catch.");
        }
    }
}
