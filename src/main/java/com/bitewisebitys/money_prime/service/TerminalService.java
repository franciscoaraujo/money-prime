package com.bitewisebitys.money_prime.service;

import com.bitewisebitys.money_prime.controllers.dtos.CreateCardResponseDTO;
import com.bitewisebitys.money_prime.controllers.dtos.CreatePOSTerminalRequestDTO;
import com.bitewisebitys.money_prime.controllers.dtos.CreatePOSTerminalResponseDTO;
import com.bitewisebitys.money_prime.domain.entity.PosTerminal;
import com.bitewisebitys.money_prime.repository.TerminalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TerminalService {

    @Autowired
    private TerminalRepository  terminalRepository;

    public CreatePOSTerminalResponseDTO registerTerminal(CreatePOSTerminalRequestDTO request) {
        PosTerminal terminal = PosTerminal.builder()
                .terminalCode(request.terminalCode())
                .location(request.location())
                .softwareVersion(request.softwareVersion())
                .captureMethod(request.captureMethod())
                .registrationDate(LocalDateTime.now())
                .build();
        terminalRepository.save(terminal);
        return new CreatePOSTerminalResponseDTO("Terminal registered successfully","200");
    }

    public PosTerminal findByTerminalById(Long aLong) {
        return terminalRepository.findTerminalByIdTerminal(aLong).orElseThrow();
    }
}
