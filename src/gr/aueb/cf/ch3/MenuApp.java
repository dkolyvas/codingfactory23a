package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuApp {
    /**Εμφανίζει επαναληπτικά ένα μενού επιλογών μέχρι ο χρήστης να επιλέξει έξοδο
     *
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        int i = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα  παρακάτω \n1. Εισαγωγή Προϊόντος \n2. Διαγραφή Προϊόντος \n3. Έξοδος") ;
            choice = in.nextInt();
        }while (choice !=3);
    }
}
