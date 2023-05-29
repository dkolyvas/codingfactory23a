package gr.aueb.cf.chapter2.exercises;

import java.util.Scanner;

public class DateApp {
    /**
     * Ο χρήστης εισάγει το έτος, το μήνα και την ημέρα και
     * το πρόγραμμα εμφανίζει την ημερομηνία σε μορφή
     * dd/mm/yy
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nDay = 0;
        int nMonth = 0;
        int nYear = 0;

        System.out.println("Please enter day:");
        nDay = in.nextInt();
        System.out.println("Please enter month: ");
        nMonth = in.nextInt();
        System.out.println("Please enter year: ");
        nYear = in.nextInt();
        nYear %= 100;

        System.out.printf("Selected date is %02d/%02d/%02d", nDay, nMonth, nYear);

    }
}
