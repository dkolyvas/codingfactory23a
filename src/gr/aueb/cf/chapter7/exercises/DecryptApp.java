package gr.aueb.cf.chapter7.exercises;

import java.util.Scanner;

public class DecryptApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        System.out.println("Please insert a string for decryption: ");

        str = in.nextLine();

        System.out.println("The decrypted string is " + decrypt(str));
    }

    public static String decrypt(String str){
        char[] strCharacters = str.toCharArray();
        String strDecrypted = "";
        for( int i =0; i < strCharacters.length; i++){
            strCharacters[i]--;
        }
        strDecrypted = String.copyValueOf(strCharacters);
        return strDecrypted;
    }
}
