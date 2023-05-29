package gr.aueb.cf.chapter7;

import java.util.Scanner;

public class StringInputApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s;

        System.out.println("Please provide a string");
        s=in.next(); //ends with white space: space, tab, new line
        //in.nextLine

        System.out.println(s);
    }
}
