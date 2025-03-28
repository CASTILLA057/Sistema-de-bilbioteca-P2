package Libros;

public class Libro {
    protected String titulo;
    protected String autor;
    protected int añoPublicacion;

    public String getTitulo(){
        return titulo;
    }
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año: " + añoPublicacion;
    }
}
