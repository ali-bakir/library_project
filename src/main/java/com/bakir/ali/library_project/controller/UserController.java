package com.bakir.ali.library_project.controller;

import com.bakir.ali.library_project.exception.ResourceNotFoundException;
import com.bakir.ali.library_project.model.User;
import com.bakir.ali.library_project.security.CurrentUser;
import com.bakir.ali.library_project.security.UserPrincipal;
import com.bakir.ali.library_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import static com.bakir.ali.library_project.repository.UserRepository.userRepository;

@RestController
@RequestMapping (value = "/users", produces = {MediaType.APPLICATION_JSON_VALUE})
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping ("/getUser")
    public ResponseEntity<User> getUser(Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @PostMapping
    public ResponseEntity<User> saveUSer(@RequestBody User user) {
        return ResponseEntity.ok(userService.saveUser(user));
    }

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}


