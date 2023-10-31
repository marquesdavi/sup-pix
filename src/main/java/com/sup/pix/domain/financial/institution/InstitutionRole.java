package com.sup.pix.domain.financial.institution;

public enum InstitutionRole {
    ADMIN("admin"),
    INSTITUTION("institution");

    private String role;

    InstitutionRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
