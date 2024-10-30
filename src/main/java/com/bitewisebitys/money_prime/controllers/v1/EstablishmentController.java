package com.bitewisebitys.money_prime.controllers.v1;


import com.bitewisebitys.money_prime.controllers.dtos.CreateEstabelecimentoRequestDTO;
import com.bitewisebitys.money_prime.controllers.dtos.CreateEstabelecimentoResponseDTO;
import com.bitewisebitys.money_prime.service.EstablishmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/establishment")
public class EstablishmentController {

    @Autowired
    private EstablishmentService establishmentService;

    @Valid
    @PostMapping("/register")
    public ResponseEntity<CreateEstabelecimentoResponseDTO> createEstablishment(@Valid @RequestBody CreateEstabelecimentoRequestDTO dto) {
        CreateEstabelecimentoResponseDTO establishment = establishmentService.createEstablishment(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(establishment);
    }
}
