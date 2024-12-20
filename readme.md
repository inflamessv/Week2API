# Semana 2: Introducción y Desarrollo Básico con Spring Boot

## Día 1: Fundamentos de Spring Boot

### ¿Qué es Spring Boot?
- Introducción al ecosistema de Spring.
- Ventajas de usar Spring Boot.
- Comparación con frameworks tradicionales.

### Creación de un proyecto Spring Boot
- Uso de Spring Initializr.
- Estructura básica de un proyecto Spring Boot.
- Configuración del archivo `application.properties`.

### Ejecución de la aplicación
- Uso del Spring Boot Maven Plugin.
- Ejecución con `mvn spring-boot:run` o desde IntelliJ.

---

## Día 2: Arquitectura de Spring Boot

### Arquitectura de capas
- **Controller:** Manejo de solicitudes HTTP.
- **Service:** Lógica de negocio.
- **Repository:** Acceso a la base de datos.
- **Entity:** Representación de tablas y objetos.

### Controladores y peticiones HTTP
- Anotaciones básicas: `@RestController`, `@RequestMapping`, `@GetMapping`, `@PostMapping`.
- Crear y responder peticiones básicas (JSON).

### Introducción a JSON y Jackson
- Conversión automática entre objetos Java y JSON.
- Configuración básica de Jackson.

---

## Día 3: Configuración y Dependencias

### Configuración de propiedades
- Uso de `application.properties` o `application.yml`.
- Configurar puerto, contexto de la aplicación, entre otros.

### Gestión de dependencias con Maven
- Introducción al archivo `pom.xml`.
- Uso de dependencias comunes:
    - `spring-boot-starter-web` (Web).
    - `spring-boot-starter-data-jpa` (Base de datos).

### Introducción a H2 Database
- Configuración de una base de datos en memoria.
- Exploración del H2 Console (`spring.h2.console.enabled=true`).

---

## Día 4: Persistencia de Datos con JPA

### Introducción a Spring Data JPA
- Configuración de JPA.
- Anotaciones básicas de JPA:
    - `@Entity`, `@Id`, `@GeneratedValue`, `@Column`.

### Creación de Repositories
- Uso de `JpaRepository` para operaciones CRUD.
- Ejemplo práctico: Crear, leer, actualizar y borrar datos.

### Conexión de datos y controladores
- Integrar **Service** y **Repository** en un controlador.
- Ejemplo práctico: Crear endpoints CRUD básicos.

### Conceptos básicos de paginación
- Qué es la paginación y por qué es necesaria.
- Beneficios de paginar datos en APIs REST.
- Implementación con Spring Data JPA

### Uso de Pageable y PageRequest.
- Configuración de parámetros de paginación (size, page).
- Ordenamiento con Sort.

---

## Día 5: Validación de Datos

### Introducción a Bean Validation
- Configurar validaciones con Hibernate Validator.
- Uso de anotaciones como:
    - `@NotNull`, `@NotBlank`, `@Size`, `@Email`.

### Validación en controladores
- Uso de `@Valid` en el `@RequestBody`.
- Manejo de errores de validación.

### Manejo global de excepciones
- Implementar `@ControllerAdvice` y `@ExceptionHandler`.
- Personalizar respuestas de error.

---

## Día 6: Práctica guiada

### Proyecto práctico: CRUD de una entidad
- Implementar una API REST básica con:
    - Endpoints para operaciones CRUD.
    - Validación de entradas.
    - Persistencia en H2 Database.

### Pruebas básicas
- Ejecutar pruebas manuales con Postman.
- Validar funcionamiento de endpoints.

---

## Día 7: Consolidación y evaluación

### Revisión de conceptos
- Arquitectura de capas.
- Uso de controladores, servicios y repositorios.
- Persistencia con JPA y H2.

### Pruebas del proyecto
- Probar la API implementada en Postman.

### Evaluación de la semana
- Resolver ejercicios prácticos:
    - Crear una entidad adicional.
    - Agregar validaciones personalizadas.
    - Implementar manejo de excepciones globales.

---

## Entregables de la Semana 2
- Una API REST funcional con operaciones CRUD para una entidad.
- Validación de datos en las peticiones.
- Configuración de persistencia en H2 Database.
