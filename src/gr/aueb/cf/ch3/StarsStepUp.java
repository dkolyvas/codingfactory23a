package gr.aueb.cf.ch3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Δίνουμε αρχή και step και εκτυπώνει αντίστοιχα αστεράκια
 */
public class StarsStepUp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int step =0;
        int i= 0;

        System.out.println("Please insert start, end and step");
        start = in.nextInt();
        end = in.nextInt();
        step = in.nextInt();
        i=start;

        while (i<=end){
            System.out.print("*");
            i = i + step;
        }
    }

}
