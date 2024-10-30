package com.bitewisebitys.money_prime.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transaction_log")
public class TransactionLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLog;

    @ManyToOne
    @JoinColumn(name = "id_transaction", nullable = false)
    private Transaction transaction;

    @Column(name = "event", nullable = false)
    private String event;

    @Column(name = "event_date", nullable = false)
    private java.time.LocalDateTime eventDate;

    @Column(name = "description")
    private String description;
}
