package com.ua.robot.HomeWorkObjectOorientedProgrammingPartOne;

public class Teacher {

    private String name;

    private String surname;

    private String titleOfTeacher;

    private int yearsOfProfessionalExperience;

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

    public String getTitleOfTeacher() {
        return titleOfTeacher;
    }

    public void setTitleOfTeacher(String titleOfTeacher) {
        this.titleOfTeacher = titleOfTeacher;
    }

    public int getYearsOfProfessionalExperience() {
        return yearsOfProfessionalExperience;
    }

    public void setYearsOfProfessionalExperience(int yearsOfProfessionalExperience) {
        this.yearsOfProfessionalExperience = yearsOfProfessionalExperience;
    }

    public Teacher() {
    }

    public Teacher(String name, String surname, String titleOfTeacher, int yearsOfProfessionalExperience) {
        this.name = name;
        this.surname = surname;
        this.titleOfTeacher = titleOfTeacher;
        this.yearsOfProfessionalExperience = yearsOfProfessionalExperience;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", titleOfTeacher='" + titleOfTeacher + '\'' +
                ", yearsOfProfessionalExperience=" + yearsOfProfessionalExperience +
                '}';
    }
}