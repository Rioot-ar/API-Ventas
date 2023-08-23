package com.products.apip.Usuario;

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
    public void userCreate(@RequestBody Usuario user){
        userService.saveUser(user);
    }
    
    @PutMapping("/edit")
    public Usuario userEdit(@RequestBody Usuario user){
        userService.saveUser(user);
        return user;
    }
    
    @GetMapping("{id}")
     public Usuario findProyecto(@PathVariable long id) {
        return userService.findUser(id);
    }

    @DeleteMapping("delete/{id}")
    public Usuario brProyecto(@PathVariable long id){
        Usuario pro = userService.findUser(id);
        userService.deleteUser(id);
        return pro;
    }
}
