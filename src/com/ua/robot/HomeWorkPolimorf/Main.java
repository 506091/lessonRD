package com.ua.robot.HomeWorkPolimorf;

public class Main {
    public static void main(String[] args) {

        Human h1 = new Driver("Petro", "Petrevych", 23);
        Human h2 = new Pilot("Vasyl", "Vasylevych", 29);
        Human h3 = new Pilot("Ihor", "Ihorchenko", 33);

        System.out.println(h1);
        System.out.println(h1.driving());
        System.out.println(h1.flying());
        System.out.println("-------------------------------------------");
        System.out.println(h2);
        System.out.println(h2.driving());
        System.out.println(h2.flying());
        System.out.println("-------------------------------------------");
        System.out.println(h3);
        System.out.println(h3.driving());
        System.out.println(h3.flying());

    }

}
