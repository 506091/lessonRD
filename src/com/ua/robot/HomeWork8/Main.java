package com.ua.robot.HomeWork8;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] arrHW = arrTenElements(10);
        System.out.println(Arrays.toString(arrHW));

//        for (int i = 0; i < arrHW.length; i++){
//            System.out.print(arrHW[i]+" ");
//            }
        System.out.println();

        int maxArr = getMaxArr(arrHW);
        System.out.println("Максимальне значення в масиві: "+maxArr);

        int minArr = getMinArr(arrHW);
        System.out.println("Мінімальне значення в масиві: "+minArr);

        int sumArr = getSum(arrHW);
        System.out.println("Сума усіх елементів масиву: "+sumArr);

        double averageArr = getAverageArr(arrHW, sumArr);
        System.out.println("Середнє значення з усіх елементів масиву: "+ averageArr);

    }


    static  int [] arrTenElements(int yourLength){
        int [] arrHW = new int[yourLength];
        Random random = new Random();
        for (int i = 0; i < arrHW.length; i++){
            arrHW[i] = random.nextInt(10,100);
        } return arrHW;
    }

    static int getMaxArr(int[] inputArray){
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        } return maxValue;
    }

    static int getMinArr(int[] inputArray){
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++){
            if (inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        } return minValue;
    }

    static int getSum(int[] inputArray){
        int sumArr = 0;
        for (int i = 0; i < inputArray.length; i++){
            sumArr += inputArray[i];
        }return sumArr;
    }

    static double getAverageArr(int[] inputArray, int sumArr){
        return (double) sumArr / inputArray.length;
    }

}
