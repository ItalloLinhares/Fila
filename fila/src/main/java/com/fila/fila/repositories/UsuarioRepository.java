package com.fila.fila.repositories;

import com.fila.fila.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
   }
