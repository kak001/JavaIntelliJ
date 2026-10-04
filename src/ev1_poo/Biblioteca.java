package ev1_poo;

import java.util.ArrayList;

public class Biblioteca {
    // Atributos
    private ArrayList<Material> materiales;

    // Constructor
    public Biblioteca() {
        this.materiales = new ArrayList<>();
    }

    // Métodos
    public String ingresarMaterial(Material material) {
        if (material instanceof Libros) {
            materiales.add(material);
            System.out.println("Se ha ingresado correctamente el libro \"" + material.getTitulo() + "\"");
        } else if (material instanceof AudioLibro) {
            materiales.add(material);
            System.out.println("Se ha ingresado correctamente el audiolibro \"" + material.getTitulo() + "\"");
        } else {
            throw new IllegalArgumentException("Contenido invalido.");
        }
        return "";
    }

    public String buscarMaterial(Material material) {
        if (material instanceof Libros) {
            var materialLibro = (Libros) material;
            return "Tipo: Libro | Titulo: " + material.getTitulo() + " | Año: " + material.getAnioPublicacion() + " | Copias: " + material.getCopiasDisponibles() + " | Autor: " + materialLibro.getAutor() + " | Estado: " + materialLibro.getEstadoConservacion() + " | Costo prestamo: $" + materialLibro.getCostoPrestamo() + " CLP.";
        }
        return "";
    }

}
