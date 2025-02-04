package com.lalli.analisecredito.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Proposta {

    private Long id;

    private Double valorSolicitado;

    private int prazoPagamento;

    private Boolean aprovado;

    private boolean integrada;

    private String observacao;

    private Usuario usuario;
}
