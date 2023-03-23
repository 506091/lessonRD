package com.ua.robot.List1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> tenElementsList = new ArrayList<>(); // через ArrayList бо тільки з 10 елемнтів і пам'яті має вистачити
        tenElementsList.add(1);
        tenElementsList.add(2);
        tenElementsList.add(3);
        tenElementsList.add(4);
        tenElementsList.add(5);
        tenElementsList.add(6);
        tenElementsList.add(7);
        tenElementsList.add(8);
        tenElementsList.add(9);
        tenElementsList.add(10);

        System.out.println(tenElementsList);

        LinkedList<Integer> twoMillionList = new LinkedList<>(); // LinkedList бо може не бути стільки вільної пам'яті в одному місці
        for (int i = 0; i < 2000000; i++){
            twoMillionList.add(i);
        }
        //System.out.println(twoMillionList);
        System.out.println("first element twoMillionList = " + twoMillionList.getFirst());
        System.out.println("last element twoMillionList = " + twoMillionList.getLast());

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("Petro", "Peterson", 19));
        studentArrayList.add(new Student("Ivan","Ivanchenkov", 22));

        System.out.println(studentArrayList);
        for (Student student : studentArrayList){
            System.out.println(student);
        }
    }
}
