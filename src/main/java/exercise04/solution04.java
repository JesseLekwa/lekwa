/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution 1
 *  Copyright 2021 jesse lekwa
 */


package exercise04;

import java.util.Scanner;
//prompt for noun,verb,adjective and adverb
//print all of them in a sentence
public class solution04 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter a noun: ");
        String noun = in.nextLine();

        System.out.println("Enter a verb: ");
        String verb = in.nextLine();

        System.out.println("Enter an adjective: ");
        String adjective = in.nextLine();

        System.out.println("Enter an adverb: ");
        String adverb = in.nextLine();

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");

    }
}
