package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestInstructorConfig {
    @Autowired
    private Instructors tcUsaInstructors;

    @Autowired
    private Instructors tcUkInstructors;

    @Autowired
    private Instructors instructors;

    @Test
    public void testTcUsaInstructorsBean() {
        Assert.assertNotNull(tcUsaInstructors);
        System.out.println("Tech Connect USA Instructors: " + tcUsaInstructors.toString());
    }

    @Test
    public void testTcUkInstructorsBean() {
        Assert.assertNotNull(tcUkInstructors);
        System.out.println("Tech Connect UK Instructors: " + tcUkInstructors.toString());
    }

    @Test
    public void testInstructorsBean() {
        Assert.assertNotNull(instructors);
        System.out.println("All Instructors: " + instructors.toString());
    }
}
