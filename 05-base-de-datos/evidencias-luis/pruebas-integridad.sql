-- PASO 3: Campos obligatorios

SELECT *
FROM docente_estudiante
WHERE id_docente IS NULL
   OR id_estudiante IS NULL
   OR estado IS NULL;

-- PASO 4: Estados inválidos

SELECT *
FROM docente_estudiante
WHERE estado NOT IN ('ACTIVA','FINALIZADA','SUSPENDIDA');

-- PASO 5: Resumen general de integridad

SELECT
(
SELECT COUNT(*)
FROM docente_estudiante
WHERE id_docente IS NULL
OR id_estudiante IS NULL
OR estado IS NULL
) AS errores_campos_obligatorios,

(
SELECT COUNT(*)
FROM docente_estudiante
WHERE estado NOT IN ('ACTIVA','FINALIZADA','SUSPENDIDA')
) AS errores_estado;