
package ec.edu.ups.pruebas;

import ec.edu.ups.clases.*;


/**
 *
 * @author Darwin
 */
public class Prueba {
    
    public static void main(String[] args){
        
        //clase: Red Social
        RedSocial face = new RedSocial();
        
        face.setCodigo(001);
        face.setNombre("Facebook");
        face.setUrl("www.facebook.com");
        
        int cod= face.getCodigo();
        System.out.println("Codigo: "+cod);
        
        String nom = face.getNombre();
        System.out.println("Nombre: "+nom);
        
        String url = face.getUrl();
        System.out.println("Url: "+url);
          
        //clase Seccion
        Seccion seccion= new Seccion();
        
        System.out.println("");
        System.out.println("►SECCION◄");
        seccion.setNombre("Farandula");
        
        String nombreS =seccion.getNombre();
        System.out.println("Nombre:" + nombreS);
        
        //clase Multimedia
        Multimedia multi= new Multimedia();
        
        System.out.println("");
        System.out.println("►MULTIMEDIA◄");
        
        multi.setNombre("Messi");
        multi.setTamanoByte(100);
        multi.setPath("C:/Users/Darwin Leon/Documents");
        
        String nombreM= multi.getNombre();
        System.out.println("Nombre:" + nombreM);
        
        int tamanoByte=multi.getTamanoByte();
        System.out.println("Tamaño del archivo (byte):" + tamanoByte);
        
        String path=multi.getPath();
        System.out.println("Ubicación:"+ path);
        
        
        //clase Estructura Periodico
         EstructuraPeriodico estruc =new EstructuraPeriodico();
        
        System.out.println("");
        System.out.println("►ESTRUCTURA DEL PERIODICO◄");
       
        estruc.setNomPeriodico("El Tiempo");
        estruc.setUbicacion("Baños");
        
        String nombreP = estruc.getNomPeriodico();
        System.out.println("Nombre del Periodico:"+ nombreP);
        
        String ubicacionP= estruc.getUbicacion();
        System.out.println("Ubicación:"+ ubicacionP );
        
        //clase Noticia
           Noticia noti =new Noticia();
        
        System.out.println("");
        System.out.println("►NOTICIA◄");
     
        noti.setTituloNoticia("Delfin Quispe Alcalde de Guamote");
       
       noti.setAutor("Juan Pizarro");
       noti.setLugar("Quito");
       noti.setContenido("Delfin Quispe es el nuevo alcalde de Guamote tras las elecciones 2019");
        
        String tituloN=noti.getTituloNoticia();
        System.out.println("Titulo de la Noticia:" + tituloN);
        
        String autor= noti.getAutor();
        System.out.println("Autor: " + autor);
        
        String lugar=noti.getLugar();
        System.out.println("Lugar:"+ lugar);
        
        String contenido=noti.getContenido();
        System.out.println("Contenido:" + contenido);
        
        
        
        
    }
    
}
