package dev.java10x.email.dto;

import java.util.UUID;

public record EmailResponse(
        UUID id,
        String subject,
        String body
) {
}
