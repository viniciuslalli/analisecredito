package com.lalli.analisecredito.service.strategy.impl;

import com.lalli.analisecredito.domain.Proposta;
import com.lalli.analisecredito.service.strategy.CalculoPonto;
import org.springframework.stereotype.Component;

@Component
public class PrazoPagamentoInferiorDezAnos implements CalculoPonto {

    @Override
    public int calcular(Proposta proposta) {
        return proposta.getPrazoPagamento() <= 120 ? 80 : 0;
    }
}
