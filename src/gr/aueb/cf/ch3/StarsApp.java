package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εκτυπώνει όσα αστεράκια επιθυμεί ο χρήστης
 */
public class StarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stars= 0;
        int i = 1;

        System.out.println("Please insert number of stats: ");
        stars = in.nextInt();

        while (i<=stars){
            System.out.print("*");
            if (i%50==0){
                System.out.println();
            }
            i++;
        }
    }
}
