package com.example.demo;

public class Student extends Person implements Learner{
    private Double totalStudyTime;

    public Student(String name) {
        super(name);
    }
    @Override
    public void learn(Double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime(){
        return totalStudyTime;
    }
}
