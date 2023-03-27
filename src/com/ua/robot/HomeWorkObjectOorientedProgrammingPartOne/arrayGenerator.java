package com.ua.robot.HomeWorkObjectOorientedProgrammingPartOne;

import java.util.Random;

public class arrayGenerator {

    private int [] arr = null;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public arrayGenerator(int sizeArr) {
        createNewArray(sizeArr);
    }

    private void createNewArray(int size){
        arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(10, 100);
        }

    }

    public void sortArrayByDescending(){
        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    public void sortArrayByAscending(){
        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < arr.length; i++){
            temp = temp + arr[i] + " ";
        }return temp;
    }
}