//package com.mobileappbackend.Web;
//
//import com.mobileappbackend.amqp.RabbitMQSender;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/messages")
//@RequiredArgsConstructor
//public class MessageController {
//
//    private final RabbitMQSender rabbitMQSender;
//
//
//    @PostMapping
//    public String sendMessage(@RequestParam String message) {
//        rabbitMQSender.sendMessage(message);
//        return "Message sent: " + message;
//    }
//}
