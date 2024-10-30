package com.bitewisebitys.money_prime.controllers.v1;


import com.bitewisebitys.money_prime.controllers.dtos.CreateTransactionRequestDTO;
import com.bitewisebitys.money_prime.controllers.dtos.CreateTransactionResponseDTO;
import com.bitewisebitys.money_prime.service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/register")
    public ResponseEntity<CreateTransactionResponseDTO> register (@Valid @RequestBody CreateTransactionRequestDTO dto) {
        CreateTransactionResponseDTO register = transactionService.register(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(register);
    }
}
