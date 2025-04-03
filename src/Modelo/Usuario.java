package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
    private int idUsuario;
    private String Nombre, Apellido;
    private String Email;
    private String Password;
    private String codigoQR; // Esto se va a tener que cambiar.
    private boolean accesoHabilitado;
    private LocalDate fechaRegistro;
    private ArrayList<Roles> Roles; 

    public Usuario(int idUsuario, String Nombre, String Apellido, String codigoQR, LocalDate fechaRegistro, String Email, String Password, ArrayList<Roles> Roles) {
        this.idUsuario = idUsuario;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.codigoQR = codigoQR;
        this.fechaRegistro = fechaRegistro;
        this.Password = Password;
        this.Roles = Roles;
    }
    
    public void crearCuenta() {
    
    }
    
    public void Login() {
    
    }
    
    public void Logout() {
        
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public ArrayList<Roles> getRoles() {
        return Roles;
    }

    public void setRoles(ArrayList<Roles> Roles) {
        this.Roles = Roles;
    }
}
