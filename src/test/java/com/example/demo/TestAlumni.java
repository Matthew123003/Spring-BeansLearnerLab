package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAlumni {
    @Autowired
    private Alumni alumni;

    @Test
    public void testAlumniBootcampExecution() {
        Students students = alumni.getPreviousStudents();
        Instructors instructors = alumni.getInstructors();

        double expectedNumberOfHoursPerStudent = 1200.0 / students.size();
        double expectedNumberOfHoursPerInstructor = 1200.0 / instructors.size();

        // Check if each student has been taught 1200 hours
        for (Student student : students) {
            Assert.assertEquals(expectedNumberOfHoursPerStudent, student.getTotalStudyTime(), 0.01);
        }

        // Check if each instructor has taught 1200 hours in total
        for (Instructor instructor : instructors) {
            double totalHoursTaught = 0;
            for (Student student : students) {
                totalHoursTaught += expectedNumberOfHoursPerInstructor;
            }
            Assert.assertEquals(expectedNumberOfHoursPerInstructor, totalHoursTaught, 0.01);
        }
    }
}
