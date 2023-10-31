package com.sup.pix.repositories;

import com.sup.pix.domain.transation.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransferRepository extends JpaRepository<Transfer, UUID> {

}
