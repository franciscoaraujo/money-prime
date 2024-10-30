package com.bitewisebitys.money_prime.repository;

import com.bitewisebitys.money_prime.domain.entity.PosTerminal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TerminalRepository extends JpaRepository<PosTerminal, Long> {

    Optional<PosTerminal> findTerminalByIdTerminal(Long aLong);
}
