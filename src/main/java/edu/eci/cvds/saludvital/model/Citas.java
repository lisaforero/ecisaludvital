package edu.eci.cvds.saludvital.model;

import java.time.LocalDate;
import java.util.List;

public class Citas {
    private String nombreUsuario;
    private String documento;
    private String correo;
    private LocalDate fecha;
    private List<Especialidades> especialidad;
    private String estado;

}
