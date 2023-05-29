package gr.aueb.cf.chapter7.exercises;

import java.util.Scanner;

public class EncryptApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;

            System.out.println("Please insert a string for encryption: ");

            str = in.nextLine();


            System.out.println("The encrypted string is " + encrypt(str));



    }

    public static String encrypt(String str){
        char[] strCharacters = str.toCharArray();
        String strEncrypted = "";
        for( int i =0; i < strCharacters.length; i++){
            strCharacters[i]++;
        }
        strEncrypted = String.copyValueOf(strCharacters);
        return strEncrypted;
    }
}
