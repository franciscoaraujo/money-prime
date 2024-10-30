package com.bitewisebitys.money_prime.repository;

import com.bitewisebitys.money_prime.domain.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

    Optional<Card> findCardByidCard(Long aLong);
}
