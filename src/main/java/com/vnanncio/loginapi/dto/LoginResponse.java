package com.vnanncio.loginapi.dto;

public record LoginResponse(
        String token,
        String message
) {
}
