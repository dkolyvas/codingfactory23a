package gr.aueb.cf.chapter2;

import java.util.Scanner;

public class MaxOfThreeInts {
    /** Βρίσκει τον μεγαλύτερο α;
     * πό τρεις αριθμούς
     *
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 =0;
        int num2 = 0;
        int num3 = 0;
        System.out.println("Please insert three numbers");

        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        System.out.printf(" Max between %d, %d,%d is %d", num1, num2, num3, Math.max(num1, Math.max(num2, num3)));


    }
}
