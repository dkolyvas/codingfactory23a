package gr.aueb.cf.chapter2.exercises;

import java.util.Scanner;

public class FarenheitToCelsiusApp {
    /**
     * Ο χρήστης εισάγει μια θερμοκρασία σε Farenheit
     * και το πρόγραμμα τη μετατρέπει σε κελσίου
     * με βάση τον τύπο μετατροπής C=5*(F-32)/9
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tempF = 0;
        int tempC = 0;

        System.out.println("Please enter current temperature in Fahrenheit degrees: ");
        tempF = in.nextInt();
        tempC = 5 * (tempF - 32) / 9;

        System.out.printf("Current temperature is %d degrees Celsius", tempC);
    }
}
