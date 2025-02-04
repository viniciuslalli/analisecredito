package com.lalli.analisecredito.service.strategy.impl;

import com.lalli.analisecredito.domain.Proposta;
import com.lalli.analisecredito.service.strategy.CalculoPonto;

import java.util.Random;

// servico do BACEN
public class OutrosEmprestimosEmAndamentos implements CalculoPonto {

    @Override
    public int calcular(Proposta proposta) {
        return outrosEmprestimosEmAndamento() ? 0 : 80;
    }

    private boolean outrosEmprestimosEmAndamento() {
        // Aqui deveria verificar no BACEN
        return new Random().nextBoolean();
    }
}
