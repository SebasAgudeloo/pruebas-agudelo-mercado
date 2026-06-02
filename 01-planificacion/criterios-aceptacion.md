# CRITERIOS DE ACEPTACIÓN (PROYECTO CONJUNTO)

## Módulo 1: Login (Sebastián Agudelo)
* **CA-001:** Dado un usuario registrado y activo, cuando ingresa credenciales correctas en el formulario, entonces el sistema genera la sesión y lo redirige al menú principal.
* **CA-002:** Dado un usuario con contraseña incorrecta, cuando intenta iniciar sesión, entonces el sistema muestra un mensaje de error genérico en la pantalla sin revelar cuál campo es el incorrecto.
* **CA-003:** Dado un usuario con estado inactivo en la base de datos, cuando intenta iniciar sesión con sus datos correctos, entonces el sistema rechaza el acceso y muestra un mensaje de cuenta inactiva.
* **CA-004:** Dado el formulario de login, cuando el usuario da clic en "Ingresar" dejando los campos vacíos, entonces la interfaz muestra alertas visuales de validación obligatoria en el navegador sin enviar peticiones.

## Módulo 2: Maestro - Operaciones de Creación y Listado (Sebastián Agudelo)
* **CA-005:** Dado el formulario de creación del módulo maestro, cuando se ingresan todos los campos obligatorios de forma correcta y se guarda, entonces el registro se almacena en la base de datos y aparece en el listado general.
* **CA-006:** Dado un campo obligatorio vacío en el formulario de creación, cuando se intenta guardar, entonces el sistema muestra una alerta de validación visual y bloquea el envío al servidor.
* **CA-007:** Dado un código de registro existente en la base de datos, cuando se intenta crear un nuevo registro con ese mismo código, entonces el sistema muestra un error de duplicidad de llave primaria.
* **CA-008:** Dado el acceso de un usuario autenticado a la vista del módulo maestro, cuando la base de datos contiene registros previos, entonces el sistema despliega el listado completo en una tabla organizada.
* **CA-009:** Dado un campo numérico obligatorio en la creación, cuando el usuario digita un valor negativo, entonces el sistema rechaza el formulario indicando formato de datos inválido.
* **CA-010:** Dado el proceso de guardado exitoso en el módulo maestro, cuando el servidor confirma el registro, entonces la interfaz limpia los campos del formulario y muestra un mensaje temporal de confirmación al usuario.

## Módulo 3: Transaccional y Modificaciones CRUD (Luis Mercado)
* **CA-011:** Dado el formulario transaccional completo, cuando se confirma la operación con datos válidos, entonces el sistema registra la transacción y actualiza los saldos en la base de datos con estado COMPLETADA.
* **CA-012:** Dado un monto negativo o cero en el formulario transaccional, cuando se intenta procesar, entonces el sistema rechaza la operación con un mensaje de validación en pantalla.
* **CA-013:** Dado un usuario sin sesión activa, cuando intenta acceder al módulo transaccional directamente mediante la URL, entonces el sistema lo intercepta y lo redirige al formulario de Login.
* **CA-014:** Dado el formulario transaccional, cuando se intenta confirmar dejando campos obligatorios vacíos, entonces el sistema muestra alertas visuales y no procesa la transacción en el servidor.
* **CA-015:** Dado un registro del módulo maestro en uso por una transacción activa, cuando se intenta eliminar, entonces el sistema impide el borrado físico y muestra un mensaje de restricción por integridad.
* **CA-016:** Dado un registro del módulo maestro existente, cuando se modifican sus campos válidos y se guarda, entonces los cambios se reflejan inmediatamente en el listado y en la base de datos.
* **CA-017:** Dado un registro del módulo maestro sin ninguna dependencia transaccional, cuando se ejecuta la acción de eliminar, entonces el registro se remueve de forma lógica/física de la base de datos.
* **CA-018:** Dado un fallo inesperado de conexión a la base de datos durante el envío de una transacción, cuando el proceso se interrumpe, entonces el sistema ejecuta un ROLLBACK garantizando la atomicidad.
* **CA-019:** Dado el registro exitoso de una transacción, cuando se consulta la base de datos en MySQL Workbench, entonces la fila existe con los IDs de usuario y maestro correctos.
* **CA-020:** Dado el intento de registrar una transacción, cuando el ID del registro maestro asociado no existe en la base de datos, entonces el sistema rechaza la operación por fallo de integridad referencial.