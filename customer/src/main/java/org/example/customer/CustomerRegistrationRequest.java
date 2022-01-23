package org.example.customer;

import lombok.Setter;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
