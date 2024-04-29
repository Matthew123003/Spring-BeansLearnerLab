package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudentConfig {
    @Autowired
    @Qualifier("students")
    private Students currentStudents;

    @Autowired
    private Students previousStudents;

    @Test
    public void testCurrentStudentsBean() {
        Assert.assertNotNull(currentStudents);
        System.out.println("Current Students: " + currentStudents.toString());
    }

    @Test
    public void testPreviousStudentsBean() {
        Assert.assertNotNull(previousStudents);
        System.out.println("Previous Students: " + previousStudents.toString());
    }
}
