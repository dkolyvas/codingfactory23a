package gr.aueb.cf.chapter2;

import java.util.Scanner;

public class EuroToUsdConverterApp {
    /**Μετατρέπει ευρώ σε δολλάρια
     * Λαμβάνει από τον χρήστη ένα ακέραιο
     * που συμβολίζει το ποσό σε ευρώ
     * και μετατρέπει σε δολλάρια και εμφανίζει το τελικό αποτέλεσμα
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;


        System.out.println("Please insert an amount in Euros");;
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf(" %d euros = %d USA Dollars and %d cents", inputEuros, usaDollars, usaCents);

/**εναλλακτικά θα μπορούσα να είχα ορίσει με final int parity για την ισοτιμία
 *
 */

    }
}
