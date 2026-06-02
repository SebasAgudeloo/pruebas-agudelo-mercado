# CRITERIOS DE ACEPTACIÓN (ESTUDIANTE 1)

## Módulo: Login
* **CA-001:** Dado un usuario registrado y activo, cuando ingresa credenciales correctas en el formulario, entonces el sistema genera la sesión y lo redirige al menú principal.
* **CA-002:** Dado un usuario con contraseña incorrecta, cuando intenta iniciar sesión, entonces el sistema muestra un mensaje de error genérico en la pantalla sin revelar cuál campo es el incorrecto.
* **CA-003:** Dado un usuario con estado inactivo en la base de datos, cuando intenta iniciar sesión con sus datos correctos, entonces el sistema rechaza el acceso y muestra un mensaje de cuenta inactiva.
* **CA-004:** Dado el formulario de login, cuando el usuario da clic en "Ingresar" dejando los campos vacíos, entonces la interfaz muestra alertas visuales de validación obligatoria en el navegador sin enviar peticiones.

## Módulo Maestro: Operaciones de Creación y Listado
* **CA-005:** Dado el formulario de creación del módulo maestro, cuando se ingresan todos los campos obligatorios de forma correcta y se guarda, entonces el registro se almacena en la base de datos y aparece en el listado general.
* **CA-006:** Dado un campo obligatorio vacío en el formulario de creación, cuando se intenta guardar, entonces el sistema muestra una alerta de validación visual y bloquea el envío al servidor.
* **CA-007:** Dado un código de registro existente en la base de datos, cuando se intenta crear un nuevo registro con ese mismo código, entonces el sistema muestra un error de duplicidad de llave primaria.
* **CA-008:** Dado el acceso de un usuario autenticado a la vista del módulo maestro, cuando la base de datos contiene registros previos, entonces el sistema despliega el listado completo en una tabla organizada.
* **CA-009:** Dado un campo numérico obligatorio en la creación, cuando el usuario digita un valor negativo, entonces el sistema rechaza el formulario indicando formato de datos inválido.
* **CA-010:** Dado el proceso de guardado exitoso en el módulo maestro, cuando el servidor confirma el registro, entonces la interfaz limpia los campos del formulario y muestra un mensaje temporal de confirmación al usuario.