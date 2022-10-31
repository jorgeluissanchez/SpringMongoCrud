package com.rc.app.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "UsuarioPuntaje")
@Data
public class UsuarioPuntajeModel {
    @Id
    private String id;
    private String nombre;
    private Integer puntaje;
}