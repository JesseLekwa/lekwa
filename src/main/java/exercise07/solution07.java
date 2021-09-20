/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 7
 *  Copyright 2021 jesse lekwa
 */


package exercise07;

import java.util.Scanner;

public class solution07 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {Scanner sc = new Scanner(System.in);

        System.out.println("What is the length of the room in feet?");
        double length=sc.nextDouble();
        System.out.println("What is the width of the room in feet?");
        double width=sc.nextDouble();
        System.out.println("You entered dimension of "+length+" by "+width+" feet");


        double area=length*width;
        final double conversionFactor=area*0.09290304;


        System.out.println("The area is");
        System.out.println(area+" square feet");
        System.out.println(conversionFactor+" square meters");
    }
}
