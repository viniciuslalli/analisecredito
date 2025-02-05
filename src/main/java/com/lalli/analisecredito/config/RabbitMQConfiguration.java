package com.lalli.analisecredito.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfiguration {

    @Bean
    public MessageConverter messageConverter() {
        ObjectMapper objectMapper = JsonMapper.builder().findAndAddModules().build();
        return new Jackson2JsonMessageConverter(objectMapper);
    }
}