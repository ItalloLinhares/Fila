package com.fila.fila.service;

import com.fila.fila.models.Usuario;
import com.fila.fila.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository ur;

    public Iterable<Usuario> list(){ return ur.findAll(); }


}
