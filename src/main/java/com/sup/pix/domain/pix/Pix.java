package com.sup.pix.domain.pix;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

public class Pix {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

}
