
package ec.edu.ups.clases;

/**
 *
 * @author Darwin
 */
public class Multimedia {
    private String nombre;
    private byte archivo;
    private int tamanoByte;
    private String path;

    //set´s
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArchivo(byte archivo) {
        this.archivo = archivo;
    }

    public void setTamanoByte(int tamanoByte) {
        this.tamanoByte = tamanoByte;
    }

    public void setPath(String path) {
        this.path = path;
    }

    
    //get´s 
    public String getNombre() {
        return this.nombre;
    }

    public byte getArchivo() {
        return this.archivo;
    }

    public int getTamanoByte() {
        return this.tamanoByte;
    }

    public String getPath() {
        return this.path;
    }

             
    
}
