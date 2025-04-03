package Modelo;

public class Molinete {
    static private boolean Estado;
    static private int IDMolinete;
    private String Ubicacion; 

    public Molinete(int idMolinete, String Ubicacion) {
        this.Estado = false;
        this.IDMolinete = idMolinete;
        this.Ubicacion = Ubicacion;
    }

    public boolean validarAcceso(Usuario Usuario) {
 
        return false; 
    }
    
    static public void Abrir() {
        Estado = true;
        System.out.println("Molinete abierto.");
    }
    
    static public void Cerrar() {
        Estado = false;
        System.out.println("Molinete cerrado.");
    }
   
    public int getIdMolinete() {
        return IDMolinete;
    }

    public void setIdMolinete(int idMolinete) {
        this.IDMolinete = idMolinete;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public boolean getEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
}
