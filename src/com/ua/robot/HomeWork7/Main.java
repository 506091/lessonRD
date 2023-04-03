package com.ua.robot.HomeWork7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enterNumberForHM = new Scanner(System.in);
        System.out.println("Введіть число для домашнього завдання №7: ");
        int universalNumber = enterNumberForHM.nextInt();

        Scanner enterYourSymbolForHM = new Scanner(System.in);
        System.out.println("Введіть бажаний символ для виведення на екран: ");
        String yourSymbol = enterYourSymbolForHM.nextLine();

        int coubOfNumbers = coubGivenNumber(universalNumber);
        System.out.println("Куб заданого числа -> "+coubOfNumbers); // Створити метод який повертає куб заданого числа

        System.out.print("Ваше число = кількості \"*\" -> ");
        StarsPrint(universalNumber); //Метод повинен вивести зірочку стільки разів, скільки передав користувач у метод
        System.out.println();

        System.out.print("Ваше число = кількості бажаного символу -> ");
        yourSymbolPrint(universalNumber, yourSymbol); //Метод повинен вивести переданий символ стільки разів, скільки передав користувач у метод
    }

    static int  coubGivenNumber(int a) {
    return  a*a*a;
    }

    static void StarsPrint(int a){
    for (int i = 0; i < a; i++){
        System.out.print("*");
        }
    }

    static void yourSymbolPrint(int a, String yourSymbolMet){
    for ( int i = 0; i < a; i++){
        System.out.print(yourSymbolMet);
    }
    }
}
