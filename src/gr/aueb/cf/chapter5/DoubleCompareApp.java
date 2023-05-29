package gr.aueb.cf.chapter5;

import java.util.Scanner;

public class DoubleCompareApp {

    /**
     * Ελέγχει ισότητα- ανισότητα στα floating points
     */

    public static void main(String[] args) {
        double d1 = 0.000;
        double d2 = 0.00;
        final double EPSILON = 0.005;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert two doubles");

        d1 = in.nextDouble();
        d2 = in.nextDouble();

        if (Math.abs(d2 - d1) <= EPSILON) {
            System.out.println("EQUAL");
        } else {
            System.out.println("Not Equal");
        }
    }
}
