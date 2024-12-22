//package com.mobileappbackend.amqp;
//
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Service;
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class RabbitMQReceiver {
//
//    private final List<String> messages = new ArrayList<>();
//
//    @RabbitListener(queues = RabbitMQConfig.DATASCRAPPED_QUEUE)
//    public void receiveMessage(String message) {
//        System.out.println("Received message: " + message);
//        messages.add(message);
//    }
//
//    public List<String> getMessages() {
//        return new ArrayList<>(messages);
//    }
//}
