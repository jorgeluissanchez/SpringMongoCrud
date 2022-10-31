package com.rc.app.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rc.app.Models.PreguntaRespuestaModel;
import com.rc.app.Repositories.PreguntaRespuestaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PreguntaRespuestaService {
    private final PreguntaRespuestaRepository preguntaRespuestaRepository;

    public List<PreguntaRespuestaModel> obtenerPreguntasRespuestas(){
        return preguntaRespuestaRepository.findAll();
    }

    public void guardarPreguntaRespuesta(PreguntaRespuestaModel preguntaRespuesta){
        preguntaRespuestaRepository.save(preguntaRespuesta);
    }


    public void eliminarPreguntaRespuestaPorId(String id){
        preguntaRespuestaRepository.deleteById(id);
    }
}