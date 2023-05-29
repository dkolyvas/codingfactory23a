package gr.aueb.cf.chapter5;

import java.util.Scanner;

public class FactorialApp {
    /**
    Υπολογίζει το n! με τη μέθοδο facto()
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;
        int n = 0;

        System.out.println("Please insert a small integer");
        n = in.nextInt();

        result = facto(n);

        System.out.printf("%d! is %,d", n, result);

    }

    public static int facto(int n){
        int factorial = 1;
        for (int i =1; i <= n; i++){
            factorial *=i;
        }
        return factorial;
    }
}
