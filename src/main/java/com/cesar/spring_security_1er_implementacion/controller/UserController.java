package com.cesar.spring_security_1er_implementacion.controller;

import com.cesar.spring_security_1er_implementacion.model.User;
import com.cesar.spring_security_1er_implementacion.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> crearUsuario (@RequestBody User user){
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/id")
    public ResponseEntity<User> verUsuarioPorId(@PathVariable Long id){
        return userService.getUser(id)
                .map(ResponseEntity::ok)
                .orElseGet(()->ResponseEntity.badRequest().build());
    }
}
