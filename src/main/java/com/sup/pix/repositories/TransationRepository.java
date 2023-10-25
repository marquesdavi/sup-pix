package com.sup.pix.repositories;

import com.sup.pix.domain.transation.Transation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransationRepository extends JpaRepository<Transation, UUID> {

}
