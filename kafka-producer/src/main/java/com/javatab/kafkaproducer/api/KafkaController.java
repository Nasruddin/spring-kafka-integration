package com.javatab.kafkaproducer.api;


import com.javatab.kafkaproducer.SimpleProducer;
import com.javatab.kafkaproducer.model.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaController {

    private SimpleProducer simpleProducer;

    public KafkaController(SimpleProducer simpleProducer) {
        this.simpleProducer = simpleProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody Movie message) {
        simpleProducer.send(message);
        return ResponseEntity.ok("Message received: " + message);
    }
}
