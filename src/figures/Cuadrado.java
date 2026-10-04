package figures;

public class Cuadrado extends Figuras implements Calculos {
    // Atributo
    private int side;

    // Constructor
    public Cuadrado(String creatorName, String dateCreation, int side){
        super(creatorName, dateCreation);
        if (side <= 0) throw new IllegalArgumentException("El lado es negativo o igual a cero.");
        this.side = side;
    }

    // Métodos
    @Override
    public int calcularArea() {
        return side * side;
    }

    @Override
    public int calcularPerimetro() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Nombre del creador: " + getCreatorName() + " | Fecha de creacion: " + getDateCreation() + " | Lado: " + side + " | Area: " + calcularArea() + " centimetros | Perimetro: " + calcularPerimetro() + " cm^2";
    }
}
