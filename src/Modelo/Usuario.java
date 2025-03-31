package Modelo;

import java.util.ArrayList;

public class Usuario {
    private int idUsuario;
    private String Nombre;
    private String Email;
    private String Password;
    private ArrayList<Roles> Roles; 

    // Constructor
    public Usuario(int idUsuario, String Nombre, String Email, String Password, ArrayList<Roles> Roles) {
        this.idUsuario = idUsuario;
        this.Nombre = Nombre;
        this.Email = Email;
        this.Password = Password;
        this.Roles = Roles;
    }

    // Getters y setters
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
