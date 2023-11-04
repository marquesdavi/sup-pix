package com.sup.pix.domain.key;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Key {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private UUID user_id;
}
