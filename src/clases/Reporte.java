
package clases;

import java.sql.Date;

/**
 * @author Luis Tapia
 */

public class Reporte {
    
    private String NombreReporte;
    private int Hora;
    private Date Fecha;

    public Reporte(String NombreReporte, int Hora, Date Fecha) {
        this.NombreReporte = NombreReporte;
        this.Hora = Hora;
        this.Fecha = Fecha;
    }

    public String getNombreReporte() {
        return NombreReporte;
    }

    public void setNombreReporte(String NombreReporte) {
        this.NombreReporte = NombreReporte;
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
    
    public void BuscarEmpleado(){
    }
    
    public void ConsultarHoras(){
    }
    
    public void GenerarReporte(){
    }
    
}
