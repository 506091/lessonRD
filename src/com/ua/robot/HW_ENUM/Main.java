package com.ua.robot.HW_ENUM;

public class Main {
    public static void main(String[] args) {
        DayOfWeek day1 = DayOfWeek.fromNumberOfDay(1);
        DayOfWeek day2 = DayOfWeek.fromNumberOfDay(2);
        DayOfWeek day3 = DayOfWeek.fromNumberOfDay(3);
        DayOfWeek day4 = DayOfWeek.fromNumberOfDay(4);
        DayOfWeek day5 = DayOfWeek.fromNumberOfDay(5);
        DayOfWeek day6 = DayOfWeek.fromNumberOfDay(6);
        DayOfWeek day7 = DayOfWeek.fromNumberOfDay(7);

        DayOfWeek day8 = DayOfWeek.fromNumberOfDay(8);
        if (day8 != null) {
            System.out.println(day8);
        } else {
            System.out.println("Invalid day number");
        }
        System.out.println("-+-+-+-+-+-+-");

        System.out.println(day1);
        System.out.println(day2);
        System.out.println(day3);
        System.out.println(day4);
        System.out.println(day5);
        System.out.println(day6);
        System.out.println(day7);
        System.out.println("----------------");


    }
}
