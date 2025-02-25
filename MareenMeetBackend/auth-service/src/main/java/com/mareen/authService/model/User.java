package com.mareen.authService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String userName;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> roles;
    // Indicates whether the user has verified their email via OTP
    private boolean active;
    // Two-factor authentication flag
    private boolean twoFactorEnabled;
    // Optional phone number for two-factor authentication (Sri Lankan numbers)
    private String phoneNumber;
}
