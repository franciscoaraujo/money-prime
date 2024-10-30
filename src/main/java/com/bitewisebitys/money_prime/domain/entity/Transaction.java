package com.bitewisebitys.money_prime.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transaction")
public class Transaction {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idTransaction;

        @Column(name = "code_transaction", nullable = false)
        private UUID codeTransaction = UUID.randomUUID();

        @ManyToOne
        @JoinColumn(name = "id_card", nullable = false)
        private Card card;

        @ManyToOne
        @JoinColumn(name = "id_terminal", nullable = false)
        private PosTerminal terminal;

        @ManyToOne
        @JoinColumn(name = "id_establishment", nullable = false)
        private Establishment establishment;

        @Column(name = "total_amount", nullable = false)
        private Double totalAmount;

        @Column(name = "currency", nullable = false)
        private String currency;

        @Column(name = "transaction_type", nullable = false)
        private String transactionType;

        @Column(name = "installment_count", nullable = false)
        private Integer installmentCount;

        @Column(name = "transaction_date", nullable = false)
        private java.time.LocalDateTime transactionDate;

        @Column(name = "status", nullable = false)
        private String status;

        @Column(name = "cryptogram")
        private String cryptogram;
}
