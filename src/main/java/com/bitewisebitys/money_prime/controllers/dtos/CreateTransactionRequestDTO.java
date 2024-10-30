package com.bitewisebitys.money_prime.controllers.dtos;

import com.bitewisebitys.money_prime.domain.entity.Card;
import com.bitewisebitys.money_prime.domain.entity.Establishment;
import com.bitewisebitys.money_prime.domain.entity.PosTerminal;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

public record CreateTransactionRequestDTO(
        Long idTransaction,
        Long idCard,
        Long idTerminal,
        Long idEstablishment,
        Double totalAmount,
        String currency,
        String transactionType,
        Integer installmentCount,
        String status,
        String cryptogram
) {
}
