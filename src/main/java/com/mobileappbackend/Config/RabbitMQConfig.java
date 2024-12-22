package com.mobileappbackend.Config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String WEBSITE_QUEUE = "website";
    public static final String DATASCRAPPED_QUEUE = "dataScrapped";
    public static final String EXCHANGE = "amq.direct";

    @Bean
    DirectExchange exchange() {
        return new DirectExchange(EXCHANGE);
    }

    @Bean
    Queue websiteQueue() {
        return new Queue(WEBSITE_QUEUE, true);
    }

    @Bean
    Queue dataScrappedQueue() {
        return new Queue(DATASCRAPPED_QUEUE, true);
    }

    @Bean
    Binding websiteBinding(Queue websiteQueue, DirectExchange exchange) {
        return BindingBuilder.bind(websiteQueue)
                .to(exchange)
                .with(WEBSITE_QUEUE);
    }

    @Bean
    Binding dataScrappedBinding(Queue dataScrappedQueue, DirectExchange exchange) {
        return BindingBuilder.bind(dataScrappedQueue)
                .to(exchange)
                .with(DATASCRAPPED_QUEUE);
    }
}
