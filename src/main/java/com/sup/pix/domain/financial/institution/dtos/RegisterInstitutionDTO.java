package com.sup.pix.domain.financial.institution.dtos;

import com.sup.pix.domain.financial.institution.InstitutionRole;
import com.sup.pix.domain.user.UserRole;

public record RegisterInstitutionDTO(
        String email,
        String password,
        String corporateReason,
        String document,
        InstitutionRole role
) {
}
