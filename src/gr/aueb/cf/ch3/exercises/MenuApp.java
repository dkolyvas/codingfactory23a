package gr.aueb.cf.ch3.exercises;

import java.util.Scanner;

/**
 Εμφανίζει το μενού 1.Insert 2. Delete
 3. Update 4. Search 5.Exit και ζητάει από τον χρήστη να θέσει μια επιλογή
 Ανάλογα με την επιλογή του χρήστη εμφανίζει το μενού που
 ζήτησε
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int selection = 0;



        do {
            System.out.println("Please select one of the following");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            selection = in.nextInt();
            if (selection == 1) {
                System.out.println("Your choice is: 1. Insert");
            } else if (selection == 2) {
                System.out.println("Your choice is: 2. Delete ");
            } else if (selection == 3) {
                System.out.println("Your choice is: 3. Update");
            } else if (selection == 4) {
                System.out.println("Your choice is: 4. Search");
            } else if (selection == 5) {
                System.out.println("Your choice is: 5. Exit");
            } else {
                System.out.println("Invalid choice");
            }
        } while (selection != 5);
        System.out.println("Goodbye");

    }
}