package com.javatab.kafkaproducer;

import com.javatab.kafkaproducer.model.Movie;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SimpleProducer {

    private KafkaTemplate<String, Movie> simpleProducer;

    public SimpleProducer(KafkaTemplate<String, Movie> simpleProducer) {
        this.simpleProducer = simpleProducer;
    }

    public void send(Movie message) {
        simpleProducer.send("simple-message", message);
    }
}
