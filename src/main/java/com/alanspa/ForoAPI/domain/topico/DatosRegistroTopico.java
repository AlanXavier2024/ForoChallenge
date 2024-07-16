package com.alanspa.ForoAPI.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRegistroTopico(


        @NotBlank
        String  titulo,
        @NotBlank
        String  mensaje,
        LocalDateTime fechaCreacion,
        @NotNull
        Estatus estatus,
        @NotBlank
        String autor,
        @NotBlank
        String curso,
        @NotNull
        int respuestas

) {
}
