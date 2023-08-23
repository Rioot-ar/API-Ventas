package com.products.apip.controller;

import com.products.apip.service.UsuarioService;
import com.products.apip.entity.Usuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioService userService;

    @PostMapping("/create")
    public void createUser(@RequestBody Usuario user){
        userService.saveUser(user);
    }
    
    @PutMapping("/edit")
    public Usuario editUser(@RequestBody Usuario user){
        userService.saveUser(user);
        return user;
    }
    
    @GetMapping("{id}")
     public Usuario findUser(@PathVariable long id) {
        return userService.findUser(id);
    }

    @DeleteMapping("delete/{id}")
    public Usuario deleteUser(@PathVariable long id){
        Usuario pro = userService.findUser(id);
        userService.deleteUser(id);
        return pro;
    }
}
