package com.example.simplificado.dtos;

import java.math.BigDecimal;

import com.example.simplificado.domain.user.UserType;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email, String password, UserType userType) {

}
