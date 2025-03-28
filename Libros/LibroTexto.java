package Libros;

public class LibroTexto extends Libro {

    protected String materia;

    public LibroTexto(String materia, String titulo, String autor, int añoPublicacion) {
        this.materia = materia;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;

    }

    @Override
    public String toString() {
        return super.toString() + ", Materia: " + materia;
    }

    }

