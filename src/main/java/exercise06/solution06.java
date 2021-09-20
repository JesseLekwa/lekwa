/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 6
 *  Copyright 2021 jesse lekwa
 */

package exercise06;

import java.util.Calendar;
import java.util.Scanner;


public class solution06 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int current_year = Calendar.getInstance().get(Calendar.YEAR);


        System.out.print("What is your current age? ");
        int age = in.nextInt();

        System.out.print("At what age would you like to retire? ");
        int retire_age = in.nextInt();

        int years_left = retire_age - age;
        System.out.println("You have " + years_left + " years left until you can retire.");

        int retire_year = current_year + years_left;
        System.out.println("It's " + current_year +", so you can retire in " + retire_year + ".");

    }
}