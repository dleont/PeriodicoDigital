
package ec.edu.ups.clases;

/**
 *
 * @author Darwin
 */
public class Seccion {
    
    private String nombre;
    private Noticia noticia;
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNoticia(Noticia noticia) {
        this.noticia = noticia;
    }
    
    public String getNombre() {
        return this.nombre;   
    }

    public Noticia getNoticia() {
        return this.noticia;
    }
        
    
}
