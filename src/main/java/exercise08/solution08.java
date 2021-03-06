/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 8
 *  Copyright 2021 jesse lekwa
 */

package exercise08;

import java.util.Scanner;

public class solution08 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("How many people? "); // read
        int people=s.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizzas=s.nextInt(); //read pizzas
        System.out.print("How many slices per pizza? ");
        int slices=s.nextInt(); //read slices
        int total=slices*pizzas;
        System.out.println(people+" people with "+pizzas+" pizzas ("+total+" slices)");
        //display
        if(total/people==1)
        {//singular
            System.out.println("Each person gets "+total/people+" piece of pizza.");
            System.out.println("There are "+(total%people)+" leftover pieces.");
        }
        else
        {//plural
            System.out.println("Each person gets "+total/people+" pieces of pizza.");
            System.out.println("There are "+(total%people)+" leftover pieces.");
        }


    }
}
