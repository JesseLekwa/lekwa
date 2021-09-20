/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 22
 *  Copyright 2021 jesse lekwa
 */

package exercise22;

import java.util.Scanner;

public class solution22 {
    public static void main(String[] args)
    {
        int FirstNumber, SecondNumber, ThirdNumber;//declare variables
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        FirstNumber = s.nextInt();
        System.out.print("Enter the second number:");
        SecondNumber = s.nextInt();
        System.out.print("Enter the third number:");
        ThirdNumber = s.nextInt();

        if(FirstNumber==SecondNumber || SecondNumber==ThirdNumber || ThirdNumber==FirstNumber){
            System.out.println("Terminated Program");
        }

        else if(FirstNumber > SecondNumber && FirstNumber > ThirdNumber)
        {
            System.out.println("Largest number is:"+FirstNumber);
        }

        else if(SecondNumber > ThirdNumber)
        {
            System.out.println("Largest number is:"+SecondNumber);
        }

        else
        {
            System.out.println("Largest number is:"+ThirdNumber);
        }

    }
}
