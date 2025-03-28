package Libros;

public class Novela extends Libro {
    
    protected String genero;

    public Novela(String genero , String titulo , String autor , int añoPublicacion){
        this.genero = genero;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;

    }
    @Override
    public String toString() {
        return super.toString() + ", Género: " + genero;
    }
    }

