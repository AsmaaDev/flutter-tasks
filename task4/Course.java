package com.example.hi;

public class Course {
    private String name;
    private String code;
    private int creditHours;

    public Course() {
        name = "course1";
        code = "code";
        creditHours = 1;
    }

    public void getCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
}
