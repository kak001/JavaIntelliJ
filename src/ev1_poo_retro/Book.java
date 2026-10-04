package ev1_poo_retro;

public class Book extends Material implements Bookable {
    // === Atributos ===
    private String author;
    private String conservationStatus;
    private boolean availabilityIndicator;
    private double loanCost;

    // === Constructor ===
    public  Book(String title, int publicationYear, int copiesAvailable, String author, String conservationStatus) {
        super(title, publicationYear, copiesAvailable);
        setAuthor(author);
        setConservationStatus(conservationStatus);
        this.loanCost = calculateLoanCost();
    }

    // === Getters ===
    public String getAuthor() {
        return author;
    }

    public String getConservationStatus() {
        return conservationStatus;
    }

    public boolean getAvailabilityIndicator() {
        return availabilityIndicator;
    }

    public double getLoanCost() {
        return loanCost;
    }

    // === Setters ===
    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) throw new IllegalArgumentException("El autor esta nulo o vacío.");
        this.author = author;
    }

    public void setConservationStatus(String conservationStatus) {
        if (conservationStatus.equalsIgnoreCase("Bueno") || conservationStatus.equalsIgnoreCase("Deteriorado")) {
            this.conservationStatus = conservationStatus;
        } else {
            if (conservationStatus == null || conservationStatus.isEmpty()) {
                throw new IllegalArgumentException("El estado de conservacion es nulo o esta vacio.");
            }
        }
    }

    public void setAvailabilityIndicator(boolean availabilityIndicator) {
        this.availabilityIndicator = availabilityIndicator;
    }

    // === Métodos ===
    @Override
    public String toString() {
        return "Titulo del Libro: " + getTitle() + " | Año de Publicación: " + getPublicationYear();
    }

    @Override
    public double calculateLoanCost() {
        if (conservationStatus.equalsIgnoreCase("Deteriorado")) {
            return 3500 * 1.2;
        } else if (conservationStatus.equalsIgnoreCase("Bueno")) {
            return 3500;
        } else {
            throw new IllegalArgumentException("El estado de conservación es invalido.");
        }
    }

    @Override
    public boolean reserveStatus() {
        return availabilityIndicator;
    }

    @Override
    public void reserve() {
        this.availabilityIndicator = true;
    }
}
