package cards;

public class CartaTrampa extends Carta {
    // Atributo
    private String effect;

    // Constructor
    public CartaTrampa(String name, String effect) {
        super(name);
        this.effect = effect;
    }

    // Metodo
    @Override
    public String toString() {
        return "Carta trampa: "+ getName() + " | Efecto: " + effect;
    }
}
