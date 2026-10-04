package figures;

public abstract class Figuras {
    // Atributos
    private String creatorName;
    private String dateCreation;

    // Constructor
    public Figuras(String creatorName, String dateCreation) {
        if (creatorName == null || creatorName.isBlank()) throw new IllegalArgumentException("El nombre del creador es null o esta en blanco.");
        if (dateCreation == null || dateCreation.isBlank()) throw new IllegalArgumentException("La fecha de creación es null o esta en blanco.");
        this.creatorName = creatorName;
        this.dateCreation = dateCreation;
    }

    // Getters
    public String getCreatorName() {
        return creatorName;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    // Setters
    public void setCreatorName(String creatorName) {
        if (creatorName == null || creatorName.isBlank()) throw new IllegalArgumentException("El nombre del creador es null o esta en blanco.");
        this.creatorName = creatorName;
    }

    public void setDateCreation(String dateCreation) {
        if (dateCreation == null || dateCreation.isBlank()) throw new IllegalArgumentException("La fecha de creación es null o esta en blanco.");
        this.dateCreation = dateCreation;
    }

    // Método
    public abstract String toString();
}
