package com.bitewisebitys.money_prime.service;

import com.bitewisebitys.money_prime.controllers.dtos.CreateCardRequestDTO;
import com.bitewisebitys.money_prime.controllers.dtos.CreateCardResponseDTO;
import com.bitewisebitys.money_prime.domain.entity.Card;
import com.bitewisebitys.money_prime.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    public CreateCardResponseDTO saveCard(CreateCardRequestDTO cardDTO) {
     Card card = Card.builder()
                .cardNumber(cardDTO.cardNumber())
                .expirationDate(cardDTO.expirationDate())
                .cvv(cardDTO.cvv())
                .brand(cardDTO.brand())
                .cardholderName(cardDTO.cardholderName())
                .build();
        cardRepository.save(card);
        return new CreateCardResponseDTO("Cartão cadastrado com sucesso", "200");
    }

    public Card findByCardById(Long aLong) {
        return cardRepository.findCardByidCard(aLong).orElseThrow();
    }
}
