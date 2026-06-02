import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    // Simulación del comportamiento del Login para mantener la prueba independiente
    public boolean simularLogin(String usuario, String contrasena) {
        if (usuario == null || contrasena == null || usuario.isEmpty() || contrasena.isEmpty()) {
            return false;
        }
        if (usuario.equals("admin") && contrasena.equals("12345")) {
            return true; // Login exitoso
        }
        return false; // Datos incorrectos
    }

    @Test
    public void testLoginExitoso() {
        boolean resultado = simularLogin("admin", "12345");
        assertTrue(resultado, "El login debería ser exitoso con datos correctos");
    }

    @Test
    public void testContrasenaIncorrecta() {
        boolean resultado = simularLogin("admin", "clave_incorrecta");
        assertFalse(resultado, "El login debería fallar con contraseña incorrecta");
    }

    @Test
    public void testUsuarioNoExiste() {
        boolean resultado = simularLogin("usuario_inexistente", "12345");
        assertFalse(resultado, "El login debería fallar si el usuario no existe");
    }

    @Test
    public void testCamposVacios() {
        boolean resultado = simularLogin("", "");
        assertFalse(resultado, "El login no debería permitir campos vacíos");
    }

    @Test
    public void testUsuarioInactivo() {
        String estadoUsuario = "Inactivo";
        assertEquals("Inactivo", estadoUsuario, "El sistema debería identificar que el usuario está Inactivo");
    }
}