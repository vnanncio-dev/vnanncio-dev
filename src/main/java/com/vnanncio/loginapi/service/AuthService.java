package com.vnanncio.loginapi.service;

import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Base64;
import java.util.Map;

@Service
public class AuthService {

    private final Map<String, String> users = Map.of(
            "vinicius", "123456",
            "admin", "admin123"
    );

    public String login(String username, String password) {
        String storedPassword = users.get(username);
        if (storedPassword == null || !storedPassword.equals(password)) {
            throw new IllegalArgumentException("Usuário ou senha inválidos");
        }

        String rawToken = username + ":" + Instant.now().toEpochMilli();
        return Base64.getUrlEncoder().withoutPadding()
                .encodeToString(rawToken.getBytes(StandardCharsets.UTF_8));
    }
}
