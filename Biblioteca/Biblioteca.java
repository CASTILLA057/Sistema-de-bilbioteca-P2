package Biblioteca;

import java.util.ArrayList;
import Libros.Libro;

public class Biblioteca {

    ArrayList<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca esta vacia");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }

}