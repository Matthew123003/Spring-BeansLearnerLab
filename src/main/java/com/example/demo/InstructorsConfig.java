package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {
    @Bean
    public Instructors tcUsaInstructors() {
        // Create and return an Instructors object representing the Tech Connect USA instructors
        return new Instructors(/* provide necessary arguments */);
    }

    @Bean
    public Instructors tcUkInstructors() {
        // Create and return an Instructors object representing the Tech Connect UK instructors
        return new Instructors(/* provide necessary arguments */);
    }

    @Bean
    @Primary
    public Instructors instructors() {
        // Create and return an Instructors object representing all instructors employed at ZipCodeWilmington
        return new Instructors(/* provide necessary arguments */);
    }
}
