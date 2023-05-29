package gr.aueb.cf.chapter2;

import java.util.Scanner;

public class ThreeNumbersApp {

    /** Ζητάει από τον χρήστη τρεις ακέραιους
     * τους μειώνει κατά μία μονάδα και τους
     * εμφανίζει με την ίδια σειρά που δόθηκαν
     * αφήνοντας ένα κενό ανάμεσά τους
     */

    public static void main(String[] args) {
        int num1 = 0;
        System.out.println("please type three numbers");
        Scanner scanner = new Scanner(System.in);
        int num2 = 0;
        int num3 = 0;

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        num1 -= 1; /**ή και num1--*/
        num2--;
        num3--;

        System.out.printf("%d, %d %d", num1, num2, num3);
    }
}
