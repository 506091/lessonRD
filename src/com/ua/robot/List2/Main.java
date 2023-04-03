package com.ua.robot.List2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Set<Integer> setOne = new HashSet<>();
        Set<Integer> setTwo = new HashSet<>();
        Set<Integer> setThree = new HashSet<>();

        ArrayList<Integer> test = new ArrayList<>();// для себе чи добре працює Рандом

        for (int i = 0; i < 1000; i++ ){
            Random random = new Random();
            int randomNumber = random.nextInt(0, 50);
            setOne.add(randomNumber);
            setTwo.add(randomNumber);
            setThree.add(randomNumber);
            test.add(randomNumber);// для себе чи добре працює Рандом
        }

        System.out.println("setOne");
        System.out.println(setOne);
        System.out.println();

        System.out.println("setTwo");
        System.out.println(setTwo);
        System.out.println();

        System.out.println("setThree");
        System.out.println(setThree);
        System.out.println();

        System.out.println(test);// для себе чи добре працює Рандом
    }
}
