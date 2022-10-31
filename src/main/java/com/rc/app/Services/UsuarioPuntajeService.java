package com.rc.app.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rc.app.Models.UsuarioPuntajeModel;
import com.rc.app.Repositories.UsuarioPuntajeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioPuntajeService {  
    private final UsuarioPuntajeRepository usuarioPuntajeRepository;

    public List<UsuarioPuntajeModel> obtenerUsuariosPuntajes(){
        return usuarioPuntajeRepository.findAll();
    }
    
    public void guardarUsuarioPuntaje(UsuarioPuntajeModel usuarioPuntaje){
        usuarioPuntajeRepository.save(usuarioPuntaje);
    }


    public void eliminarUsuarioPuntajePorId(String id){
        usuarioPuntajeRepository.deleteById(id);
    }
}
