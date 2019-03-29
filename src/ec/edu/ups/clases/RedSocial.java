
package ec.edu.ups.clases;

/**
 *
 * @author Darwin
 */
public class RedSocial {
    
    private int codigo;
    private String nombre;
    private String url;
    private String[] publicaciones;
    
    //set´s
    
    public void setCodigo(int codigo){
        this.codigo = codigo;  
    }
    
     public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
      public void setUrl(String url){
        this.url = url; 
    }
    
      
   //get´s
     
    public int getCodigo(){
        return this.codigo;
    }
      
    public String getNombre(){
        return this.nombre; 
    }
      
    public String getUrl(){
        return this.url;
    }
      
    
    
}

