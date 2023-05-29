package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δείχνει τη χρήση των break, continue
 */
public class BreakContinueApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (true){
            System.out.println("insert a num: ");
            num = in.nextInt();
            if (num == 5){
                continue;}// η continue παραλείπει όλα τα παρακάτω και επιστρέφει στην αρχή του loop
            sum += num;

            if (num== 10) {
                break;}
            }
        System.out.println("Sum: "+ sum);
        }


}
