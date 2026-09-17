package fish;

public class ConsoleColors {
    // Colores
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String ORANGE = "\u001B[38;2;255;165;0m";
    public static final String LIGHT_GRAY = "\u001B[37m";
    public static final String BRIGHT_PINK = "\u001B[95m";
    public static final String BRIGHT_WHITE = "\u001B[97m";
    public static final String RESET = "\u001B[0m";

    // función message
    public static void message(String message, String consoleColors) {
        System.out.println(consoleColors + message + RESET);
    }
}
