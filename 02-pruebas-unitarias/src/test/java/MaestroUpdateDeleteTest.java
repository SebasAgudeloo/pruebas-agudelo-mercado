import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaestroUpdateDeleteTest {

@Test
void actualizarUsuarioConDatosValidos() {
    Usuario usuario = new Usuario();

    usuario.setId(1);
    usuario.setNombres("Luis");
    usuario.setApellidos("Mercado");

    assertEquals("Luis", usuario.getNombres());
    assertEquals("Mercado", usuario.getApellidos());
}

@Test
void actualizarCorreoValido() {
    Usuario usuario = new Usuario();

    usuario.setEmail("correo@test.com");

    assertTrue(usuario.getEmail().contains("@"));
}

@Test
void cambiarEstadoUsuario() {
    Usuario usuario = new Usuario();

    usuario.setBloqueado(true);

    assertTrue(usuario.getBloqueado());
}

@Test
void usuarioTieneIdValido() {
    Usuario usuario = new Usuario();

    usuario.setId(10);

    assertTrue(usuario.getId() > 0);
}

@Test
void validarNombreNoVacio() {
    Usuario usuario = new Usuario();

    usuario.setNombres("Carlos");

    assertFalse(usuario.getNombres().isEmpty());
}

}
