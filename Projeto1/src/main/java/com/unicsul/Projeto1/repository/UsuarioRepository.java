package com.unicsul.Projeto1.repository;

import com.unicsul.Projeto1.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
