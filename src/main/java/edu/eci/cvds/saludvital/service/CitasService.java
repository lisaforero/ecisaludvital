package edu.eci.cvds.saludvital.service;

import edu.eci.cvds.saludvital.repository.CitasRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitasService {
     private final CitasRepository citasRepository;

    @Autowired
    public CitasService(CitasRepository citasRepository) {
        this.citasRepository = citasRepository;
    }



    public List<Citas> consultarCitas(String nombreUsuario) {
        return citasRepository.findbynombreUsuario(nombreUsuario);
    }

}