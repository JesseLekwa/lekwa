/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 9
 *  Copyright 2021 jesse lekwa
 */

package exercise09;

import java.util.Scanner;

public class solution09 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scanner object
        double sqFeetPerGallon = 350;
        System.out.print("Enter length: ");
        double length = sc.nextDouble(); //take length from user
        System.out.print("Enter width: ");
        double width = sc.nextDouble(); //take width from user
        double totalSq = length*width; //calculate total squre
        int gallon = (int)Math.ceil(totalSq/sqFeetPerGallon); //calculate number of gallon
        System.out.println("You will need to purchase "+gallon+" of paint to cover "+totalSq+" squre feet");
    }
}
