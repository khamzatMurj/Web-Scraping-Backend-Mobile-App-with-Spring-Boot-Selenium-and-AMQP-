package com.mobileappbackend.Web;

import com.mobileappbackend.amqp.RabbitMQReceiver;
import com.mobileappbackend.amqp.RabbitMQSender;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
@RequiredArgsConstructor
public class MessageController {

    private final RabbitMQSender rabbitMQSender;
    private final RabbitMQReceiver rabbitMQReceiver;

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        rabbitMQSender.sendMessage(message);
        return "Message sent: " + message;
    }

    @GetMapping("/consume")
    public String getConsumedMessages() {
        return rabbitMQReceiver.getMessages().toString();
    }
}
