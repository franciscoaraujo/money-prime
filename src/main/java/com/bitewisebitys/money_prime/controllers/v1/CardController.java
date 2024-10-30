package com.bitewisebitys.money_prime.controllers.v1;

import com.bitewisebitys.money_prime.controllers.dtos.CreateCardRequestDTO;
import com.bitewisebitys.money_prime.controllers.dtos.CreateCardResponseDTO;
import com.bitewisebitys.money_prime.service.CardService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/card")
public class CardController {

    @Autowired
    private CardService cardService;

    /**
     * O cadastro de cartão deve ser servir para efeito de MVP apenas como um mock.
     *
     * @param dto
     * @return
     */
    @Valid
    @PostMapping("/register")
    public ResponseEntity<CreateCardResponseDTO> register(@Valid @RequestBody CreateCardRequestDTO dto) {
        CreateCardResponseDTO createCardResponseDTO = cardService.saveCard(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createCardResponseDTO);
    }
}
