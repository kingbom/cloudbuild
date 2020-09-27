package com.kingbom.cloudbuild;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class HelloWorld {

    @GetMapping(value = "/helloworld", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<Price> helloWorld() {
        return Flux.interval(Duration.ofMillis(500)).map(l -> new Price(System.currentTimeMillis(), ThreadLocalRandom.current().nextInt(100, 125)));
    }
}
