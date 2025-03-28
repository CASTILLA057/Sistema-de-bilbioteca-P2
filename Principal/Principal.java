package Principal;

import Libros.Libro;
import Biblioteca.Biblioteca;
import Libros.Novela;
import Libros.Revista;
import Libros.LibroTexto;


public class Principal {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(new LibroTexto("Matematicas" , "Calculo vectorial" , "Castilla" , 2025));
        biblioteca.agregarLibro(new Revista("Ciencia Hoy", "ciencia basica", "Ana gomez", 45));
        biblioteca.agregarLibro(new Novela("terror", "El misterio del bosque", "Luis Rojas", 2015));

        System.out.println("Mostrando todos los libros:");
        biblioteca.mostrarLibros();

        System.out.println("Buscando libro por título 'El misterio del bosque: ");
        Libro libroBuscado = biblioteca.buscarLibroPorTitulo("El misterio del bosque");
        System.out.println(libroBuscado != null ? libroBuscado : "Libro no encontrado.");
    }
}
