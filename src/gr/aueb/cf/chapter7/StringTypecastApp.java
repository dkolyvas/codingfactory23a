package gr.aueb.cf.chapter7;

import java.util.Scanner;

public class StringTypecastApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lexeme;
        int num;

        System.out.println("Please insert a number int");
        lexeme = in.next();

        num = Integer.parseInt(lexeme);

        System.out.println("Num is " + num);
    }
}
