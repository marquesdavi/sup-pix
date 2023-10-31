package com.sup.pix.controllers;

import com.sup.pix.repositories.FinancialInstitutionRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/financial-institution")
@Tag(name = "Financial Institution", description = "Financial institutions")
public class FinancialInstitutionController {
    private FinancialInstitutionRepository financialInstitutionRepository;

    @GetMapping("")
    public ResponseEntity getFinancialInstitutions(){
        return ResponseEntity.ok().body("");
    }
}
