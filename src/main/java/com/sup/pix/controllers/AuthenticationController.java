package com.sup.pix.controllers;

import com.sup.pix.domain.financial.instition.FinancialInstitution;
import com.sup.pix.domain.user.AuthenticationDTO;
import com.sup.pix.domain.user.LoginResponseDTO;
import com.sup.pix.domain.user.RegisterDTO;
import com.sup.pix.domain.user.User;
import com.sup.pix.domain.financial.instition.RegisterInstitutionDTO;

import com.sup.pix.infra.security.TokenService;
import com.sup.pix.repositories.FinancialInstitutionRepository;
import com.sup.pix.repositories.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private FinancialInstitutionRepository financialInstitutionRepository;
    @Autowired
    private TokenService tokenService;

    @PostMapping("/login/user")
    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO data){
        var usernamePassword = new UsernamePasswordAuthenticationToken(data.email(), data.password());
        var auth = this.authenticationManager.authenticate(usernamePassword);

        var token = tokenService.generateToken((User) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDTO(token));
    }

    @PostMapping("/register/user")
    public ResponseEntity register(@RequestBody @Valid RegisterDTO data){
        if(this.userRepository.findByEmail(data.email()) != null) return ResponseEntity.badRequest().build();

        String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
        User newUser = new User(
                data.email(),
                encryptedPassword,
                data.firstName(),
                data.lastName(),
                data.document(),
                data.role()
        );

        this.userRepository.save(newUser);

        return ResponseEntity.ok().build();
    }

    @PostMapping("/register/institution")
    public ResponseEntity registerInstitution(@RequestBody @Valid RegisterInstitutionDTO data){
        if(this.financialInstitutionRepository.findByEmail(data.email()) != null) return ResponseEntity.badRequest().build();

        String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
        FinancialInstitution newUser = new FinancialInstitution(
                data.email(),
                encryptedPassword,
                data.corporateReason(),
                data.document(),
                data.role()
        );

        this.financialInstitutionRepository.save(newUser);

        return ResponseEntity.ok().build();
    }
}
