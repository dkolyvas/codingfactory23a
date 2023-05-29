package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το άθροισμα και
 * το γινόμενο των 10 πρώτων ακέραιων αριθμών
 */
public class SumAndMulApp {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        int i = 1;
        while (i<=10){
            sum = sum + i;
            mul  *= i;
            i++;
        }
        System.out.printf("Sum is %d, mul is %d", sum, mul);


    }
}
