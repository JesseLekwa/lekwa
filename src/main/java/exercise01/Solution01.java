/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution 1
 *  Copyright 2021 jesse lekwa
 */

package exercise01;

import java.util.Scanner;
//Create a program that prompts for your name and prints a greeting using your name.

//prompt user for name
//create string function
//print hello, users name and greeting.
public class Solution01 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is your name :");
        String name = in.nextLine();
        System.out.print("Hello, " + name + ", nice to meet you");

    }

}
