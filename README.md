# 🧪 Proyecto de Aseguramiento de la Calidad de Software - SumixKids

Este repositorio contiene la arquitectura de diseño, planificación y ejecución de pruebas de software para la plataforma **SumixKids** (Desarrollada en **Java Vanilla / Servlets / JSP / JPA**).

## 📊 Matriz de Responsabilidades por Estudiante

El aseguramiento de la calidad del sistema se estructuró dividiendo el alcance técnico de forma equitativa. La planificación inicial fue co-diseñada (`plan-de-pruebas.md` y `criterios-aceptacion.md`), estableciendo el camino para que cada estudiante ejecute sus fases de la siguiente manera:

| Componente / Fase | 👤 Sebastián Agudelo Mercado (Este Repositorio) | 👥 Estudiante 2 (Complemento del Repositorio) |
| :--- | :--- | :--- |
| **Módulo / Enfoque** | **Módulo de Login** (Control de Acceso y Seguridad) + Mitad de Módulo Maestro (Creación/Listado) | **Módulo Transaccional** + Mitad de Módulo Maestro (Modificación/Eliminación - CRUD) |
| **Fase 1: Planificación** | Co-diseño global y escenarios **CA-001 al CA-004** | Complemento de riesgos, tipos de prueba y escenarios **CA-005 al CA-010** / Transaccionales |
| **Fase 2: Pruebas Unitarias** | **Ejecutado (Módulo Login):** Pruebas de lógica y validación con **JUnit 5** | **Por Integrar:** `MaestroUpdateDeleteTest.java` y `TransaccionalTest.java` |
| **Fase 3: Pruebas Funcionales**| **Ejecutado (Módulo Login):** Automatización de interfaz con **Katalon** | **Por Integrar:** Casos funcionales complementarios (Edición, borrado y flujos transaccionales) |
| **Fase 4: Pruebas de API** | **Ejecutado (Módulo Login):** Endpoint de autenticación en **Postman** (200 OK y flujo 2FA) | **Por Integrar:** Requests HTTP de actualización, borrado y transacciones en la colección |
| **Fases Posteriores** | Soporte de infraestructura base del repositorio | **Por Integrar:** Fase 5 (Base de datos), Fase 6 (OWASP ZAP) y Fase 7 (Reporte y Video Conjunto) |

---

## 📁 Estructura de Entregables Actuales

### 📑 01-planificacion
* **Archivos:** `plan-de-pruebas.md` y `criterios-aceptacion.md`.
* **Contenido:** Plan general de la plataforma y el consolidado de los criterios de aceptación iniciales de ambos módulos.

### 💻 02-pruebas-unitarias
* **Contenido:** Código de pruebas automatizadas de caja blanca utilizando **JUnit 5**, verificando de forma estricta las validaciones del Servlet de autenticación del Login.

### 🤖 03-pruebas-funcionales
* **Contenido:** Automatización del flujo del Login en las vistas JSP mediante el archivo `.krecorder` de Katalon y sus evidencias visuales en Chrome.

### 🔌 04-pruebas-api
* **Contenido:** Colección exportada de **Postman** (`.json`) que testea el endpoint del Servlet de inicio de sesión, logrando la respuesta **HTTP 200 OK** y disparando el flujo de doble factor (2FA) al correo electrónico.

---

## 👥 Información Institucional

**Estudiante Ejecutor (Login):** Sebastián Agudelo  
**Estudiante Co-desarrollador (Transaccional):** Luis Mercado  
**Institución Universitaria:** UNIREMINGTON  
**Materia:** Aseguramiento de la Calidad de Software  
**Fecha de Cierre Parcial:** Junio de 2026