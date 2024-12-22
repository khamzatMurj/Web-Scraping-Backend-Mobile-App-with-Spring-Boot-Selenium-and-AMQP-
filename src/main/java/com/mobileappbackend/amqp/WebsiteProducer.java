package com.mobileappbackend.amqp;

import com.mobileappbackend.Config.RabbitMQConfig;
import com.mobileappbackend.Entities.website;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebsiteProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendWebsiteData(String websiteName) {
        rabbitTemplate.convertAndSend(
                RabbitMQConfig.EXCHANGE,
                RabbitMQConfig.WEBSITE_QUEUE,
                websiteName
        );
    }
}
