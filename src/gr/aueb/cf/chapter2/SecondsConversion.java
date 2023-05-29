package gr.aueb.cf.chapter2;

import java.util.Scanner;

public class SecondsConversion
{
    /** Μετατρέπει δευτερόλεπτα σε μέρες, ώρες, λεπτά, δευτερόλεπτα
     *
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputSecs = 0;
        int remainingSecs=0;
        int days = 0;
        int hours = 0;
        int mins = 0;
        int secs = 0;

        System.out.println("Please enter the number of total seconds");
        inputSecs = scanner.nextInt();

        remainingSecs = inputSecs;
        days = remainingSecs / (3600*24);
        remainingSecs = remainingSecs % (3600*24);
        hours = remainingSecs / 3600;
        remainingSecs %=3600;
        mins = remainingSecs / 60;
        remainingSecs %=60;
        secs = remainingSecs;

        System.out.printf("%,d seconds is equivalent to %d days, %d hours, %d minutes and %d seconds", inputSecs, days, hours, mins, secs);



    }
}
