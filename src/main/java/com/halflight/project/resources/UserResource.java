package com.halflight.project.resources;

import com.halflight.project.entities.User;
import com.halflight.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Aqui é um criação de rotas.
@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService service;
    @GetMapping
    public ResponseEntity<List<User>> findALL() {

        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
