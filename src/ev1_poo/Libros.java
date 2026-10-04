package ev1_poo;

import java.util.ArrayList;

public class Libros extends Material implements Reservable {
    // Atributos
    private String autor;
    private String estadoConservacion;
    private boolean disponibilidadReserva;
    private double costoPrestamo;
    private ArrayList<Libros> reservas;

    // Constructor
    public Libros(String titulo, int anioPublicacion, int copiasDisponibles, String autor, String estadoConservacion, Boolean reservaPrestamo) {
        super(titulo, anioPublicacion, copiasDisponibles);
        if (autor == null || autor.isEmpty()) throw new IllegalArgumentException("El autor esta nulo o vacio.");
        if (estadoConservacion == null || estadoConservacion.isEmpty()) throw new IllegalArgumentException("El autor esta nulo o vacio.");
        if (estadoConservacion.contentEquals("bueno")) {
            this.costoPrestamo = 3500;
        } else if (estadoConservacion.contentEquals("deteriorado")) {
            this.costoPrestamo = 3500 * 1.2;
        } else {
            throw new IllegalArgumentException("Estado de conservación invalido.");
        }
        this.autor = autor;
        this.estadoConservacion = estadoConservacion;
        this.disponibilidadReserva = reservaPrestamo;
        this.reservas = new ArrayList<Libros>();
    }

    // Getters
    public String getAutor() {
        return autor;
    }

    public String getEstadoConservacion() {
        return estadoConservacion;
    }

    public double getCostoPrestamo() {
        return costoPrestamo;
    }

    public boolean getDisponibilidadReserva() {
        return disponibilidadReserva;
    }

    // Setters
    public void setAutor(String autor) {
        if (autor == null || autor.isEmpty()) throw new IllegalArgumentException("El autor esta nulo o vacio.");
        this.autor = autor;
    }

    public void setEstadoConservacion(String estadoConservacion) {
        if (estadoConservacion == null || estadoConservacion.isEmpty()) throw new IllegalArgumentException("El estado de conservacion esta nulo o vacio.");
        this.estadoConservacion = estadoConservacion;
    }

    public void setDisponibilidadReserva(boolean disponibilidadReserva) {
        this.disponibilidadReserva = disponibilidadReserva;
    }

    // Métodos
    @Override
    public String toString() {
        return "Titulo: " + getTitulo() + " | Año de Publicacion: " + getAnioPublicacion() + " | Copias Disponibles: : " + getCopiasDisponibles() + " | Autor: " +  getAutor() + " | Estado de Conservacion: " + getEstadoConservacion() + " | Costo del Préstamo: $" + costoPrestamo + " CLP.";
    }

    @Override
    public void ingresarReserva() {
        if (disponibilidadReserva) {
            reservas.add(this);
            System.out.println("Reserva ingresada.");
        } else {
            System.out.println("No se ha podido ingresar.");
        }
    }

    @Override
    public boolean consultaReserva() {
        return disponibilidadReserva;
    }
}
