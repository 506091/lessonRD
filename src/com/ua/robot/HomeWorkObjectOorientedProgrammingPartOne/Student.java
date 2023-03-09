package com.ua.robot.HomeWorkObjectOorientedProgrammingPartOne;

public class Student {

    private String name;

    private String surname;

    private String directionOfStudy;

    private int yearOfStudy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDirectionOfStudy() {
        return directionOfStudy;
    }

    public void setDirectionOfStudy(String directionOfStudy) {
        this.directionOfStudy = directionOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public Student() {

    }

    public Student(String name, String surname, String directionOfStudy, int yearOfStudy) {
        this.name = name;
        this.surname = surname;
        this.directionOfStudy = directionOfStudy;
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", directionOfStudy='" + directionOfStudy + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                '}';
    }
}
