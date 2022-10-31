package com.rc.app.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.rc.app.Models.UsuarioPuntajeModel;
import com.rc.app.Services.UsuarioPuntajeService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/usuario-puntaje")
@RequiredArgsConstructor
public class UsuarioPuntajeController {
    private final UsuarioPuntajeService usuarioPuntajeService;

    @GetMapping()
    public List<UsuarioPuntajeModel> obtenerUsuariosPuntajes(){
        return this.usuarioPuntajeService.obtenerUsuariosPuntajes();
    }

    @PostMapping()
    public UsuarioPuntajeModel guardarUsuarioPuntaje(@RequestBody UsuarioPuntajeModel usuarioPuntaje){
        this.usuarioPuntajeService.guardarUsuarioPuntaje(usuarioPuntaje);
        return usuarioPuntaje;
    }

}