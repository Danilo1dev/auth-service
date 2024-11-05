package com.mentory.spring.auth_service.vos;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthValidationResponse {
    private String token;
}
