package com.products.apip.service;

import com.products.apip.repository.UsuarioRepository;
import com.products.apip.entity.Usuario;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    
    private final UsuarioRepository usuarioRepo;

    public void saveUser(Usuario user){
        usuarioRepo.save(user);
    }
    
    public Usuario findUser(long id) {
        return usuarioRepo.findById(id).orElse(null);
    }
    
     public void deleteUser(long id) {
        usuarioRepo.deleteById(id);
    }
}
