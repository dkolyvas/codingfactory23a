package gr.aueb.cf.chapter5;

public class ExpressionApp {

    public static void main(String[] args) {
        double num1 = 12.5;
        double num2 = 2.0;
        double result = 8.0;
        double mod = 0.0;

        result = num1/ num2;
        mod = num1 % num2;

        System.out.printf("Result of 12.5/2 is %.2f and mod is %.2f", result, mod);// %e επιστημονική μορφή %g συμπτυγμένη μορφή
    }
}
