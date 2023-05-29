package gr.aueb.cf.ch4;

import java.io.IOException;

public class CharInputApp {
    public static void main(String[] args) throws IOException {
        char inputChar = ' ';

        System.out.println("Please inser and ASCII char");
        inputChar = (char) System.in.read();

        System.out.println("char: " + inputChar);

    }
}
