import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class TransaccionalTest {

@Test
void crearAsignacionValida() {

    Asignacion asignacion = new Asignacion();

    asignacion.setIdDocente(1);
    asignacion.setIdEstudiante(2);

    assertEquals(1, asignacion.getIdDocente());
    assertEquals(2, asignacion.getIdEstudiante());
}

@Test
void asignacionTieneFecha() {

    Asignacion asignacion = new Asignacion();

    asignacion.setFechaAsignacion(LocalDateTime.now());

    assertNotNull(asignacion.getFechaAsignacion());
}

@Test
void estadoAsignacionActiva() {

    Asignacion asignacion = new Asignacion();

    asignacion.setEstado("ACTIVA");

    assertEquals("ACTIVA", asignacion.getEstado());
}

@Test
void observacionNoNula() {

    Asignacion asignacion = new Asignacion();

    asignacion.setObservaciones("Prueba");

    assertNotNull(asignacion.getObservaciones());
}

@Test
void validarDocenteAsignado() {

    Asignacion asignacion = new Asignacion();

    asignacion.setIdDocente(5);

    assertTrue(asignacion.getIdDocente() > 0);
}

}
