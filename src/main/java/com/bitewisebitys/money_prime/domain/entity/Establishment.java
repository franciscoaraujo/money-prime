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
@Table(name = "establishment")
public class Establishment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstablishment;

    @Column(name = "establishment_name", nullable = false)
    private String establishmentName;

    @Column(name = "establishment_code", nullable = false)
    private String establishmentCode;

    @Column(name = "mcc", nullable = false)
    private String mcc;

    @Column(name = "address", nullable = false)
    private String address;
}
