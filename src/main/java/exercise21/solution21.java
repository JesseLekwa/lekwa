/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 21
 *  Copyright 2021 jesse lekwa
 */

package exercise21;

import java.util.Scanner;

public class solution21{
    static class NumbersToName{
        public String getMonth(int month){
            return switch (month) {
                case 1 -> "January";
                case 2 -> "Febuary";
                case 3 -> "March";
                case 4 -> "April";
                case 5 -> "May";
                case 6 -> "June";
                case 7 -> "July";
                case 8 -> "August";
                case 9 -> "September";
                case 10 -> "October";
                case 11 -> "November";
                case 12 -> "December";
                default -> "error";
            };
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            NumbersToName ntn = new NumbersToName();
            System.out.print("Please enter the number of month: ");
            int month = sc.nextInt();
            String result = ntn.getMonth(month);
            if (month > 0 && month < 12)
                System.out.print("The name of month is " + result);
            else
                System.out.print(result + " :please enter correct month number");
        }

        }

}
