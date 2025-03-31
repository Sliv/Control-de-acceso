package Modelo;

public class Molinete {
    private int idMolinete;
    private String Ubicacion; 

    // Constructor
    public Molinete(int idMolinete, String Ubicacion) {
        this.idMolinete = idMolinete;
        this.Ubicacion = Ubicacion;
    }

    // Método para validar el acceso
    public boolean validarAcceso(Usuario Usuario) {
        // Obtener los roles y permisos del usuario y verificar si tiene permiso para acceder
        for (Roles rol : Usuario.getRoles()) {
            // Dependiendo del rol, el usuario tendrá acceso a diferentes zonas
            if (rol.equals("PROFESOR")) {
                // Los profesores pueden acceder a todas las zonas
                return true;
            }
            if (rol.equals("ESTUDIANTE")) {
                // Los estudiantes solo pueden acceder a ciertas zonas
                if (this.Ubicacion.equalsIgnoreCase("Acceso a laboratorios")) {
                    return false; // Por ejemplo, no pueden acceder al laboratorio
                }
                return true; // Tienen acceso a otras zonas
            }
            if (rol.equals("LIMPIEZA")) {
                // Los empleados de limpieza pueden acceder solo a ciertas zonas
                if (this.Ubicacion.equalsIgnoreCase("Acceso a oficinas")) {
                    return false;
                }
                return true; // Acceso a otras zonas
            }
        }
        return false; // No tiene un rol válido o no cumple las condiciones
    }

    // Getters y setters
    public int getIdMolinete() {
        return idMolinete;
    }

    public void setIdMolinete(int idMolinete) {
        this.idMolinete = idMolinete;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
}
