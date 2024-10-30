package com.bitewisebitys.money_prime.repository;

import com.bitewisebitys.money_prime.domain.entity.Establishment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EstablishmentRepository extends JpaRepository<Establishment, Long> {

    Optional<Establishment> findEstablishmentByIdEstablishment(Long idEstablishment);
}
