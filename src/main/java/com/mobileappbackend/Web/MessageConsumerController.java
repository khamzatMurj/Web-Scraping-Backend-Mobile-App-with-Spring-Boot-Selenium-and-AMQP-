package com.mobileappbackend.Web;

import com.mobileappbackend.amqp.RabbitMQReceiver;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/consumed-messages")
@RequiredArgsConstructor
public class MessageConsumerController {

    private final RabbitMQReceiver rabbitMQReceiver;

    @GetMapping
    public String getConsumedMessages() {
        return rabbitMQReceiver.getMessages().toString();
    }
}
