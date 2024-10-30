package com.bitewisebitys.money_prime.controllers.dtos;


import jakarta.validation.constraints.NotEmpty;

public record CreateCardRequestDTO(

        @NotEmpty
        String cardNumber,
        @NotEmpty
        String expirationDate,
        @NotEmpty
        String cvv,
        @NotEmpty
        String brand,
        @NotEmpty
        String cardholderName
) {}