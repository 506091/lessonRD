package com.ua.robot.HomeWorkOOP_PartThree;

public class Main {
    public static void main(String[] args) {

        People p1  = new People("Katya", 22);
        p1.showId();
        People p2 = new People("Maks", 23);
        p2.showId();
        People p3 = new People("Stasik", 55);
        p3.showId();

        System.out.println(p3.toString());
    }
}
