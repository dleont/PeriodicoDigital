
package ec.edu.ups.clases;

/**
 *
 * @author Darwin
 */
public class Seccion {
    
    private String nombre;
    private Noticia noticias[];
    

    //set´s
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNoticias(Noticia[] noticias) {
        this.noticias = noticias;
    }
    
    
    //get's
    /**
     * 
     * @return 
     */

    public String getNombre() {
        return nombre;
    }

    public Noticia[] getNoticias() {
        return noticias;
    }

    
    
    
    
    
        
    
}
