package com.ua.robot.HomeWorkObjectOorientedProgrammingPartOne;

public class Main {

    public static void main(String[] args) {
        Student studentJavaFirst = new Student("Andrii", "Bober", "Java", 1);
        Student studentJavaSecond = new Student("Pavlo", "Pupkin", "Java", 3);
        Student studentSecurity = new Student("Taras", "Lewandowski", "Network Scurity", 2);
        System.out.println(studentJavaFirst);
        System.out.println(studentJavaSecond);
        System.out.println(studentSecurity);

        System.out.println();

        Teacher teacherPatternsJava = new Teacher("Antonio", "Palamar", "Assistant Professor", 3);
        Teacher teacherNetworkSecurity = new Teacher("Serhii", "Lypka", "Professor", 15);
        System.out.println(teacherPatternsJava);
        System.out.println(teacherNetworkSecurity);

        System.out.println();

        arrayGenerator getArrayOf = new arrayGenerator(10);
        System.out.println("Масив = "+getArrayOf);

        getArrayOf.sortArrayByDescending();
        System.out.println("Масив від меншого до більшого = "+getArrayOf);

        getArrayOf.sortArrayByAscending();
        System.out.println("Масив від більшого до меншого = "+getArrayOf);


    }

}
