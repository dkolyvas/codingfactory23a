package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζει από το standard input το
 * start value το end value και το step
 * και εκτυπώνει το πλήθος των επαναλήψεων
 */
public class ForFlexApp {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int start = 0;
        int end= 0;
        int step = 0;
        int value = 0;

        System.out.println("Please provide start, end, step");;
        start = in.nextInt();
        end = in.nextInt();
        step = in.nextInt();
        for (int i = start; i<=end; i = i + step ){
            value++;
        }
        System.out.println("Number of iterations: " + value);
    }
}
