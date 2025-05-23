package edu.eci.cvds.saludvital.controller;

import edu.eci.cvds.saludvital.model.Citas;
import edu.eci.cvds.saludvital.service.CitasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestController
@RequestMapping("/citas")
public class CitasController {
    @Autowired
    private CitasService citasService;

    @GetMapping("/usuario/{nombreUsuario}")
    public List<Citas> consultar(@PathVariable String nombreUsuario) {
        return citasService.consultarCitas(nombreUsuario);
    }
}