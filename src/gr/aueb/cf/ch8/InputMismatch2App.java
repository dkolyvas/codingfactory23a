package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch2App {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int inputNum;
        final int MAGIC_NUM = 12;

        while (true) {

            System.out.println("Please type a number");
            if (in.hasNextInt()) {
                inputNum = in.nextInt();

            } else {
                in.nextLine();
                System.out.println("Error. Please insert a valid number");
                continue;
            }

            if (inputNum == MAGIC_NUM) {
                System.out.println("Great");
                break;
            }

            System.out.println("Thanks for using the Magic App");

        }/**
        */
    }
}
