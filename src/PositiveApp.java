import java.util.Scanner;

public class PositiveApp {
    /** Μετράει το πλήθος των θετικών αριθμών που δίνει ο χρήστης
     *
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num =0;
        int positivesCount = 0;

        System.out.println("Please give a num (int)");;
        num = in.nextInt();

        while (num>=0){
            positivesCount++;
            System.out.println("Please give a num");
            num = in.nextInt();
        }

        System.out.println("Positive count is " + positivesCount);
    }
}
