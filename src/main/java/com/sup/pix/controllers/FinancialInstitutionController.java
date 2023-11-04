package com.sup.pix.controllers;

import com.sup.pix.domain.financial.institution.dtos.FinancialInstitutionResponseDTO;
import com.sup.pix.repositories.FinancialInstitutionRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/financial-institution")
@Tag(name = "Financial Institution", description = "Financial institutions")
public class FinancialInstitutionController {
    @Autowired
    private FinancialInstitutionRepository financialInstitutionRepository;

    @Operation(summary = "List all the Financial Institutions", security = @SecurityRequirement(name = "bearerAuth"))
    @GetMapping("/list")
    public ResponseEntity getFinancialInstitutions(){
        List<FinancialInstitutionResponseDTO> finInst =
                this.financialInstitutionRepository.findAll().stream().map(FinancialInstitutionResponseDTO::new).toList();

        return ResponseEntity.ok(finInst);
    }

    @Operation(summary = "Gets the Financial Institution details", security = @SecurityRequirement(name = "bearerAuth"))
    @GetMapping("/{id}")
    public ResponseEntity getFinancialInstitutionDetails(@PathVariable UUID id){
        var data = financialInstitutionRepository.findById(id);

        return ResponseEntity.ok(data);
    }

}
