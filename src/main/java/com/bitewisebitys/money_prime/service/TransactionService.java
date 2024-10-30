package com.bitewisebitys.money_prime.service;

import com.bitewisebitys.money_prime.controllers.dtos.CreateTransactionRequestDTO;
import com.bitewisebitys.money_prime.controllers.dtos.CreateTransactionResponseDTO;
import com.bitewisebitys.money_prime.domain.entity.Transaction;
import com.bitewisebitys.money_prime.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private CardService cardService;

    @Autowired
    private TerminalService terminalService;

    @Autowired
    private EstablishmentService establishmentService;

    public CreateTransactionResponseDTO register(CreateTransactionRequestDTO dto) {
    try {
        // Validate input data
        if (dto == null || dto.idCard() == null || dto.idTerminal() == null || dto.idEstablishment() == null) {
            throw new IllegalArgumentException("Invalid input data");
        }

        Transaction transaction = Transaction.builder()
                .card(cardService.findByCardById(dto.idCard()))
                .terminal(terminalService.findByTerminalById(dto.idTerminal()))
                .establishment(establishmentService.findByEstablishmentById(dto.idEstablishment()))
                .totalAmount(dto.totalAmount())
                .codeTransaction(UUID.randomUUID())
                .currency(dto.currency())
                .transactionType(dto.transactionType())
                .installmentCount(dto.installmentCount())
                .transactionDate(LocalDateTime.now())
                .status(dto.status())
                .cryptogram(dto.cryptogram())
                .build();
        transactionRepository.save(transaction);

        return new CreateTransactionResponseDTO(UUID.randomUUID(), "Transaction created");
    } catch (IllegalArgumentException e) {
        // Handle invalid input data
        return new CreateTransactionResponseDTO(null, "Invalid input data: " + e.getMessage());
    } catch (Exception e) {
        // Handle other exceptions
        return new CreateTransactionResponseDTO(null, "An error occurred: " + e.getMessage());
    }
}
}
