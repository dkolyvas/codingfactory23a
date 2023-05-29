package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LightsOnApp {

    /** Αποφασίζει αν πρέπει να ανάψουν τα φώτα
     * ενός αυτοκινήτου με βάση τρεις μεταβλητές
     * αν βρέχει και ταυτόχρονα ισχύει ένα τουλάχιστον
     * από τα επόμενα
     * είναι σκοτάδι
     * τρέχουμε με περισσότερο απο 100.
     * Τις τιμές αυτές τις λαμβάνουμε από τον χρήστη
     *
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightOn = false;

        System.out.println("Please insert if it's raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it's dark (true/false");
        isDark = in.nextBoolean();

        System.out.println("Please insert current speed (int)");
        speed = in.nextInt();

        isRunning = (speed>100);

        lightOn = isRaining && (isDark || isRunning);

        System.out.println("lights On : " + lightOn);
    }
}
