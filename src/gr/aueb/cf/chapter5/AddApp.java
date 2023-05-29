package gr.aueb.cf.chapter5;

import java.util.Scanner;

public class AddApp {
    /**
     * Προσθέτει δύο ακεραίους με τη χρήση της μεθόδου add
     *
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int sum = 0;

        System.out.println("Please provide two integers a, b");
        a = in.nextInt();
        b = in.nextInt();

        sum = add(a, b);

        System.out.printf("Result is %d", sum);

    }

    public static int add (int a, int b){
       /** int sum = 0;
        sum = a + b;
        return sum;*/
       return a + b;
    }
}
