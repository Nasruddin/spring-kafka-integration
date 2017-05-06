package com.nasir;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by nasir on 6/5/17.
 */
@Component
public class Sender {

    private AtomicInteger count = new AtomicInteger();

    private final KafkaTemplate<String, String> kafkaTemplate;

    public Sender(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Scheduled(fixedRate = 1000)
    public void sendMessages() {
        this.kafkaTemplate.send("topic-hello-world","message: " + this.count.getAndIncrement());
    }
}
