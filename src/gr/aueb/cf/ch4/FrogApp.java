package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ένας μικρός βάτραχος θέλει να περάσει ένα ποτάμι
 * Ο frog βρίσκεται στη θέση x και θέλει
 * να φτάσει στη θέση y (ή σε θέση μεγαλύτερη από το Y. o
 * Ο frog jumps a fixed distance  D
 * Το πρόγραμμα θα βρει το ελάχιστο αρθμό αλμάτων
 * που ο βάτραχος πρέπει να κάνει ώστε να φτάσει στον στόχο του
 * Για παράδειγμα αν έχουμε X= 10, Y=85 D=30
 * τότε ο βάτραχος θα χρειαστεί τρία άλματα
 */
public class FrogApp {
    public static void main(String[] args) {
        int nx = 0;
        int ny = 0;
        int nd = 0;
        int distance = 0;
        int jumps = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert current position, oposite shore position and jump length");
        nx = in.nextInt();
        ny = in.nextInt();
        nd = in.nextInt();

        distance = Math.abs((nx-ny));

        for (int i = 0; i<distance; i= i+nd ){
            jumps++;
        }

        System.out.println("Jumps required = " + jumps);

    }
}
