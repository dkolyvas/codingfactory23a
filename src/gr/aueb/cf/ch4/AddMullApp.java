package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Προσθέτει και πολλαπλασιάζε
 * n πρώτους ακεραίους
 * όπου το n το δίνει ο χρήστης
 */
public class AddMullApp {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;
        int result = 1;

        System.out.println("Please insert a number");
        n = in.nextInt();

        for (int i = 1; i<=n; i++){
            sum = sum + i;
            result = result * i;
        }

        System.out.println("Sum is " + sum);
        System.out.printf("Mul is %,d" , result);
    }
}
