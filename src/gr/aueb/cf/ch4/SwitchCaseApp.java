package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 *Switch instead of if, else if....
 * Gets a users choice based on a menu
 */
public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nchoice= 0;

        do {
            System.out.println("Please select one oth the following");
            System.out.println("1. One player game");
            System.out.println("2. Two player game");
            System.out.println("3. Team game");
            System.out.println("4. Quit");
            System.out.println("");
            nchoice = in.nextInt();

            switch (nchoice){
                case 1:
                    System.out.println("Start one player game");
                    break;
                case 2:
                    System.out.println("Starting a two player game");
                    break;
                case 3:
                    System.out.println("Starting a team game");
                    break;
                case 4:
                    System.out.println("Quitting");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }

        }while (nchoice!=4);
        System.out.println("Goodbye");
    }
}
