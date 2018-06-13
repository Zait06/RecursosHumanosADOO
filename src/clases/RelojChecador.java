
package clases;

import java.sql.Date;

/**
 * @author Luis Tapia
 */
public class RelojChecador {
    
    private int Hora;
    private Date Fecha;

    public RelojChecador(int Hora, Date Fecha) {
        this.Hora = Hora;
        this.Fecha = Fecha;
    }

    public int getHora() {
        return Hora;
    }

    public void setHora(int Hora) {
        this.Hora = Hora;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
    public void VerificarEmpleado(){
    }
    
    public void GuardaHora(){
    }
    
    
}
