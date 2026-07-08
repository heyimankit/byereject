package io.byereject.backend.auth.service;

import io.byereject.backend.auth.dto.RegisterRequest;
import io.byereject.backend.auth.dto.RegisterResponse;

public interface AuthService {

    RegisterResponse register(RegisterRequest request);

}