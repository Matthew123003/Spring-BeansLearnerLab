package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean(name = "students")
    public Students currentStudents() {
        // Create and return a Students object representing the current cohort of students
        return new Students(/* provide necessary arguments */);
    }

    @Bean
    public Students previousStudents() {
        // Create and return a Students object representing the previous cohort of students
        return new Students(/* provide necessary arguments */);
    }
}
