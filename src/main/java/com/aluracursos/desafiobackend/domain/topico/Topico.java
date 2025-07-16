package com.aluracursos.desafiobackend.domain.topico;


import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "topicos")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;
    private String autor;
    private String curso;

    public Topico(DatosRegistroTopico datos) {
        this.titulo = datos.titulo();
        this.mensaje = datos.mensaje();
        this.autor = datos.autor();
        this.curso = datos.curso();
        this.fechaCreacion = LocalDateTime.now();
    }

    public void actualizarInformacion(@Valid DatosActualizarTopico datos) {
        if (datos.titulo() !=null) {
            this.titulo = datos.titulo();
        }
        if (datos.mensaje() !=null) {
            this.mensaje = datos.mensaje();
        }
        if (datos.autor() !=null) {
            this.autor = datos.autor();
        }
        if (datos.curso() !=null) {
            this.curso = datos.curso();
        }
    }
}
