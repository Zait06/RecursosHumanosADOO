
package clases;

/**
 * @author Luis Tapia
 */
public class RecursosHumanos extends Persona{
    
    private String Usuario;
    private String Contra;

    public RecursosHumanos(String Usuario, String Contra) {
        this.Usuario = Usuario;
        this.Contra = Contra;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }
    
    public void RegistrarEmpleado(){
    }
    
    public void AsignarCargoEmpleado(){
    }
    
    public void ConsultarRegistro(){
    }
    
    public void ImprimirReporte(){
    }
    
    public void AdministrarRegistro(){
    }
    
}
