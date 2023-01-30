package com.ua.robot.HomeWork6;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        int i = 1;
        System.out.print("Від 1 до 10: ");
        for (; i <= 10; i++){
            System.out.print(i+" ");
        }
        System.out.println(' ');
        System.out.println("---------------------------------");

        int parityI = 1;
        System.out.print("Парні числа в діапазоні від 1 до 100: ");
        for (; parityI <= 100; parityI++){
            if (parityI % 2 == 0){
                System.out.print(parityI+" ");
            }
                    }
        System.out.println(' ');
        System.out.println("---------------------------------");

        int factorialI = 1;
        System.out.println("Факторіал числа 7(7!):");
        for (int fa = 2; fa <= 7; fa++){
            factorialI = factorialI * fa;
            System.out.println(factorialI);
        }
        System.out.println("---------------------------------");

        System.out.println("числа фібоначчі до 100:");
        int fib = 3;
        int fib1 = 1;
        int fib2 = 1;
        int fib3;

        System.out.print(fib1+" "+fib2+" ");
        for (; fib <= 11; fib++) {
            fib3 = fib1 + fib2;
            System.out.print(fib3 + " ");
            fib1 = fib2;
            fib2 = fib3;
        }
        System.out.println(' ');
        System.out.println("---------------------------------");
                          }
            }

