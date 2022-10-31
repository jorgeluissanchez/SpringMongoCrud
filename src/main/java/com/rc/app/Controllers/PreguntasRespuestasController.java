package com.rc.app.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.rc.app.Models.PreguntaRespuestaModel;
import com.rc.app.Services.PreguntaRespuestaService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/pregunta-respuesta")
@RequiredArgsConstructor
public class PreguntasRespuestasController {
    private final PreguntaRespuestaService preguntaRespuestaService;

    @GetMapping()
    public List<PreguntaRespuestaModel> obtenerPreguntasRespuestas(){
        return this.preguntaRespuestaService.obtenerPreguntasRespuestas();
    }

    @PostMapping()
    public void guardarPreguntaRespuesta(@RequestBody PreguntaRespuestaModel preguntaRespuesta){
        this.preguntaRespuestaService.guardarPreguntaRespuesta(preguntaRespuesta);
    }

    @DeleteMapping("/{id}")
    public void eliminarPreguntaRespuestaPorId(@RequestParam String id){
        this.preguntaRespuestaService.eliminarPreguntaRespuestaPorId(id);
    }
}