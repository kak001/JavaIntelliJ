package ev1_poo_retro;

import java.util.ArrayList;

public class Library {
    // === Atributos ===
    private ArrayList<Material> material;

    // === Constructor ===
    public Library() {
        this.material = new ArrayList<>();
    }

    // === Métodos ===
    public void addMaterial(Material material) {
        if (material instanceof Book) {
            this.material.add(material);
            System.out.println("Se ha añadido correctamente el libro \"" + material.getTitle() + "\"");
        } else if (material instanceof AudioBook) {
            this.material.add(material);
            System.out.println("Se ha añadido correctamente el audiolibro \"" + material.getTitle() + "\"");
        } else {
            throw new IllegalArgumentException("Tipo de material no existente.");
        }
    }

    public ArrayList<Material> searchMaterial(String title) {
        ArrayList<Material> results = new ArrayList<>();
        for (Material m : material) {
            if (m.getTitle().equalsIgnoreCase(title)) {
                results.add(m);
            }
        }
        return results;
    }

    public String showMaterial() {
        if (material.isEmpty()) {
            return "No hay material encontrado en la coleccion.";
        }
        StringBuilder sb = new StringBuilder();
        for (Material m : material) {
            sb.append(m.toString()).append("\n");
        }
        return sb.toString();
    }
}
