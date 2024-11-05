package com.mentory.spring.auth_service.client.dtos;

import lombok.*;

@Value
public class ValidateUserRequest {
    String username;
    String password;
}
