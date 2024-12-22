package com.mobileappbackend.Web;

import com.mobileappbackend.amqp.DataScrappedConsumer;
import com.mobileappbackend.amqp.*;
import com.mobileappbackend.amqp.WebsiteProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


//"Controller for handling messages"


@RestController
@RequestMapping("/api/messages")
@RequiredArgsConstructor
public class Test_Rabbit_MessageController {

//    private final RabbitMQSender rabbitMQSender;
//    private final RabbitMQReceiver rabbitMQReceiver;

    private final WebsiteProducer rabbitMQSender;
    private final DataScrappedConsumer rabbitMQReceiver;

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        rabbitMQSender.sendWebsiteData(message);
        return "Message sent: " + message;
    }

//    @GetMapping("/consume")
//    public String getConsumedMessages() {
//        return rabbitMQReceiver.consumeMessage("");
//    }
}
