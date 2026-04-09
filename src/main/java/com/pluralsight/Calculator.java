package com.pluralsight;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // Adding the first number
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = reader.nextInt();

        // adding the second number
        System.out.println("Enter the second number: ");
        int number2 = reader.nextInt();

        //making the operation and displaying results
        int result = number1 * number2;
        System.out.println("The multiplication of these numbers is: " + result);


    }
}
