package com.example.demo;

public interface Teacher {

    public void teach(Learner learner, Double numberOfHours);
    void lecture(Iterable<? extends Learner> learners, double numberOfHours);
}
