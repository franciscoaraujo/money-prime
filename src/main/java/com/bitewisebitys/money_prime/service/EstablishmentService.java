package com.bitewisebitys.money_prime.service;

import com.bitewisebitys.money_prime.controllers.dtos.CreateEstabelecimentoRequestDTO;
import com.bitewisebitys.money_prime.controllers.dtos.CreateEstabelecimentoResponseDTO;
import com.bitewisebitys.money_prime.domain.entity.Establishment;
import com.bitewisebitys.money_prime.repository.EstablishmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstablishmentService {

    @Autowired
    private EstablishmentRepository establishmentRepository;

    public CreateEstabelecimentoResponseDTO createEstablishment(CreateEstabelecimentoRequestDTO dto) {
        Establishment establishment = Establishment.builder()
                .establishmentName(dto.establishmentName())
                .establishmentCode(dto.establishmentCode())
                .mcc(dto.mcc())
                .address(dto.address())
                .build();
        establishmentRepository.save(establishment);
        return new CreateEstabelecimentoResponseDTO(establishment.getEstablishmentCode(), "Estabelecimento criado com sucesso");
    }

    public Establishment findByEstablishmentById(Long idEstablishment) {
        return establishmentRepository.findEstablishmentByIdEstablishment(idEstablishment).orElseThrow();
    }
}
