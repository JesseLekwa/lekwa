/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution 1
 *  Copyright 2021 jesse lekwa
 */


package exercise05;

import java.util.Scanner;
//prompt user for the first number
//prompt user for the second number
//write function for addition, subtraction, multiplication and division
//print output using the given numbers by user
public class solution05 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("What is the first number? ");
        String first= in.nextLine();

        System.out.println("What is the second number? ");
        String second = in.nextLine();

        int firstNumber = Integer.parseInt(first);
        int secondNumber = Integer.parseInt(second);

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber+ " = "+ addition + "\n" + firstNumber + " - " + secondNumber + " = " + subtraction + "\n" + firstNumber + " * " + secondNumber + " = " + multiplication + "\n" + firstNumber + " / " + secondNumber + " = " + division + "\n" );

    }
}
