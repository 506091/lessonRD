package com.ua.robot.HomeWorkVh_abstract_14;

public class UnknownVisitor extends UniversityVisitors {

    private int age;
    private String name;
    private String surname;

    @Override
    public String status() {
        if (age <= 26){
            return "it`s a student";
        }
        else {}
        return "it`s a teacher";
    }

    public UnknownVisitor(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return  status()+"{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
