package com.bitewisebitys.money_prime.controllers.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;

public record CreatePOSTerminalRequestDTO(
        @NotEmpty
        String terminalCode,
        @NotEmpty
        String location,
        @NotEmpty
        String softwareVersion,
        @NotEmpty
        String captureMethod
) {}
