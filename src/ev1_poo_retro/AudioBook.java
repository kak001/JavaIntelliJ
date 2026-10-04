package ev1_poo_retro;

public class AudioBook extends Material {
    // === Atributos ===
    private int durationInMinutes;
    private double loanCost;

    // === Constructor ===
    public AudioBook(String title, int publicationYear, int copiesAvailable, int durationInMinutes) {
        super(title, publicationYear, copiesAvailable);
        setDurationInMinutes(durationInMinutes);
        this.loanCost = calculateLoanCost();
    }

    // === Getters ===
    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public double getLoanCost() {
        return loanCost;
    }

    // === Setters ===
    public void setDurationInMinutes(int durationInMinutes) {
        if (durationInMinutes < 0) throw new IllegalArgumentException("La duracion en minutos en negativa o igual a 0.");
        this.durationInMinutes = durationInMinutes;
    }

    // === Métodos ===
    @Override
    public String toString() {
        return "Titulo del Audiolibro: " + getTitle() + " | Año de Publicacion: " + getPublicationYear();
    }

    @Override
    public double calculateLoanCost() {
        return durationInMinutes > 300 ? 2800 * 1.15 : 2800;
    }
}
