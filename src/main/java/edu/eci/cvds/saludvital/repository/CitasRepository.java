package edu.eci.cvds.saludvital.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface CitasRepository extends MongoRepository<Citas, string> {
    List<Citas> findbynombreUsuario(String nombreUsuario);
}