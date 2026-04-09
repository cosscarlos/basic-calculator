package com.pluralsight;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number: ");

        String number1 = reader.nextLine();
        System.out.println("Enter the second number: ");
        String number2 = reader.nextLine();
    }
}
