# ForoHub API - Spring Boot 3

## 🚀 Descripción

Este es un proyecto backend para una API de foros desarrollada como parte del **ForoHub Challenge (Back-End)** del curso **Spring Boot 3** de **Alura Latam**.

La aplicación permite gestionar tópicos de discusión en un foro, con autenticación segura, validaciones, y persistencia de datos en PostgreSQL, siguiendo buenas prácticas de desarrollo con Spring Boot 3.

---

## 🛠 Tecnologías utilizadas

- Java 17  
- Spring Boot 3  
- Spring Web  
- Spring Data JPA  
- Spring Security  
- JWT (JSON Web Token)  
- Flyway (migraciones de base de datos)  
- PostgreSQL  
- Maven  

---

## 📦 Funcionalidades principales

### 🔐 Autenticación  
- Inicio de sesión mediante JWT  
- Endpoints protegidos con Spring Security

### 📝 Gestión de Tópicos  
- `POST /login`: Iniciar sesión y obtener un JWT  
- `POST /topicos`: Crear un nuevo tópico  
- `GET /topicos`: Listar tópicos (paginado)  
- `GET /topicos/{id}`: Ver detalle de un tópico  
- `PUT /topicos/{id}`: Actualizar un tópico  
- `DELETE /topicos/{id}`: Eliminar un tópico  

### ✅ Validaciones  
- Validaciones con anotaciones de `javax.validation` (`@NotNull`, `@NotBlank`, etc.)  
- Evita duplicación de títulos y mensajes de tópicos  

### 🔄 Migraciones con Flyway  
- La estructura de la base de datos se versiona con scripts en `src/main/resources/db/migration`  
- Cada cambio en la estructura se gestiona con un archivo de migración incremental

---

## 🧰 Requisitos

- Java 17  
- PostgreSQL  
- Maven  

---

## 🧪 Cómo ejecutar el proyecto

1. **Clonar el repositorio**

```bash
git clone https://github.com/Scott505/desafio_backend_topicos.git
```

2. **Abrir en tu IDE favorito**
   Yo utilize IntelliJ

3. **Configurar la base de datos**
En el archivo src/main/resources/application.properties, asegurate de tener configurados correctamente los datos de conexión a tu base PostgreSQL:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/desafio_backend
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
```

5. **Ejecutar la aplicacion**
6. **Crear manualmente el usuario administrador en la base de datos:**
   La contraseña debe estar hasheada usando **BCrypt**, que es el algoritmo utilizado en este proyecto.  
   Podés generar el hash de tu contraseña con esta herramienta online: [https://bcrypt-generator.com/](https://bcrypt-generator.com/)  

   Luego, insertá el usuario con el password hasheado en la tabla `usuarios`.

   O podes usar el siguiente ejemplo:

   ```sql
   INSERT INTO usuarios (login, contraseña) VALUES ('admin', '$2a$10$Y50UaMFOxteibQEYLrwuHeehHYfcoafCopUazP12.rqB41bsolF5.');
   ```
7. **Probar login con Postman o Insomnia**

   Realizá una petición POST a ´/login´ siguiendo con el ejemplo:

  ```json
   {
  "login": "admin",
  "contraseña": "123456"
}
```

   Recibirás un token JWT para usar en los headers Authorization del resto de los endpoints.


---

## 📘 Documentación

Podés acceder a Swagger en:  
http://localhost:8080/swagger-ui.html

---

## 🙌 Créditos

Desarrollado por [Scott505](https://github.com/Scott505) como parte del programa **Oracle Next Education (ONE)** - Back-End Java - **Alura Latam**.
