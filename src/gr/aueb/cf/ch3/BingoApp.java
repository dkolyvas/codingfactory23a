package gr.aueb.cf.ch3;

import java.util.Scanner;

public class BingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET= 11;

        while(true){
            System.out.println("Please provide a number");
            num = in.nextInt();

            if (num == SECRET){
                System.out.println("Bingo!");
                break;
            } else{
                System.out.println("Please try again");
            }
        }
    }
}
