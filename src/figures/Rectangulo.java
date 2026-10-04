package figures;

public class Rectangulo extends Figuras implements Calculos {
    // Atributos
    private int width;
    private int height;

    // Constructor
    public  Rectangulo(String creatorName, String dateCreation, int width, int height) {
        super(creatorName, dateCreation);
        if (width <= 0) throw new IllegalArgumentException("La base es negativa o igual a cero.");
        if (height <= 0) throw new IllegalArgumentException("La altura es negativa o igual a cero.");
        this.width = width;
        this.height = height;
    }

    // Métodos
    @Override
    public int calcularArea() {
        return width * height;
    }

    @Override
    public int calcularPerimetro() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Nombre del creador: " + getCreatorName() + " | Fecha de creacion: " + getDateCreation() + " | Base: " + width + " centimetros | Altura: " + height + " centimetros | Area: " + calcularArea() + " cm^2 | Perimetro: " + calcularPerimetro() + " centimetros";
    }
}
