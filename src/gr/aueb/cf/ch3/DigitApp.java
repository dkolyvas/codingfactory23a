package gr.aueb.cf.ch3;

import java.util.Scanner;

public class DigitApp {
    /**
     * Υπολογίζει το άθροισμα των ψηφίων ενός ακεραίου και το άθροισμα του πρώτου ψηφίου και του τελευταίου
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count =0 ;
        int inputNum = 0;
        int num = 0;
        int sum = 0;
        int sumLeftRight = 0;
        int currentDigit = 0;
        int rightMost=0;

        System.out.println("Please insert a number");
        inputNum =  in.nextInt();

        num = inputNum;
        do {
            count++;
            num = num/10;
            sum += currentDigit;
            currentDigit = num %10;
            if (count ==1){
                rightMost = currentDigit;
            }
        } while (num !=0);

        sumLeftRight = currentDigit+ rightMost;

        System.out.println("Count: " + count);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of outer digits" + sumLeftRight);



    }
}
