
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author Darwin
 */
public class Noticia {
    
    private String tituloNoticia;
    private String autor;
    private String lugar;
    private Date fecha;
    private String contenido;
    private Multimedia multimedia;

    //set´s
    public void setTituloNoticia(String tituloNoticia) {
        this.tituloNoticia = tituloNoticia;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
     public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }

    
    //get's

    public String getTituloNoticia() {
        return this.tituloNoticia;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getLugar() {
        return this.lugar;
    }
    
    
    public Date getFecha() {
        return this.fecha;
    }

    public String getContenido() {
        return this.contenido;
    }

    public Multimedia getMultimedia() {
        return this.multimedia;
    }

   
    
}
