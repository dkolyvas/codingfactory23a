package gr.aueb.cf.chapter5;

import java.util.Scanner;

public class EvenOddApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;


        System.out.println("Please type an integer number  ");
        n = in.nextInt();

        if (isEven(n)) {
            System.out.println(n + " is an even number");
        } else {
            System.out.println(n + " is an odd number");
        }
    }

    public static boolean isEven(int n)
    {

        return (n % 2 == 0);
    }
}
