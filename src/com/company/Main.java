package com.company;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        // read name, surname, weight, height, age, gender
        // if gender is invalid, then print invalid gender (man/women)
        // print HELLO With 'name'
        // print Hello with my lovely 'name' if name has 'a' letter
        // print something if name starts with 'I'

        // convert and print age from kg to pounds (1kg is 2.2 pounds)
        // generate code -> Name(first 3 digits UPPERCASE)-Surname(first 3 digits LOWECASE)-gender(MA/WM)-Age
        // print that code

        // compute BMI
        // 74 / (1,72)^2 ≈ 25,01
        // print perfect/not perfect according to BMI (man -> 20-30/ women -> 19-29)


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter name");
        String name = myObj.nextLine();

        System.out.println("Enter your Surname");
        String surname = myObj.nextLine();


        boolean checkheight = true;
        while (checkheight) {
            try {
                System.out.println("input your height");
                double height = myObj.nextDouble();
                System.out.println("your height is " + height);
                checkheight = false;
            } catch (InputMismatchException e) {
                System.out.println("Please enter only numbers");
                myObj.next();
            }

        }

        boolean check = true;
        while (check) {
            try {
                System.out.println("input your weight (kgs)");
                double weight = myObj.nextDouble();
                double weightPounds = weight * 2.2;
                System.out.println("your weight is " + weight + " kgs and " + weightPounds +" in pounds");
                check = false;
            } catch (InputMismatchException e) {
                System.out.println("Please enter only numbers");
                myObj.next();
            }

        }



        boolean checkage = true;
        while (checkage) {
            try {
                System.out.println("input your age");
                int age = myObj.nextInt();
                System.out.println("your age is " + age);
                checkage = false;
            } catch (InputMismatchException e) {
                System.out.println("Please enter only numbers");
                myObj.next();
            }

        }
        Scanner myobject = new Scanner(System.in);
        System.out.println("please enter your gender");
        boolean gendercheck = true;
        String gender = myobject.nextLine();

        if (gender.equals("men")){
            System.out.println("your gender is" + gender);
        }else if (gender.equals("women")){
            System.out.println("your gender is " + gender);
        }else
            System.out.println("invalid gender");

//        System.out.println(name.toUpperCase(Locale.ROOT).substring(0,3));









    }
}

