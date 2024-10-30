package com.bitewisebitys.money_prime.controllers.dtos;

import jakarta.persistence.Column;

public record CreateEstabelecimentoRequestDTO(
        String establishmentName,
        String establishmentCode,
        String mcc,
        String address
) {
}
