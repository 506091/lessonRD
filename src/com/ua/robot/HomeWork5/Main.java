package com.ua.robot.HomeWork5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner FirstNumber = new Scanner(System.in);
        System.out.println("зміна А: ");
        int integerA = FirstNumber.nextInt();

        Scanner SecondNumber = new Scanner(System.in);
        System.out.println("зміна В: ");
        int integerB = SecondNumber.nextInt();

        Scanner ParityCheckNumber = new Scanner(System.in);
        System.out.println("Число для перевірки парності: ");
        int ParityCheck = ParityCheckNumber.nextInt();

        System.out.println("Ви ввели для порівняння наступні числа А і В: "+integerA+" 32"+integerB+";");
        System.out.println("Ваше число для перевірки парності: "+ParityCheck+";");
        System.out.println("----------------------------------------------------------------------------------");
        if (integerA > integerB) {
            System.out.println("число А більше числа В;");
        } else if ( integerA < integerB) {
            System.out.println("число B більше числа A;");

        } else {
            System.out.println("Вони рівні!");
        }
        if (ParityCheck % 2 == 0) {
            System.out.println("введене число парне");
        } else {
            System.out.println("введене число НЕ парне");
        }
        }
    }

