package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Λαμβάνει ένα βαθμό από τον χρήστη και δίνει
 * feedback με τη μορφή Excellent, Good, Very Good, Failed
 */
public class SwitchFallThrough {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade = 0;

        System.out.println("Please provide your grade");
        grade = in.nextInt();
        switch (grade){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Failed");
                break;
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very good");
                break;
            case 9:
            case 10:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }

    }
}
