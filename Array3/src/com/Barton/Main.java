package com.Barton;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    private static int[] main(String[] args) {

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);


        public static int[] getIntegers = (int capacity) {

        }

            int[] array = new int[capacity];
            System.out.println("Enter " + capacity + " integer values: \r");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            return array;
        }


    private static int[] getIntegers(int i) {
        return new int[0];
    }
    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " content " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for(int i=0; i<array.length; i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            //element 0   50 50 and 160 swap
            //element 1   160
            //element 2   40

            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;

                }
            }
        }
        return sortedArray;
    }
}



