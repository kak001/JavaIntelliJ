package figures;

public class Circulo extends Figuras implements Calculos {
    // Atributo
    private int radio;

    // Constructor
    public Circulo(String creatorName, String dateCreation, int radio) {
        super(creatorName, dateCreation);
        if (radio <= 0) throw new IllegalArgumentException("El radio es negativo o igual a cero.");
        this.radio = radio;
    }

    // Métodos
    @Override
    public int calcularArea() {
        return (int) (Math.PI * radio * radio);
    }

    @Override
    public int calcularPerimetro() {
        return (int) (2 *  Math.PI * radio);
    }

    @Override
    public String toString() {
        return "Nombre del creador: " + getCreatorName() + " | Fecha de creacion: " + getDateCreation() + " | Radio: " + radio + " centímetros | Area: " + calcularArea() + " centímetros | Perimetro: " + calcularPerimetro() + " cm^2";
    }
}
