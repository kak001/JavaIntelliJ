package ev1_poo_retro;

public abstract class Material {
    // === Atributos ===
    private String title;
    private int publicationYear;
    private int copiesAvailable;

    // === Constructor ===
    public  Material(String title, int publicationYear, int copiesAvailable) {
        setTitle(title);
        setPublicationYear(publicationYear);
        setCopiesAvailable(copiesAvailable);
    }

    // === Getters ===
    public int getPublicationYear() {
        return publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    // === Setters ===
    public void setPublicationYear(int publicationYear) {
        if (publicationYear < 1450 || publicationYear > 2026) throw new IllegalArgumentException("Año de publicación esta fuera del rango (1450 - 2026).");
        this.publicationYear = publicationYear;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        if (copiesAvailable <= 0) throw new IllegalArgumentException("Las copias disponibles son negativas.");
        this.copiesAvailable = copiesAvailable;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) throw new IllegalArgumentException("El titulo esta nulo o vacío.");
        this.title = title;
    }

    // === Métodos ===
    public abstract String toString();

    public abstract double calculateLoanCost();
}
