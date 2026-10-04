package figures;

public class Triangulo extends Figuras implements Calculos {
    // Atributos
    private int width;
    private int height;

    // Constructor
    public Triangulo(String creatorName, String dateCreation, int width, int height) {
        super(creatorName, dateCreation);
        if (width <= 0) throw new IllegalArgumentException("La base es negativa o igual a cero.");
        if (height <= 0) throw new IllegalArgumentException("La altura es negativa o igual a cero.");
        this.width = width;
        this.height = height;
    }

    // Métodos
    @Override
    public int calcularArea() {
        return  (width * height) / 2;
    }

    @Override
    public int calcularPerimetro() {
        return width * 3;
    }

    @Override
    public String toString() {
        return "Nombre del creador: " + getCreatorName() + " | Fecha de creacion: " + getDateCreation() + " | Base: " + width + " centimetros | Altura: " + height + " centimetros | Area: " + calcularArea() + " cm^2 | Perimetro: " + calcularPerimetro() + " centimetros";
    }
}
