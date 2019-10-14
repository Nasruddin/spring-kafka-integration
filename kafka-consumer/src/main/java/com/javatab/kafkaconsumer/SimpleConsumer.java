package com.javatab.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SimpleConsumer {
    @KafkaListener(id = "simple-consumer", topics = "simple-message")
    public void consumeMessage(String message) {
        System.out.println("Got message: " + message.toString());
    }
}