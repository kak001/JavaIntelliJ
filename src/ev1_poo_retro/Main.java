package ev1_poo_retro;

public class Main {
    static void main(String[] args) {
        var library = new Library();
        var book1 = new Book("Cien Años de Soledad", 1967, 5, "Gabriel Garcia Marquez", "Bueno");
        var book2 = new Book("El Principito", 1943, 3, "Antoine de Saint-Exupery", "Deteriorado");
        var audiobook = new AudioBook("Cien Años de Soledad", 1967, 2, 620);
        var audiobook2 = new AudioBook("Sapiens", 2011, 4, 480);

        System.out.println("=== REGISTRO DE MATERIAL LECTOR ===");
        library.addMaterial(book1);
        library.addMaterial(book2);
        library.addMaterial(audiobook);
        library.addMaterial(audiobook2);
        System.out.println();

        System.out.println("=== BÚSQUEDA POR TITULO ===");
        System.out.println(library.searchMaterial("Cien Años de Soledad"));
        System.out.println();

        System.out.println("=== LISTADO DE MATERIALES ===");
        System.out.println(library.showMaterial());
    }
}
