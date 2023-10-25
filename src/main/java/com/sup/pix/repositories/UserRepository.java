package com.sup.pix.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sup.pix.domain.user.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, UUID>{
    UserDetails findByEmail(String email);
}