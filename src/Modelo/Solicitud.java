package Modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Solicitud {

    private Usuario Usuario;
    private String tipoSolicitud; 
    private LocalDate fechaSolicitud;
    private LocalTime horaSolicitud; 

    public Solicitud(Usuario Usuario, String tipoSolicitud, LocalDate fechaSolicitud, LocalTime horaSolicitud) {
        this.Usuario = Usuario;
        this.tipoSolicitud = tipoSolicitud;
        this.fechaSolicitud = fechaSolicitud;
        this.horaSolicitud = horaSolicitud;
    }
    public Solicitud(Usuario Usuario, String tipoSolicitud) {
        this.Usuario = Usuario;
        this.tipoSolicitud = tipoSolicitud;
        this.fechaSolicitud = LocalDate.now();
        this.horaSolicitud = LocalTime.now();
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    public LocalDate getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDate fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public LocalTime getHoraSolicitud() {
        return horaSolicitud;
    }

    public void setHoraSolicitud(LocalTime horaSolicitud) {
        this.horaSolicitud = horaSolicitud;
    }
    
    @Override
    public String toString() {
        return "Solicitud de " + tipoSolicitud + " de " + Usuario + " el " + fechaSolicitud + " a las " + horaSolicitud;
    }
    
}
