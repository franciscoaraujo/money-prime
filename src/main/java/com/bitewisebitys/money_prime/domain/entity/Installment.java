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
@Table(name = "installment")
public class Installment {//Parcela

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInstallment;

    @ManyToOne
    @JoinColumn(name = "id_transaction", nullable = false)
    private Transaction transaction;

    @Column(name = "installment_number", nullable = false)
    private Integer installmentNumber;

    @Column(name = "installment_amount", nullable = false)
    private Double installmentAmount;

    @Column(name = "due_date", nullable = false)
    private java.time.LocalDate dueDate;

    @Column(name = "payment_status")
    private String paymentStatus;

    @Column(name = "payment_date")
    private java.time.LocalDate paymentDate;
}
