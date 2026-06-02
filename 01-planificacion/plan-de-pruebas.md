# PLAN DE PRUEBAS - PROYECTO JAVA VANILLA

## 1. Descripción General del Sistema
Sistema web desarrollado en el lenguaje Java utilizando Servlets, JSP para las vistas del frontend y JPA (Hibernate) para la persistencia y conexión de datos. La plataforma gestiona los procesos de control de acceso, administración de catálogos maestros y operaciones transaccionales para SumixKids.

## 2. Alcance de las Pruebas
* **Módulos que se van a probar:** Módulo de Login (control de acceso y seguridad), Módulo Maestro (Funciones CRUD completas: creación, listado, edición y borrado) y Módulo Transaccional (registro de operaciones, validación de montos y estados).
* **Módulos que NO se van a probar en esta etapa:** Despliegue en servidores en la nube de producción (todo se probará en ambiente de staging local).

## 3. Ambiente de Prueba
* **Sistema Operativo:** Windows 10 / Windows 11.
* **Navegador Web:** Google Chrome (Última versión estable).
* **Entorno de Ejecución:** Servidor local Apache Tomcat (configurado mediante XAMPP).
* **Base de Datos:** MySQL Server 8.0 / MariaDB.
* **Versión de Java:** Java JDK 11 o JDK 17.

## 4. Tipos de Prueba a Ejecutar
* **Pruebas Unitarias:** Caja blanca enfocada en la lógica del backend mediante JUnit 5.
* **Pruebas Funcionales:** Caja negra automatizada de extremo a extremo a través de Selenium/Katalon.
* **Pruebas de API:** Validación de endpoints, respuestas HTTP y contratos JSON con Postman.
* **Pruebas de Base de Datos:** Verificación de integridad, restricciones de llaves y atomicidad (COMMIT/ROLLBACK) en MySQL Workbench.
* **Pruebas de Seguridad:** Escaneo de vulnerabilidades web con OWASP ZAP.

## 5. Matriz de Riesgos y Mitigación
| Riesgo Identificado | Impacto | Estrategia de Mitigación |
| :--- | :--- | :--- |
| Desalineación en los nombres de las tablas en los scripts SQL de prueba. | Alto | Mapear la estructura real mediante comandos `DESCRIBE` antes de la ejecución de los inserts. |
| Fallos en la captura de marcas de tiempo en las evidencias visuales. | Medio | Configurar la barra de tareas del sistema operativo para que sea visible en todas las capturas. |
| Incompatibilidad de versiones de Java o Tomcat entre los entornos locales de la dupla. | Alto | Estandarizar el uso exclusivo de Java JDK 11/17 y Tomcat local vía XAMPP en ambas máquinas. |