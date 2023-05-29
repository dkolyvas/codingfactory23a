package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρίσκει το min και το max
 * δύο αριθμών που παρέχει ο χρήστης
 */
public class MinMaxApp {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int min = 0;
        int max = 0;
        System.out.println("Please provide two numbers");
        num1= in.nextInt();
        num2 = in.nextInt();

        if (num1<num2){
            min = num1;
            max = num2;
        } else if (num1>num2){  //τριπλή διακλάδωση
            min = num2;
            max = num1;}
            else {min = num1;
                max = num1;
            System.out.println("Numbers are equal");}


    }


}
