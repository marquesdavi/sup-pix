package com.sup.pix.controllers;

import com.sup.pix.domain.user.User;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transations")
@Tag(name = "Transations", description = "Transations Abstract")
public class TransationController {
//    @Autowired
//    private UserRepository userRepository;

    @GetMapping("/")
    public void sayHi(){
        System.out.println("hi");
    }

    @PostMapping("/payment")
    public ResponseEntity registerPayment(@RequestBody @NotNull User userModel) {
//        UserDetails user = this.userRepository.findByEmail(userModel.getEmail());
//
//        if (user != null){
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("The user you want to register already exists!");
//        }
//
//        var passwordHashed = BCrypt.withDefaults().hashToString(12, userModel.getPassword().toCharArray());
//        //userModel.setPassword(passwordHashed);
//
//        var userCreated = this.userRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("userCreated");
    }

    @PostMapping("/transfer")
    public ResponseEntity createTransfer(){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("userCreated");
    }
}
