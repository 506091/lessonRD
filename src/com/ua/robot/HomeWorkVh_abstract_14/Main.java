package com.ua.robot.HomeWorkVh_abstract_14;

public class Main {
    public static void main(String[] args) {
        UniversityVisitors v1 = new UnknownVisitor(25, "Petro", "Petrovski");
        UniversityVisitors v2 = new UnknownVisitor(27, "Vasilii", "Pupkin");

        System.out.println(v1.status());
        System.out.println(v2.status());
        System.out.println(v1.toString());
        System.out.println(v2.toString());

    }
}
