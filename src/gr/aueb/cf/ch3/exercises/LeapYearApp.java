package gr.aueb.cf.ch3.exercises;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει το έτος και η εφαρμογή
 * υπολογίζει αν είναι δίσεκτο ή όχι
 */
public class LeapYearApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nYear = 0;
        boolean leapYear = false;

        System.out.println("Please insert year");
        nYear = in.nextInt();

        if (nYear % 4 ==0 ){
            leapYear = true;
            if (( nYear % 100 ==0) && (nYear % 400 != 0)){
                leapYear = false;
            }
        }

        System.out.println("Year " + nYear + " is a leap year: " +leapYear);



    }
}
