package com.alanspa.ForoAPI.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(
        Long id,
        String  titulo,
        String  mensaje,
        LocalDateTime fechaCreacion,
        String autor,
        String curso
) {
}
