package io.byereject.backend.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class RegisterResponse {

    private UUID id;

    private String firstName;

    private String lastName;

    private String email;

    private String message;
}