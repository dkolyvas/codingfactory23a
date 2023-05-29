package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζει έναν char με scanner
 */
public class CharScannerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar;

        inputChar = in.next().charAt(0); //η charAt 0 επιλέγει απ' όσα πληκτρολόγησα μόνο το char

        System.out.println("Char: " + inputChar);
    }
}
