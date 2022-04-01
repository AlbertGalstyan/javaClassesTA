package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Try {
    public static void main(String[] args){
        String [] namearr = {"my", "name", "is", "Albert"};
        String [] myarr = {"welcome", "java", "world"};
        String elementToInsert = "to";
        int index = 1;
        int[] arrOne = {2, 5, 8, 6,78};
        int[] arrTwo = {4, 7, 5, 6,78};
        int[] arrOdOddAndEven = {23, 45, 2, 4, 3, 77, 89, 6};
        int[] subArray = {1,2,1,1,8,9,10};

        System.out.println (reversString("abcv"));
        arrayInsert(myarr,elementToInsert,index);
        dublicateNumbersInArray(arrOne, arrTwo);
        commonElementsInArray(arrOne, arrTwo);
        stringWithA(namearr);
        arrOddEven(arrOdOddAndEven);
        subarray(subArray);
    }
    // Write string reverse with recursion
    public static String reversString (String name){

        int lenght = name.length();
        if (name.length() == 1){
            return name;
        }else{
            return name.substring(lenght-1) + reversString(name.substring(0, lenght-1));
        }
    }


    // Method to insert element in specific position (array)
    public static  void arrayInsert (String [] arr, String element, int index ){
        String [] mynewarr = Arrays.copyOf(arr,arr.length+1);
        for (int i = mynewarr.length-1; i > index; i--) {
            mynewarr[i] = mynewarr[i-1];
        }
        mynewarr[index]= element;
        for (int i = 0; i < mynewarr.length; i++) {
            System.out.println(mynewarr[i]);
        }
    }

    // Find duplicate numbers in array
    public static void dublicateNumbersInArray (int []arrOne, int[]arrTwo){
        for (int i = 0; i < arrOne.length; i++) {
            for (int j = 0; j < arrTwo.length; j++) {
                if (arrOne[i] == arrTwo[j]){
                    System.out.println(arrOne[i]);
                }
            }
        }
    }

    // Find common element between two arrays (array of numbers)
    public static void commonElementsInArray (int []arrOne, int[]arrTwo){
        for (int i = 0; i < arrOne.length; i++) {
            for (int j = i; j <= i; j++) {
                if (arrOne[i] == arrTwo[j]){
                    System.out.println(arrOne[i]);
                }
            }
        }
    }

    // in Array of Strings find Strings starting with 'A'
    public static void stringWithA (String []namearr){
        char firstLetter = 'A';
        for (int i = 0; i < namearr.length; i++) {
            if (namearr[i].charAt(0) == firstLetter){
                System.out.println(namearr[i]);
            }
        }
    }

    // in Array of numbers, separate into array of odds, array of evens
    public static void arrOddEven (int [] arr){
        int [] oddsarr = Arrays.copyOf(arr, arr.length);
        int [] evensarr = Arrays.copyOf(arr, arr.length);
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                evensarr[evenIndex] = arr[i];
                evenIndex+=1;
            }else{
                oddsarr[oddIndex] = arr[i];
                oddIndex+=1;
            }
        }
        System.out.println("Array of Odds");
        for (int i = 0; i < oddIndex+1; i++) {
            System.out.println(oddsarr[i]);
        }
        System.out.println("Array of Evens");
        for (int i = 0; i < evenIndex+1; i++) {
            System.out.println(evensarr[i]);
        }
    }


    // Find longest sorted subarray in Array of numbers
    public static void subarray (int [] arr) {
        int counter = 0;

        int[] subarray = new int[arr.length];


        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] == -1) {

                subarray[i] = arr[i];
                subarray[i + 1] = arr[i + 1];

            }

        }

    }



}

