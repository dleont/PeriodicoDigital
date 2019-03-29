
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author Darwin
 */
public class EstructuraPeriodico {
    
    private String nomPeriodico;
    private String ubicacion;
    private Date fecha;

    //set´s
    public void setNomPeriodico(String nomPeriodico) {
        this.nomPeriodico = nomPeriodico;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    //get´s
    public String getNomPeriodico() {
        return this.nomPeriodico;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public Date getFecha() {
        return this.fecha;
    }
    
    
}
