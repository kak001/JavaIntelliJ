package Football;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // for-each
        var players = new ArrayList<Player>(Arrays.asList(
                new Player("Cristiano Ronaldo123", 91),
                new Player("Lamine Yamal", 88),
                new Player(null, null),
                new Player("Kylian Mbappe", 90),
                new Player("Neymar Junior", -2),
                new Player("Thierry Henry", 92)
        ));

        for (Player player:players) {
            try {
                player.kick();
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }
        System.out.println();

        try {
            System.out.println(players.get(0));
            System.out.println(players.get(10));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Explicacion

        // Nota: ArithmeticException, NullPointerException y NumberFormatException
        // son excepciones "unchecked" (heredan de RuntimeException), por lo tanto
        // el compilador no obliga a declararlas con "throws" ni a capturarlas.
        // Se declaran aquí solo como documentación del comportamiento del método.
        // Se usa "throw" para lanzarlas manualmente cuando se detecta un dato inválido.
    }
}
