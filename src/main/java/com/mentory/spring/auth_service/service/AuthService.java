package com.mentory.spring.auth_service.service;


import com.mentory.spring.auth_service.client.dtos.ValidateUserRequest;
import com.mentory.spring.auth_service.vos.AuthValidationResponse;

public interface AuthService {


    AuthValidationResponse generateToken(ValidateUserRequest validateUserRequest);
}
