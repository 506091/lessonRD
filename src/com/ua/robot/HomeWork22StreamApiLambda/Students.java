package com.ua.robot.HomeWork22StreamApiLambda;

import java.util.Comparator;

public class Students {
    private String studentName;
    private double averageGrade;

    public Students(String studentName, double averageGrade) {
        this.studentName = studentName;
        this.averageGrade = averageGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentName='" + studentName + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }

}
