package com.ua.robot.HomeWork4string;

import java.util.Scanner;

public class HomeWorkStringVH4 {

    public static void main(String[] args) {

        Scanner EnterString = new Scanner(System.in);
        System.out.println("Введіть текст для обробки: ");
        String MyHomeWorkString = EnterString.nextLine();
        System.out.println("Ваш текст: "+MyHomeWorkString);

        System.out.println("UpperCase: "+MyHomeWorkString.toUpperCase());
        System.out.println("LowerCase: "+MyHomeWorkString.toLowerCase());

        System.out.println("Перша літера/знак: "+MyHomeWorkString.charAt(0));

        int lenthMyString = MyHomeWorkString.length();
        int lastIndexMyString = lenthMyString - 1;

        System.out.println("Остання літера/знак: "+MyHomeWorkString.charAt(lastIndexMyString));

    }

}
