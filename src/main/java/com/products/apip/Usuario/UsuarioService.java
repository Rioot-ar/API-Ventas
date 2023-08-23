package com.products.apip.Usuario;

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
