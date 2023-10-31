package com.sup.pix.repositories;

import com.sup.pix.domain.financial.institution.FinancialInstitution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.UUID;

public interface FinancialInstitutionRepository extends JpaRepository<FinancialInstitution, UUID> {
    UserDetails findByEmail(String email);
}
