package com.ua.robot.lesson4;

public class main {
    public static void main(String[] args) {
        String str = new String("hello world Volod");
        String strTwo = "izi string varik";

        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(6)); // який символ знаходиться за певнив індексом 6 = w;

        int lenth = str.length(); // присвоює зміній значення яке рівне довжині, починаючи з 0
        int lastIndex = lenth - 1;

        System.out.println(str.charAt(lastIndex));
        System.out.println("довжина зміної str: " + lenth);

        System.out.println(str.substring(5));
        System.out.println(str.indexOf("o"));

    }
}
