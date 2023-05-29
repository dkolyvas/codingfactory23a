package gr.aueb.cf.ch4;

import java.util.Scanner;

public class ExerciseStars {
    /**
     * ο χρήστης εισάγει έναν ακέραιο αριθμό n
     * και το πρόγραμμα εκτυπώνει
     * α) n αστεράκια
     * β) n αστεράκια σε κάθετη διάταξη
     * γ) n x n αστεράκια
     * δ) από 1 έως n αστεράκια
     * ε) από n έως 1 αστεράκια
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nStars = 0;

        System.out.println("Please insert number of stars: ");
        nStars = in.nextInt();

        System.out.println("1. printing " + nStars + " horizontal stars...");

        for (int i=1; i <= nStars; i++){
            System.out.print("*");
        }
        System.out.print("\n\n");

        System.out.println("2. printing " + nStars + " vertical stars...");

         for (int i = 1; i <=nStars; i++){
             System.out.println("*");
        }

        System.out.print("\n\n");

        System.out.println("3. printing " + nStars +  " rows of " + nStars + " stars...");

        for (int i =1 ; i <= nStars; i++) {
            for (int j = 1; j <= nStars; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.print("\n\n");

        System.out.println("4. printing " + nStars +  " rows of stars from 1 to " + nStars +"...");

        for (int i =1 ; i <= nStars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.print("\n\n");

        System.out.println("5. printing " + nStars +  " rows of stars from " + nStars + " to 1..." );

        for (int i = nStars ; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
