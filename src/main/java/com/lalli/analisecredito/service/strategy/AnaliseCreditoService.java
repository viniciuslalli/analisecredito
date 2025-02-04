package com.lalli.analisecredito.service.strategy;

import com.lalli.analisecredito.domain.Proposta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnaliseCreditoService {

    @Autowired
    private List<CalculoPonto> calculoPontosList;

    public void analisar(Proposta proposta) {
        int pontuacao = calculoPontosList.stream()
                .mapToInt(impl -> impl.calcular(proposta)).sum();
    }
}
