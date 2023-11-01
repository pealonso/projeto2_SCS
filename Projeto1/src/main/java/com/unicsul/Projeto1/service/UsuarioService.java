package com.unicsul.Projeto1.service;

import com.unicsul.Projeto1.entity.Usuario;
import com.unicsul.Projeto1.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Transactional
    public Usuario salvar(Usuario usuario){

        return usuarioRepository.save(usuario);
    }
}
