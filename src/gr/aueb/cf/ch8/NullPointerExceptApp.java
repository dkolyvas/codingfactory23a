package gr.aueb.cf.ch8;

import org.w3c.dom.ls.LSOutput;

public class NullPointerExceptApp {

    public static void main(String[] args) {
        String s = null;
        if (s.equals("Coding")){
            System.out.println("Bingo");
        }

    }
}
