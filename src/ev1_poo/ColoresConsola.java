package ev1_poo;

public class ColoresConsola {
    // Colores
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AZUL = "\u001B[34m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String ROSADO = "\u001B[95m";
    public static final String ANARANJADO = "\u001B[38;2;255;165;0m";
    public static final String MORADO = "\u001B[35m";
    public static final String RESET = "\u001B[0m";

    // Constructor privado
    private ColoresConsola() {
        throw new UnsupportedOperationException("No se puede inicializar.");
    }

    // Método
    public void mensaje(String mensaje, String color){
        System.out.println(color + mensaje + RESET);
    }
}
