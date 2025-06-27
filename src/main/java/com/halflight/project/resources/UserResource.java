package com.halflight.project.resources;

import com.halflight.project.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// Aqui é um criação de rotas.
@RestController
@RequestMapping(value = "/users")

public class UserResource {
    @GetMapping("/usuarios")
    public ResponseEntity<User> findALL() {
        User u =  new User(1L, "Maria", "mairia@gmail.com","64992486472","jv161820");
        return ResponseEntity.ok().body(u);
    }

}
