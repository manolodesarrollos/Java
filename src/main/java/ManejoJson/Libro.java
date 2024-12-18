/*

Se crea la clase Libro
 */
package ManejoJson;


/**
 *
 * @author Manolo Pajaro
 */
class Libro {
// se crean las prpiedades
    private int id;
    private String titulo;
    private String autor;
    private int anioPublicacion;
// se crea el constructor
    
    
    public Libro(int id, String titulo, String autor, int anioPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    
    // se crean solo los get 

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
}

