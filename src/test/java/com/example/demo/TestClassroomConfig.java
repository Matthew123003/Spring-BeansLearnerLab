package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClassroomConfig {
    @Autowired
    private Classroom currentCohort;

    @Autowired
    private Classroom previousCohort;

    @Test
    public void testCurrentCohortBean() {
        Assert.assertNotNull(currentCohort);
        System.out.println("Current Cohort Classroom: " + currentCohort.toString());
    }

    @Test
    public void testPreviousCohortBean() {
        Assert.assertNotNull(previousCohort);
        System.out.println("Previous Cohort Classroom: " + previousCohort.toString());
    }
}
