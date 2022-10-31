package com.rc.app.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "PreguntaRespuesta")
@Data
public class PreguntaRespuestaModel {
    @Id
    private String id;
    private String pregunta;
    private String[] respuestas;
    private Integer respuestaCorrecta;
}
