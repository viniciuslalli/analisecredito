package com.lalli.analisecredito.service.strategy.impl;

import com.lalli.analisecredito.domain.Proposta;
import com.lalli.analisecredito.service.strategy.CalculoPonto;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Random;

@Order(2)
@Component
public class PontuacaoScoreImpl implements CalculoPonto {

    @Override
    public int calcular(Proposta proposta) {
        int score = score();

        if (score < 200) {
            throw new RuntimeException("Score baixo");
        } else if (score <= 400) {
            return 150;
        } else if (score <= 600) {
            return 180;
        } else {
            return 200;
        }
    }

    private int score() {
        // Aqui deveria verificar no serasa, spc, etc
        return new Random().nextInt(0, 1000);
    }
}
