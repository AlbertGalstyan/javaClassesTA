package com.company;

public class Main {

    public static void main(String[] args) {
        int [] arrWithPrimes = { 2, 3, 7, 11, 5, 8};
        int [] myarr = {12, 89, 78, 99, 12, 77, 3, 4 ,2};
        String [] mystring = {"Albert", "is", "name", "my" };
        int count = 100;

//        counterOfBigger(myarr);
//        ComputAveragOfArray(myarr);
//        ComputeMedianOfArray(myarr);
//        reversedString(mystring);
        printPrimeNumbers(count);
    }
    public static int counterOfBigger (int[] arr) {
        int checker = arr[0];
        for (int i = 1; i< arr.length; i++){
            if (arr[i]>checker){
                checker = arr[i];
            }
        }
        System.out.println(checker);
        return checker;
    }


    public static int ComputAveragOfArray (int[] arr) { //mijinna es
        int sum = arr[0];
        for (int i = 1; i< arr.length; i++) {
           sum += arr[i];
        }
        System.out.println(sum/arr.length);
        return sum/arr.length;
    }



    public static int ComputeMedianOfArray (int[] arr) {
        int arrlenght = arr.length;
        int middlenum;
        if(arr.length % 2 ==0){
             middlenum = arr[arrlenght/2] + arr[arrlenght/2-1];
        }else{
             middlenum = arr[arrlenght/2];
        }
        System.out.println(middlenum);
        return middlenum;

    }

    public static String[] reversedString (String[] mystring){
        String[] reversed = new String[mystring.length];
        int revlenght = reversed.length;
        int indexofreversed = 0;
        for (int i = mystring.length-1; i > -1 ; i--){
            reversed[indexofreversed] = mystring[i];
            indexofreversed++;
        }
        for (int i = 0; i<reversed.length; i++){
            System.out.println(reversed[i]);
        }

        return reversed;
    }


    public static int printPrimeNumbers (int count) {
        int i = 0;
        int counter = 0;
        loop:
            for (i = 0; i < count; i++) {
                if (i > 1 && i % i == 0 && i % 1 == 0 && i % 2 != 0 && i % 3 != 0) {
                    counter += 1;
                    System.out.println(i);
                    if (counter == 10){
                        break loop;
                    }
                    }
                }
        return i;
    }
}

