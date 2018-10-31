package edu.khusaenov.service;


import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class User {

    private UUID userId;

    private String name;
}
