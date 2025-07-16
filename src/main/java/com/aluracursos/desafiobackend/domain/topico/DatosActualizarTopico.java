package com.aluracursos.desafiobackend.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico (
        String titulo,
        String mensaje,
        String autor,
        String curso
){
}
