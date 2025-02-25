package com.mareen.authService.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String userName;
    @NotBlank
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;
    // Optional: phone number for future two-factor authentication
    private String phoneNumber;
}
