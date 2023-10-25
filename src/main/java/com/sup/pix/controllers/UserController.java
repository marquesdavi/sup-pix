package com.sup.pix.controllers;

import com.sup.pix.domain.user.User;
import com.sup.pix.repositories.UserRepository;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;


import at.favre.lib.crypto.bcrypt.BCrypt;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public void sayHi(){
        System.out.println("hi");
    }

    @PostMapping("/")
    public ResponseEntity create(@RequestBody @NotNull User userModel) {
        UserDetails user = this.userRepository.findByEmail(userModel.getEmail());

        if (user != null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("The user you want to register already exists!");
        }

        var passwordHashed = BCrypt.withDefaults().hashToString(12, userModel.getPassword().toCharArray());
        //userModel.setPassword(passwordHashed);

        var userCreated = this.userRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(userCreated);
    }
}
