package com.bitewisebitys.money_prime.controllers.v1;

import com.bitewisebitys.money_prime.controllers.dtos.CreatePOSTerminalRequestDTO;
import com.bitewisebitys.money_prime.controllers.dtos.CreatePOSTerminalResponseDTO;
import com.bitewisebitys.money_prime.service.TerminalService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/pos-terminal")
public class TerminalController {

    @Autowired
    private TerminalService terminalService;

    @Valid
    @PostMapping("/register")
    public ResponseEntity<CreatePOSTerminalResponseDTO> register(@Valid @RequestBody CreatePOSTerminalRequestDTO dto) {
        CreatePOSTerminalResponseDTO createPOSTerminalResponseDTO = terminalService.registerTerminal(dto);
        return  ResponseEntity.status(HttpStatus.CREATED).body(createPOSTerminalResponseDTO);
    }
}
