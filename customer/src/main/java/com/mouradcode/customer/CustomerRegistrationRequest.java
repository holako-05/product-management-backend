package com.mouradcode.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
