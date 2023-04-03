package com.ua.robot.HomeWork22StreamApiLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Students> studentsList = new ArrayList<>();
        studentsList.add(new Students("Dmytro", 4.6));
        studentsList.add(new Students("Semen", 4.3));
        studentsList.add(new Students("Ivan", 5.0));
        studentsList.add(new Students("Pavel", 3.8));
        studentsList.add(new Students("Serhii", 3.9));
        studentsList.add(new Students("Alex", 4.0));

        System.out.println("оригінальний список");
        studentsList.forEach(System.out::println);
        System.out.println("список після сортування за іменем");
//        for (Students students : studentsList.stream().sorted((o1, o2) -> o1.getStudentName().compareTo(o2.getStudentName())).toList()) {
//            System.out.println(students);
//        }
        List<Students> sortedByList = studentsList.stream().sorted(Comparator.comparing(Students::getStudentName)).toList();
        sortedByList.forEach(System.out::println);

        System.out.println("список після сортування за середнім балом");

        List<Students> sortedByAverage = studentsList.stream().sorted(Comparator.comparing(Students::getAverageGrade).reversed()).toList();
        sortedByAverage.forEach(System.out::println);


    }
}
