package com.example.demo;

import java.util.List;

public class Instructor extends Person implements Teacher{

    public Instructor(String name){
        super(name);
    }
    @Override
    public void teach(Learner learner, Double numberOfHours) {
            learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / ((List<? extends Learner>) learners).size();
        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerLearner);
        }
    }
}
