package com.bakir.ali.library_project.controller;

import com.bakir.ali.library_project.model.User;
import com.bakir.ali.library_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (value = "/users", produces = {MediaType.APPLICATION_JSON_VALUE})
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping ("/getUser")
    public ResponseEntity<User> getUser(Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @PostMapping
    public ResponseEntity<User> saveUSer(@RequestBody User user) {
        return ResponseEntity.ok(userService.saveUser(user));
    }

}
