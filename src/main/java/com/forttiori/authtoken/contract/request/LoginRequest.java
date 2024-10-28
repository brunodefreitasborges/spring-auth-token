package com.forttiori.authtoken.contract.request;

import lombok.Builder;

@Builder
public record LoginRequest(String username, String password) {
}
