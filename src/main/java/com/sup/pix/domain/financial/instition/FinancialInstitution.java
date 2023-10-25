package com.sup.pix.domain.financial.instition;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import com.sup.pix.domain.user.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Table(name = "financial_instituition")
@Entity(name = "financial_instituition")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class FinancialInstitution implements UserDetails {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true, name = "email")
    private String email;
    @Column(name = "corporate_reason")
    private String corporateReason;
    @Column(name = "password")
    private String password;
    private UserRole role;

    @Column(name = "document")
    private String document;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    public FinancialInstitution(
            String email,
            String password,
            String corporateReason,
            String document,
            UserRole role
    ){
        this.email = email;
        this.corporateReason = corporateReason;
        this.password = password;
        this.document = document;
        this.role = role;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (this.role == UserRole.ADMIN) {
            return List.of(
                    new SimpleGrantedAuthority("ROLE_ADMIN"),
                    new SimpleGrantedAuthority("ROLE_USER")
            );
        } else return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

