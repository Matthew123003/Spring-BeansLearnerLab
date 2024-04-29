package com.example.demo;

import java.util.List;

public class Instructors extends People<Instructor>{
    public Instructors(List<Instructor> instructors) {
        super(instructors);
    }

    public Instructors(Instructor... instructors) {
        super(instructors);
    }
}
