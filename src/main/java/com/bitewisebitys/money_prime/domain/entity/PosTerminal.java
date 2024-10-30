package com.bitewisebitys.money_prime.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pos_terminal")
public class PosTerminal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTerminal;

    @Column(name = "terminal_code", nullable = false)
    private String terminalCode;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "software_version", nullable = false)
    private String softwareVersion;

    @Column(name = "capture_method", nullable = false)
    private String captureMethod;

    @Column(name = "registration_date", nullable = false)
    private LocalDateTime registrationDate;
}
