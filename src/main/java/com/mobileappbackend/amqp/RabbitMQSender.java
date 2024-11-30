//package com.mobileappbackend.amqp;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class RabbitMQSender {
//
//    private final RabbitTemplate rabbitTemplate;
//
//    public void sendMessage(String message) {
//        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, message);
//        System.out.println("Message sent: " + message);
//    }
//}
