package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
Υπολογίζει το a^n
 */
public class PowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a ;
        BigInteger n ; //αν χρησιμοποιήσω BigInteger αντί για int γλιτώνω το typecast
        BigInteger result = new BigInteger("1");

        System.out.println( "a^n: please insert a and n");
        a = BigInteger.valueOf(in.nextInt());
        n = BigInteger.valueOf(in.nextInt());

        for (int i = 1; i<=n.intValue(); i++){
            result = result.multiply(a);
        }
        System.out.printf("Result : %,d", result);
    }
}