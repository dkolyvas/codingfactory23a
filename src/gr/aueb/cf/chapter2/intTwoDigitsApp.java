package gr.aueb.cf.chapter2;

import java.util.Scanner;

public class intTwoDigitsApp {
    /**Ο χρήστης δίνει ένα διψήφιο ακέραιο
     * και βρίσκουμε το άθροισμα των δύο ψηφίων
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int leftDigit =0 ;
        int rightDigit = 0;
        int sumOfDigits =0;

        System.out.println("Please insert a two digit number");;
        num = in.nextInt();
        leftDigit = num / 10;
        rightDigit = num % 10;

        sumOfDigits = leftDigit + rightDigit;

        System.out.printf(" The sum of the two digits is %d", sumOfDigits);
    }
}
