package com.company;
import java.util.Random;
public class Main{




    public static void main(String[] args) {
        printCircleData(generateRandomNumber());
        printTriangleSidesSum(generateRandomNumber());
        checkIfFirstNumberIsBigger(generateRandomNumber());
        checkIfSumIsDivisibleByNumber(generateRandomNumber());
        computeSquaresAndRoot(generateRandomNumber());
        numbersAreEqual();
        allNumbersAreUnique();
        twoNumberAreEqual();
        threeCharactersAreEqual();
        generateRandomNumber();

    }

    public static int[] generateRandomNumber() {
        // Here we are generating a random number
        final int[] ints = new Random().ints(1, 100).distinct().limit(6).toArray();
        return (ints);

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

    public static void numbersAreEqual() {
        // having 6 number, print true if all number are equal
    }

    public static void allNumbersAreUnique() {
        // having 3 number, print true if all numbers are unique
    }

    public static void twoNumberAreEqual() {
        // having 3 numbers, print true if two number are equal
    }

    public static void threeCharactersAreEqual() {
        // having 4 characters, print true if 3 characters are same
    }
}