package com.lalli.analisecredito.service.strategy.impl;

import com.lalli.analisecredito.domain.Proposta;
import com.lalli.analisecredito.service.strategy.CalculoPonto;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Random;

@Order(1)
@Component
public class NomeNegativadoImpl implements CalculoPonto {

    @Override
    public int calcular(Proposta proposta) {
        if (nomeNegativado()) {
            throw new RuntimeException("Nome negativado");
        }
        return 100;
    }

    private boolean nomeNegativado() {
        // Aqui deveria verificar no serasa, spc, etc
        return new Random().nextBoolean();
    }
}
