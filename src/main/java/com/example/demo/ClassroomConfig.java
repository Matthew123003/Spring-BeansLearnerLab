package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {
    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors instructors, Students students) {
        // Create and return a Classroom object for the current cohort
        return new Classroom(instructors, students);
    }

    @Bean
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(Instructors instructors, Students previousStudents) {
        // Create and return a Classroom object for the previous cohort
        return new Classroom(instructors, previousStudents);
    }
}
