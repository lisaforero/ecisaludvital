package edu.eci.cvds.saludvital.service;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CitasServiceTest {
    private CitasRepository citasRepository;
    private CitasService citasService;

    @BeforeEach
    void setUp() {
        citasRepository = mock(CitasRepository.class);
        citasService = new CitasService(citasRepository);
    }

    @Test
    void testConsultaCitasPorUsuario() {
        String userId = "usuario1";
        when(citasRepository.findBynombreUsuario(nombreUsuario)).thenReturn(List.of(new Citas(), new Citas()));

        List<Citas> citas = citasService.consultarCitas(nombreUsuario);
        assertEquals(2, citas.size());
    }
}
