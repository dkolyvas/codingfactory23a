package gr.aueb.cf.ch4;

import java.util.Scanner;

public class FindTheSecretApp {
    /** Ο χρήστης έχει 10 ευκαιρίες να βρει ένα μυστικό κλειδι
     * Αν το βρει νωρίτερα από την 10η προσπάθεια κερδίζει
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET_KEY = 12;
        int num;
        boolean found = false;


        for (int i=1; i<=5; i++)
        {
            System.out.println("Please guess the secret number:");
            num = in.nextInt();
            if (num== SECRET_KEY) {
                found = true;
                break;}
            }
            if (!found){
                System.out.println("Failed!!");
                System.exit(1);
            }
        System.out.println("Bingo!");

    }
}
