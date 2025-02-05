package com.lalli.analisecredito.listener;

import com.lalli.analisecredito.domain.Proposta;
import com.lalli.analisecredito.service.AnaliseCreditoService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropostaPendenteListener {

    private AnaliseCreditoService analiseCreditoService;

    public PropostaPendenteListener(AnaliseCreditoService analiseCreditoService) {
        this.analiseCreditoService = analiseCreditoService;
    }

    @RabbitListener(queues = "${rabbitmq.queue.proposta.pendente}")
    public void propostaPendente(Proposta proposta) {
        analiseCreditoService.analisar(proposta);
    }
}
