package com.sup.pix.domain.financial.institution.dtos;

import com.sup.pix.domain.financial.institution.FinancialInstitution;
import com.sup.pix.domain.user.UserRole;

import java.util.UUID;

public record FinancialInstitutionResponseDTO(
        UUID id,
        String email,
        String corporateReason,
        String document
) {
    public FinancialInstitutionResponseDTO(FinancialInstitution financialInstitution){
        this(
                financialInstitution.getId(),
                financialInstitution.getEmail(),
                financialInstitution.getCorporateReason(),
                financialInstitution.getDocument()
        );
    }
}
