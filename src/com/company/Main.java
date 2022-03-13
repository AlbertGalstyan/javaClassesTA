package com.company;
import java.util.Random;
public class Main{




    public static void main(String[] args) {
        printCircleData(generateRandomNumber());
        printTriangleSidesSum(generateRandomNumber());
        checkIfFirstNumberIsBigger(generateRandomNumber());
        checkIfSumIsDivisibleByNumber(generateRandomNumber());
        computeSquaresAndRoot(generateRandomNumber());
        numbersAreEqual(generateRandomNumber());
        allNumbersAreUnique(generateRandomNumber());
        twoNumberAreEqual(generateRandomNumber());
        threeCharactersAreEqual();


    }

    public static int[] generateRandomNumber() {
        // Here we are generating a random number
        final int[] i = new Random().ints(1, 100).limit(6).toArray();
        return (i);
    }



    public static void printCircleData(int[] i) {
        // describe radius, compute area and perimeter (use Math.PI)
        int radius = i[0];
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Given the radius of the circle, we need to find the area and perimeter");
        System.out.println("Radius is = " + radius);
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
        System.out.println("--------------------------------------");


    }

    public static void printTriangleSidesSum(int[] i) {
        // describes sides and compute sides sum
        int[] nums = i;
        int sindeOne = nums[0];
        int sideTwo = nums[1];
        int sideThree = nums[2];
        int sum = sindeOne+ sideTwo+ sideThree;
        System.out.println("Given the lengths of three side of an triangle, we need to print sides sum");
        System.out.println("The lengths of triangle sides are " + sindeOne + " , " + sideTwo + " , "+ sideThree);
        System.out.println("The sum of triangle sides is " + sum);
        System.out.println("--------------------------------------");


    }

    public static void checkIfFirstNumberIsBigger(int[] i) {
        // describe two numbers, if first number if bigger print true
        int[] nums = i;
        int fn = nums[0];
        int ln = nums[1];
        System.out.println("Here we need to compare which of gove 2 number is bigger");
        System.out.println("first number is "+ fn);
        System.out.println("second number is "+ ln);

        if (fn > ln) {
            System.out.println("The first number is bigger " +fn+ " > " + ln);
        }
        else if (fn < ln){
            System.out.println("The second number is bigger " +fn+ " < " + ln);
        } else {
            System.out.println("They are equal");
        }
        System.out.println("--------------------------------------");
    }

    public static void checkIfSumIsDivisibleByNumber(int[] i) {
        // describe two numbers, multiply them, if result is divisible by 12 print true
        int num = i[0];
        int num1 = i[1];
        System.out.println("We shoukd check if First number is divisible by second number");
        System.out.println("First number is "+ num);
        System.out.println("Second number is "+ num1);
        if (num% num1 == 0) {
            System.out.println("First number is divisible by second number");

        }else
        {
            System.out.println("First number is NOT divisible by second number");
            System.out.println("--------------------------------------");
        }
    }

    public static void computeSquaresAndRoot(int[] i) {
        // compute square of number
        // compute root of number
        System.out.println("We should calculate the square and the root of number: "+ i[0]);
        double square = Math.pow(i[0],2);
        double root = Math.sqrt(i[0]);
        System.out.println("The square of our number is " +square+ " and the root is "+ root);
        System.out.println("--------------------------------------");


    }

    public static void numbersAreEqual(int[] i) {
        // having 6 number, print true if all number are equal
        System.out.println("Here we should compare SIX numbers and see if they are same or not");
        int check = i[0];
        int counter = 0;
        System.out.println("Comparing the first number with other five ones");
        for (int n = 1; n< i.length; n++) {
           System.out.println(check + " -> " + i[n]);
           if (check == i[n]) {
               counter++;
           }
       }
       if (counter == 5) {
           System.out.println("All nums are equal");
       }else {
           System.out.println("Nums are not equal");
       }
       System.out.println("--------------------------------------");

    }

    public static void allNumbersAreUnique(int[] i) {
        // having 3 number, print true if all numbers are unique
        System.out.println("Here we should compare Three numbers and see if they are ALL unique");
        int check = i[0];
        int counter = 0;
        System.out.println("Comparing the first number with other Two ones");
        for (int n = 1; n< 3; n++) {
            System.out.println(check + " -> " + i[n]);
            if (check != i[n]) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println("All nums are unique");
        }else {
            System.out.println("Nums are not unique");
        }
        System.out.println("--------------------------------------");

    }


    public static void twoNumberAreEqual(int[] i) {
        // having 3 numbers, print true if two number are equal
        System.out.println("Here we should compare Three numbers and see if two of them are equal");
        int check = i[0];
        int counter = 0;
        System.out.println("Comparing the first number with other Two ones");
        for (int n = 1; n< 3; n++) {
            System.out.println(check + " -> " + i[n]);
            if (check != i[n]) {
                counter++;
            }
        }
        if (counter == 1) {
            System.out.println("Two of nums are equal");
        }else {
            System.out.println("All numbers are unique");
        }
        System.out.println("--------------------------------------");
    }

    public static void threeCharactersAreEqual() {
        // having 4 characters, print true if 3 characters are same
        System.out.println("Here we should compare four chars and see if three of them are equal");
        char[] cl = {'/', '/', 'v', '/'};
        int index = 0;
        int counter = 0;
        System.out.println("Comparing the first char with other ones");
        for (int i = 1; i < cl.length; i++) {
            System.out.println(cl[index] + " -> " + cl[i]);
            if (cl[index] == cl[i]) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println("3 chars are Equal");
        }else {
            System.out.println("3 chars are NOT equal");
        }

    }
}