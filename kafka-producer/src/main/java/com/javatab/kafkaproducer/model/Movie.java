package com.javatab.kafkaproducer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Movie {

    private final Long id;
    private final String name;
    private final String yearOfRelease;
}
