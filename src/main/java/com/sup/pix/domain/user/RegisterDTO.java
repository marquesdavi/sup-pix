package com.sup.pix.domain.user;

import java.util.UUID;

public record RegisterDTO(
        String email,
        String password,
        String firstName,
        String lastName,
        UserIdentification document,
        UserRole role,
        UUID financialInstitutionId
) {
}
