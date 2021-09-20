/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution 1
 *  Copyright 2021 jesse lekwa
 */


package exercise03;

import java.util.Scanner;
//prompt user for quote
//prompt user for author
//generate quote followed by "says" and author
public class solution03 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println(" What is the quote? ");
        String quote = in.nextLine();

        System.out.println(" Who said that? ");
        String person = in.nextLine();

        System.out.println(person + " says, " + "\"" + quote + "\"");

    }
}
