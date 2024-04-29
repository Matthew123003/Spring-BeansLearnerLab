package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alumni {
    private Students previousStudents;
    private Instructors instructors;

    @Autowired
    public Alumni(Students previousStudents, Instructors instructors) {
        this.previousStudents = previousStudents;
        this.instructors = instructors;
    }

    @PostConstruct
    public void executeBootcamp() {
        double totalNumberOfHours = 1200;
        double numberOfHoursPerStudent = totalNumberOfHours / previousStudents.size();

        // Teach each student
        for (Student student : previousStudents) {
            student.learn(numberOfHoursPerStudent);
        }

        // Distribute hours evenly among instructors
        double numberOfHoursPerInstructor = totalNumberOfHours / instructors.size();
        for (Instructor instructor : instructors) {
            // Teach each student
            for (Student student : previousStudents) {
                instructor.teach(student, numberOfHoursPerInstructor);
            }
        }
    }

    public Students getPreviousStudents() {
        return previousStudents;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
