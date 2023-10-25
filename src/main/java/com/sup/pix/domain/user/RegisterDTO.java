package com.sup.pix.domain.user;

public record RegisterDTO(
        String email,
        String password,
        String firstName,
        String lastName,
        UserIdentification document,
        UserRole role
) {
}
