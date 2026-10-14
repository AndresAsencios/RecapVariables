package com.netflix;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Math {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = read.nextLine();
        System.out.println("What is your favorite color?");
        String favoriteColor = read.nextLine();
        System.out.println("What year did you start YearUp United?");
        String yearStarted = read.nextLine();
        System.out.println("What is your age?");
        int age = read.nextInt();
        System.out.println("I have read the name " + name);





        System.out.println("I am " + age + " years old.");




        System.out.println("Hi, I am " + name +", I am " + age + " years old" + ".");
        System.out.println("My favorite color is "+ favoriteColor  + ".");
        System.out.println("The year I started this program is " + yearStarted + "!");

    read.close();

    }


}
