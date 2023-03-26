package com.ua.robot.HomeWork3;

import java.util.Scanner;
public class HW3 {

    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);
        System.out.println("Введіть зміну 'а': ");
        int aFromScannerA = scannerA.nextInt();

        Scanner scannerB = new Scanner(System.in);
        System.out.println("Введіть зміну 'b': ");
        int bFromScannerB = scannerB.nextInt();

        System.out.println("`a` додати `b` = " + (aFromScannerA + bFromScannerB));
        System.out.println("`a` відняти `b` = " + (aFromScannerA - bFromScannerB));
        System.out.println("`a` поділити на `b` = " + (aFromScannerA / bFromScannerB));
        System.out.println("`a` помножити на `b` = " + (aFromScannerA * bFromScannerB));

    }

}
