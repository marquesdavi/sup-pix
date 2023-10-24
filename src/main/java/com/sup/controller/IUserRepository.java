package com.sup.controller;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sup.dto.UserModel;

public interface IUserRepository extends JpaRepository<UserModel, UUID>{
    UserModel findByUsername(String username);
}