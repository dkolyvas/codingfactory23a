package gr.aueb.cf.ch3;

import java.util.Scanner;

public class AverageApp {
    /**
     * Βρίσκει το μέσο όρο μετά την πραγματοποίηση των ελέγχων
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total= 0;
        int count = 0;
        int average = 0;

        System.out.println("Please provide total grade and count");

        total = in.nextInt();
        count = in.nextInt();

        if (count <= 0){
            System.out.println("Invalid count");
            System.exit(1);
        }
        if (total <0){
            System.out.println("Invalid total");
            System.exit(1);
        }
        average = total / count;
        if (average >10){
            System.out.println("Invalid Data");
            System.exit(1);
        }

        if (average>=9) {
            System.out.println("Excellent!");
        } else if ( average>=7){
            System.out.println("Good!");
        } //κ.ο.κ.
    }
}
