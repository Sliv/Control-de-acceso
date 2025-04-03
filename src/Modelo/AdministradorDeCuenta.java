package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class AdministradorDeCuenta extends Usuario {
    
    public AdministradorDeCuenta(int idUsuario, String Nombre, String Apellido, String codigoQR, LocalDate fechaRegistro, String Email, String Password, ArrayList<Modelo.Roles> Roles) {
        super(idUsuario, Nombre, Apellido, codigoQR, fechaRegistro, Email, Password, Roles);
    }
    
    public void borrarCuenta(Usuario Usuario) {
        
    }
    
    public void modificarCuenta(Usuario Usuario) {
        
    }
    
    public void registrarCuenta(Usuario Usuario) {
        
    }
}
