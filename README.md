# ForoHub API - Spring Boot 3

Este es un proyecto backend para una API de foros desarrollada como parte del **ForoHub Challenge (Back-End)** del curso **Spring Boot 3** de Alura Latam.

## 🛠 Tecnologías utilizadas

- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- Spring Security
- JWT (JSON Web Token)
- Flyway (Migraciones de base de datos)
- PostgreSQL
- Maven

## 📦 Funcionalidades

La API permite gestionar tópicos de foro, cumpliendo con las operaciones CRUD completas:

### 🔐 Autenticación

- Inicio de sesión con JWT
- Endpoints protegidos por Spring Security

### 📝 Tópicos

- `POST /login`: Iniciar sesion para obtener un JWT
- `POST /topicos`: Crear un nuevo tópico
- `GET /topicos`: Listar todos los tópicos (paginado)
- `GET /topicos/{id}`: Obtener un tópico por ID
- `PUT /topicos/{id}`: Actualizar un tópico existente
- `DELETE /topicos/{id}`: Eliminar un tópico (delete físico)

## 🧪 Validaciones

- Todos los campos son validados con anotaciones de `javax.validation` (@NotNull, @NotBlank, etc).
- Se evita el registro de tópicos duplicados por título y mensaje.

## 🔄 Migraciones con Flyway

Las migraciones de base de datos se controlan desde la carpeta `src/main/resources/db/migration` utilizando Flyway.  
Cada versión crea o actualiza la estructura de tablas del proyecto.

## 🧰 Requisitos

- Java 17
- PostgreSQL
- Maven
