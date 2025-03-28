package Libros;

public class Revista extends Libro {
    
    protected String tipo;
    public Revista(String tipo , String titulo , String autor , int añoPublicacion){
        this.tipo = tipo;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;

    }
    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + tipo;
    }

    }


