package clases;

/**
 * @author Luis Tapia
 */
public class Empleado extends Persona{
    
    private boolean TarjetaNFC;
    private long IDempleado;
    private int Sueldo;
    private String Cargo;
    private String Fechaingreso;

    public Empleado(boolean TarjetaNFC, long IDempleado, int Sueldo, String Cargo, String Fechaingreso) {
        this.TarjetaNFC = TarjetaNFC;
        this.IDempleado = IDempleado;
        this.Sueldo = Sueldo;
        this.Cargo = Cargo;
        this.Fechaingreso = Fechaingreso;
    }

    public boolean isTarjetaNFC() {
        return TarjetaNFC;
    }

    public void setTarjetaNFC(boolean TarjetaNFC) {
        this.TarjetaNFC = TarjetaNFC;
    }

    public long getIDempleado() {
        return IDempleado;
    }

    public void setIDempleado(long IDempleado) {
        this.IDempleado = IDempleado;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getFechaingreso() {
        return Fechaingreso;
    }

    public void setFechaingreso(String Fechaingreso) {
        this.Fechaingreso = Fechaingreso;
    }
    
    
    
    public void RealizarSolicitud(){
    }
    
        
    public void PresentarTarjeta(){
    }
    
        
    public void MostrarDatos(){
    }
    
        
    public void MostrarHorario(){
    }
    
       
    public void RegistroHora(){
    }
    
    
}
