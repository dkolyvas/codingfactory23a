package gr.aueb.cf.chapter2;

import java.util.Scanner;

public class SecondsApp {
    /** Διαβάζει ώρες λεπτά και δευτερόλεπτα και δίνει το σύνολο των δευτερολέπτων
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = 0;
        int mins = 0;
        int seconds = 0;
        int totalSeconds = 0;

        System.out.println("Εισάγετε τον αριθμό των ωρών, λεπτών και δευτερολέπτων");
        hours = scanner.nextInt();
        mins = scanner.nextInt();
        seconds = scanner.nextInt();

        totalSeconds = hours * 3600+ mins * 60 + seconds;

        System.out.printf( "%d hours, %d minutes and %d seconds equals to %,d seconds", hours, mins,    seconds,    totalSeconds);




    }
}
