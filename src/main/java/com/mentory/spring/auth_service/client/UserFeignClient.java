package com.mentory.spring.auth_service.client;

import com.mentory.spring.auth_service.client.dtos.UserValidationResponse;
import com.mentory.spring.auth_service.client.dtos.ValidateUserRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "user-management-service", url = "http://localhost:8080")
public interface UserFeignClient {

    @PostMapping("/users/validate")
    UserValidationResponse validateUser(@RequestBody ValidateUserRequest validateUserRequest);
}
