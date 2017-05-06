package com.nasir;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created by nasir on 6/5/17.
 */
@Component
public class Receiver {

    @KafkaListener(topics = "topic-hello-world")
    public void consume(String message) {
        System.out.println("Received: " + message);
    }
}
