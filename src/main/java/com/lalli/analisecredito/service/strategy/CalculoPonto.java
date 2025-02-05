package com.lalli.analisecredito.service.strategy;


import com.lalli.analisecredito.domain.Proposta;

public interface CalculoPonto {

    int calcular(Proposta proposta);
}