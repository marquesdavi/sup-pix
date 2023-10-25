package com.sup.pix.domain.financial.instition;

import com.sup.pix.domain.user.UserRole;

public record RegisterInstitutionDTO(
        String email,
        String password,
        String corporateReason,
        String document,
        UserRole role
) {
}
