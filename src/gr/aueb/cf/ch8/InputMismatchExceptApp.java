package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptApp {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int inputNum;
        final int MAGIC_NUM = 12;

        while (1 == 1) {
            try {
                System.out.println("Please type a number");

                inputNum = in.nextInt();

                if (inputNum == MAGIC_NUM) {
                    System.out.println("Great");
                    break;
                }
                System.out.println("Thanks for using the Magic App");
            } catch(InputMismatchException e){
                in.nextLine();
                System.out.println("Error. Please insert a valid number");
            }
        }
    }
}
