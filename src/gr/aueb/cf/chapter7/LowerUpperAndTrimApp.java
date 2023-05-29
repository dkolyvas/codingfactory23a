package gr.aueb.cf.chapter7;

import java.util.Locale;



public class LowerUpperAndTrimApp {

    public static void main(String[] args) {
        String s = "Athens University of";
        String lowerCase;
        String upperCase;
        String trimmed;
        String s2="";

        lowerCase = s.toLowerCase();
        upperCase = s.toUpperCase();
        trimmed = s.trim();

        System.out.println(trimmed);
       //System.out.println("*", .repeat(10));

        if(s2.isEmpty()){
            System.out.println(s2.length());
        }
    }

}
