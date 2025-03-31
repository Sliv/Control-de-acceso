package Modelo;

import java.util.ArrayList;

public class ControldeAcceso {
 private ArrayList<Solicitud> Solicitudes;

    public ControldeAcceso(ArrayList<Solicitud> Solicitudes) {
        this.Solicitudes = Solicitudes;
    }
    
    public Solicitud registrarSolicitud(Usuario Usuario, String tipoSolicitud) {
        if (!tipoSolicitud.equalsIgnoreCase("Ingreso") && !tipoSolicitud.equalsIgnoreCase("Egreso")) {
            throw new IllegalArgumentException("El tipo de solicitud debe ser 'Ingreso' o 'Egreso'");
        }
        Solicitud Solicitud = new Solicitud(Usuario, tipoSolicitud);
        Solicitudes.add(Solicitud);
        return Solicitud;
    }

    public void mostrarSolicitudes() {
        for (Solicitud solicitud : Solicitudes) {
            System.out.println(solicitud);
        }
    }
}
